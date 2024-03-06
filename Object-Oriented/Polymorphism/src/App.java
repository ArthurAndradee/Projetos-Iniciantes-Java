import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.setName("Student");
        Teacher t = new Teacher("");
        t.setName("Teacher");


        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new Teacher("Connor"));
        User.admins.add(new Teacher("Arthur"));
        User.admins.add(new Teacher("Robin"));

        for (User u : User.admins) {
            u.verify();
            u.getName();
        }
    }
}
