import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Connor"));
        User.admins.add(new User("Arthur"));
        User.admins.add(new User("Robin"));

        for (int i = 0; i < User.admins.size(); i++) {
            System.out.println(User.admins.get(i).getName());
        }

        for (User u : User.admins) {
            System.out.println(u.getName());
        }
    }
}
