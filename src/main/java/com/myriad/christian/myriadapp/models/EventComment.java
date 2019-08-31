package com.myriad.christian.myriadapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "event_comments")
public class EventComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventCommentId;
    @OneToOne
    private ChurchEvent churchEvent;
    @OneToOne
    private Myriad myriad;
    private LocalDateTime dateOfComment;
    @NotBlank
    @Column(nullable = false)
    private String commentMessage;
    @Column(nullable = false)
    private int likes;

    public EventComment() {
    }

    public EventComment(ChurchEvent churchEvent, Myriad myriad, LocalDateTime dateOfComment, @NotBlank String commentMessage) {
        this.churchEvent = churchEvent;
        this.myriad = myriad;
        this.dateOfComment = dateOfComment;
        this.commentMessage = commentMessage;
        this.likes = 0;
    }

    public Long getEventCommentId() {
        return eventCommentId;
    }

    public void setEventCommentId(Long eventCommentId) {
        this.eventCommentId = eventCommentId;
    }

    public ChurchEvent getChurchEvent() {
        return churchEvent;
    }

    public void setChurchEvent(ChurchEvent churchEvent) {
        this.churchEvent = churchEvent;
    }

    public Myriad getMyriad() {
        return myriad;
    }

    public void setMyriad(Myriad myriad) {
        this.myriad = myriad;
    }

    public LocalDateTime getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(LocalDateTime dateOfComment) {
        this.dateOfComment = dateOfComment;
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
