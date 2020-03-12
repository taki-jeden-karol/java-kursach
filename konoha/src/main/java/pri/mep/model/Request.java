package pri.mep.model;

import pri.mep.model.enums.StatusRequest;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REQUEST")
public class Request {
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

    @Enumerated(EnumType.STRING)
    private StatusRequest status;

    @ManyToOne
    @JoinColumn(name = "FK_PROBLEM_ID")
    private Problem problem;

    @ManyToOne
    @JoinColumn(name ="FK_AUTHOR_ID")
    private User user;

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

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusRequest getStatus() {
        return status;
    }

    public void setStatus(StatusRequest status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", date=" + dateOfCreation +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", problemId=" + problem +
                ", authorId=" + user +
                '}';
    }
}
