package com.myriad.christian.myriadapp.controllers;

import com.myriad.christian.myriadapp.models.Myriad;
import com.myriad.christian.myriadapp.service.MyriadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@Controller
public class UserController {
    @Autowired
    private MyriadService myriadService;

    @RequestMapping(value = {"/users/login"})
    private String hello(){
        return "users/login";
    }


    @RequestMapping("/users/activate")
    private String activateEnail(@RequestParam("useremail") String emailAddress){
        if(myriadService.isEmailAlreadyInUse(emailAddress)) {
            Myriad myriad = myriadService.findByEmail(emailAddress).orElse(new Myriad());
            myriad.setActive(1);
            myriadService.saveMyriad(myriad);
        }
        return "redirect:/users/login?new";
    }

    @RequestMapping("/user/error")
    private String accessDenied(){
        return "users/error";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        SecurityContextHolder.getContext().setAuthentication(null);
        SecurityContextHolder.clearContext();
        HttpSession hs = request.getSession();
        Enumeration e = hs.getAttributeNames();
        while (e.hasMoreElements()) {
            String attr = e.nextElement().toString();
            hs.setAttribute(attr, null);
        }
        removeCookies(request);
        hs.invalidate();
        return "redirect:/";  //Where you go after logout here.
    }

    public static void removeCookies(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (int i = 0; i < cookies.length; i++) {
                cookies[i].setMaxAge(0);
            }
        }
    }
}
