package com.myriad.christian.myriadapp.models;


import com.myriad.christian.myriadapp.validators.UniqueEmail;
import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "myriads")
public class Myriad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "myriad_id")
    private Long myriadId;
    @NotBlank
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @NotBlank
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @NotBlank
    @Column(unique = false,nullable = false)
   // @UniqueEmail
    private String emailAddress;
    @NotBlank
    @Column(nullable = false)
    private String password;
    @Column(name = "active",nullable = false)
    private int active;
    @OneToMany(mappedBy = "myriad")
    private List<Post> posts = new ArrayList<>();
    @OneToMany(mappedBy = "myriad",cascade=CascadeType.REMOVE)
    //@Cascade({CascadeType.SAVE_UPDATE, CascadeType.DELETE})
    private List<PostComment> postComments = new ArrayList<>();
    @OneToMany(mappedBy = "myriad",cascade=CascadeType.REMOVE)
    private List<EventComment> eventComments = new ArrayList<>();
    @OneToMany(mappedBy = "myriad",cascade=CascadeType.REMOVE)
    private List<ChurchEvent> churchEvents = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "USER_ROLE",
            joinColumns = {@JoinColumn(name = "myriad_id", referencedColumnName = "myriad_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "role_id",unique = false)})
    List<Role> roles ;

    public Myriad(Myriad myriad) {
        this.active=myriad.getActive();
        this.emailAddress=myriad.getEmailAddress();
        this.roles=myriad.getRoles();
        this.firstName=myriad.getFirstName();
        this.middleName=myriad.getMiddleName();
        this.lastName = myriad.getLastName();
        this.dateOfBirth=myriad.getDateOfBirth();
        this.password=myriad.getPassword();
        this.myriadId=myriad.getMyriadId();

    }

    public Myriad(@NotBlank String firstName, String middleName, @NotBlank String lastName, LocalDate dateOfBirth, @NotBlank String emailAddress, @NotBlank String password, int active) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.password = password;
        this.active = active;
    }



    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Myriad() {
    }




    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Long getMyriadId() {
        return myriadId;
    }

    public void setMyriadId(Long myriadId) {
        this.myriadId = myriadId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComment> postComments) {
        this.postComments = postComments;
    }

    public List<EventComment> getEventComments() {
        return eventComments;
    }

    public void setEventComments(List<EventComment> eventComments) {
        this.eventComments = eventComments;
    }

    public List<ChurchEvent> getChurchEvents() {
        return churchEvents;
    }

    public void setChurchEvents(List<ChurchEvent> churchEvents) {
        this.churchEvents = churchEvents;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Myriad{" +
                "myriadId=" + myriadId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
