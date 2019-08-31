package com.myriad.christian.myriadapp.controllers;

import com.myriad.christian.myriadapp.models.Myriad;
import com.myriad.christian.myriadapp.models.Post;
import com.myriad.christian.myriadapp.service.MyriadService;
import com.myriad.christian.myriadapp.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.function.Consumer;

@Controller
public class HomeController {
    @Autowired
    private MyriadService myriadService;
    @Autowired
    private PostService postService;


//    @RequestMapping("/")//home page
//    public String homePage(){
//               return "home/home-page";
//    }

//    @GetMapping(path = "/administrator/login")
//    public String login(){
//        return "pages/login";
//    }


    @RequestMapping(value = {"/user/feeds","/"})//when user logs in
    public ModelAndView login(@ModelAttribute Myriad user){
        String username;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
             username = ((UserDetails)principal).getUsername();
        } else {
             username = principal.toString();
        }

        ModelAndView modelAndView = new ModelAndView();
        Myriad myriad = myriadService.findByEmail(username).orElse(new Myriad());
        List<Post> posts = postService.getAllPosts();
        modelAndView.addObject("posts",posts);
        modelAndView.addObject("myriad",myriad);
        modelAndView.setViewName("newsfeed/newsfeed");

        return modelAndView;
    }

}
