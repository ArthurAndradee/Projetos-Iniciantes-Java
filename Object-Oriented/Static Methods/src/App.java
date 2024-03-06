import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        User.admins = new ArrayList<User>();
        User.admins.add(new User("Connor"));
        User.admins.add(new User("Arthur"));
        User.admins.add(new User("Robin"));

        User.print_admin_names();
    }
}
