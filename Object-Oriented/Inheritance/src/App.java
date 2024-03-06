import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        System.out.println(s.get_verified());
        s.setMembership("Gold");
        System.out.println(s.getMembership());

        // User.admins = new ArrayList<User>();
        // User.admins.add(new User("Connor"));
        // User.admins.add(new User("Arthur"));
        // User.admins.add(new User("Robin"));

        // User.print_admin_names();
    }
}
