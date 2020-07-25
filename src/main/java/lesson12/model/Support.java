package lesson12.model;

public class Support extends User {
    private String role;
    private String[] topics;

    public Support() {
    }

    public Support(String name, String email, String password, int age, String role, String[] topics) {
        super(name, email, password, age);
        this.role = role;
        this.topics = topics;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }


}
