package com.myriad.christian.myriadapp.controllers;

import com.myriad.christian.myriadapp.models.PostComment;
import com.myriad.christian.myriadapp.service.CommentService;
import com.myriad.christian.myriadapp.service.MyriadService;
import com.myriad.christian.myriadapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {


    private CommentService commentService;

    private MyriadService myriadService;

    private PostService postService;
    @Autowired
    public CommentController(CommentService commentService, MyriadService myriadService, PostService postService) {
        this.commentService = commentService;
        this.myriadService = myriadService;
        this.postService = postService;
    }

    @RequestMapping("/newsfeed/comment")
    public @ResponseBody
    String  newsFeed(@RequestParam Long postId,@RequestParam String message, @RequestParam Long myriadId){
        PostComment postComment = new PostComment(myriadService.findById(myriadId),postService.findById(postId),message );
        commentService.save(postComment);





//        ModelAndView model = new ModelAndView();
//        List<Post> posts = postService.getAllPosts();
//        model.addObject("posts",posts);
//        model.setViewName("newsfeed/newsfeed");
//        posts.stream().forEach(x->{
//            System.out.println(x);
//        });
        return "newsfeed/newsfeed";
    }
}
