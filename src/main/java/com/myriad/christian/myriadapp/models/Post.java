package com.myriad.christian.myriadapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @OneToOne
    private Myriad myriad;
    @Column(nullable = false)
    private LocalDateTime postingDateTime;
    @NotBlank
    @Column(nullable = false)
    private String message;
    @NotBlank
    @Column(nullable = false)
    private String scope;//who can view the post
    @Column(nullable = false)
    private int likes;//how many likes. zero at the point of posting
    @OneToMany(mappedBy = "post")
    private List<PostComment> postComments = new ArrayList<>();

    public Post() {
    }

    public Post(Myriad myriad, LocalDateTime postingDateTime, @NotBlank String message, @NotBlank String scope) {
        this.myriad = myriad;
        this.postingDateTime = postingDateTime;
        this.message = message;
        this.scope = scope;
        this.likes = 0;
    }

    public String getPostingDate(){
        LocalDateTime postDate=this.getPostingDateTime();
        StringBuilder s = new StringBuilder();
        s.append(postDate.getDayOfWeek()+" ");
        s.append(postDate.getDayOfMonth()+" ");
        s.append(postDate.getMonth()+" ");
        s.append(postDate.getYear()+" ");

        return s.toString();

    }
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Myriad getMyriad() {
        return myriad;
    }

    public void setMyriad(Myriad myriad) {
        this.myriad = myriad;
    }

    public LocalDateTime getPostingDateTime() {
        return postingDateTime;
    }

    public void setPostingDateTime(LocalDateTime postingDateTime) {
        this.postingDateTime = postingDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComment> postComments) {
        this.postComments = postComments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + postId +
                ", myriad=" + myriad +
                ", postingDateTime=" + postingDateTime +
                ", message='" + message + '\'' +
                ", scope='" + scope + '\'' +
                ", likes=" + likes +
                '}';
    }
}
