package pri.mep.model;

import pri.mep.model.enums.StatusProblem;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PROBLEM")
public class Problem {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DATE_OF_CREATION")
    private Date dateOfCreation;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "COUNT_OF_VOTES")
    private int countOfVotes;

    @ManyToOne
    @JoinColumn(name ="FK_AUTHOR_ID")
    private User user;

    @Enumerated(EnumType.STRING)
    private StatusProblem status;

    @OneToMany(mappedBy = "problem")
    private Collection<Comment> comments;

    @OneToMany(mappedBy = "problem")
    private Collection<Request> requests;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setComments(Collection<Comment> comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfVotes() {
        return countOfVotes;
    }

    public void setCountOfVotes(int countOfVotes) {
        this.countOfVotes = countOfVotes;
    }

    public Collection<Comment> getComments() {
        return comments;
    }

    public Collection<Request> getRequests() {
        return requests;
    }

    public void setRequests(Collection<Request> requests) {
        this.requests = requests;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public StatusProblem getStatus() {
        return status;
    }

    public void setStatus(StatusProblem status) {
        this.status = status;
    }


    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", date=" + dateOfCreation +
                ", description='" + description + '\'' +
                ", countOfVotes=" + countOfVotes +
                ", authorId=" + user +
                ", status=" + status +
                ", comments=" + comments +
                '}';
    }
}
