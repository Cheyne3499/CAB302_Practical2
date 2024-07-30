import java.util.ArrayList;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.toDoItems = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private ArrayList<ToDoItem> toDoItems;

    public ArrayList<ToDoItem> getToDoItems() {
        return toDoItems;
    }
}
