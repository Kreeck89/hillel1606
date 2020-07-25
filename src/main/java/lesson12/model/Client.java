package lesson12.model;

public class Client extends User {
    private String rank;
    private String status;
    private int rating;

    public Client() {
    }

    public Client(String name, String email, String password, int age, String rank, String status, int rating) {
        super(name, email, password, age);
        this.rank = rank;
        this.status = status;
        this.rating = rating;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
