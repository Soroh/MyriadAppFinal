package com.myriad.christian.myriadapp.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "church_events")
public class ChurchEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    @OneToOne
    private Myriad myriad;
    @Column(nullable = false)
    private LocalDate datePosted;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @Column(nullable = false)
    private LocalTime timeOfEvent;
    @Column(nullable = false)
    private Double entryFee;
    @NotBlank
    @Column(nullable = false)
    private String location;
    @NotBlank
    @Column(nullable = false)
    private String targetPopulation;
    @Column(nullable = false)
    private int likes;//shows how many people like the event. Attending?
    @OneToMany(mappedBy = "churchEvent")
    private List<EventComment> eventComments = new ArrayList<>();

    public ChurchEvent() {
    }

    public ChurchEvent(Myriad myriad, LocalDate datePosted, LocalDate startDate, LocalDate endDate, LocalTime timeOfEvent, Double entryFee, @NotBlank String location, @NotBlank String targetPopulation,  List<EventComment> eventComments) {
        this.myriad = myriad;
        this.datePosted = datePosted;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeOfEvent = timeOfEvent;
        this.entryFee = entryFee;
        this.location = location;
        this.targetPopulation = targetPopulation;
        this.likes = 0;
        this.eventComments = eventComments;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Myriad getMyriad() {
        return myriad;
    }

    public void setMyriad(Myriad myriad) {
        this.myriad = myriad;
    }

    public LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalTime getTimeOfEvent() {
        return timeOfEvent;
    }

    public void setTimeOfEvent(LocalTime timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }

    public Double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(Double entryFee) {
        this.entryFee = entryFee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTargetPopulation() {
        return targetPopulation;
    }

    public void setTargetPopulation(String targetPopulation) {
        this.targetPopulation = targetPopulation;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<EventComment> getEventComments() {
        return eventComments;
    }

    public void setEventComments(List<EventComment> eventComments) {
        this.eventComments = eventComments;
    }
}
