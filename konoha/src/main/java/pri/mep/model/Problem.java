package pri.mep.model;

import pri.mep.model.enums.StatusProblem;

import java.util.Date;
import java.util.List;

public class Problem {

    private int id;

    private String address;

    private Date date;

    private String description;

    private int countOfVotes;

    private int authorId;

    private StatusProblem status;

    private List<Comment> comments;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public StatusProblem getStatus() {
        return status;
    }

    public void setStatus(StatusProblem status) {
        this.status = status;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", countOfVotes=" + countOfVotes +
                ", authorId=" + authorId +
                ", status=" + status +
                ", comments=" + comments +
                '}';
    }
}
