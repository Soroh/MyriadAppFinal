package com.myriad.christian.myriadapp.controllers;


import com.myriad.christian.myriadapp.models.Post;
import com.myriad.christian.myriadapp.service.MyriadService;
import com.myriad.christian.myriadapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class NewsFeedController {

    @Autowired
    private PostService postService;
    @Autowired
    private MyriadService myriadService;


//    public String currentUserName(Principal principal) {
//        return principal.getName();
//    }

    @RequestMapping(path = "/newsfeed/newsfeed",method = RequestMethod.POST)
    public @ResponseBody String  newsFeed(@RequestParam String message, @RequestParam Long myriadId){
        Post post = new Post(myriadService.findById(myriadId),LocalDateTime.now(),message,"0" );
        postService.savePost(post);

        ModelAndView model = new ModelAndView();
        List<Post> posts = postService.getAllPosts();
        model.addObject("posts",posts);
        model.setViewName("newsfeed/newsfeed");

        return "newsfeed/newsfeed";
    }

//    @RequestMapping("/newsfeed/newsfeed")
//    public String newsFeed(Model model){
//     //  / ModelAndView model = new ModelAndView();
////        List<Post> posts = postService.getAllPosts();
////        model.addAttribute("posts",posts);
//        return "newsfeed/newsfeed";
//
//    }
}
