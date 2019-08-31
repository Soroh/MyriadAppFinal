package com.myriad.christian.myriadapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "post_comments")
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postCommentId;
    @OneToOne
    private Myriad myriad;
    @OneToOne
    private Post post;
    @NotBlank
    @Column(nullable = false)
    private String commentMessage;
    @Column(nullable = false)
    private int likes;//how many people liked the comment

    public PostComment() {
    }

    public PostComment(Myriad myriad, Post post, @NotBlank String commentMessage) {
        this.myriad = myriad;
        this.post = post;
        this.commentMessage = commentMessage;
        this.likes = 0;
    }

    public Long getPostCommentId() {
        return postCommentId;
    }

    public void setPostCommentId(Long postCommentId) {
        this.postCommentId = postCommentId;
    }

    public Myriad getMyriad() {
        return myriad;
    }

    public void setMyriad(Myriad myriad) {
        this.myriad = myriad;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getCommentMessage() {
        return commentMessage;
    }

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
