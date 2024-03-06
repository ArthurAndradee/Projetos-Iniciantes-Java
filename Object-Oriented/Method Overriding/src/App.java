public class App {
    public static void main(String[] args) {
        User arthur = new User("Arthur", "Silver");
        User user = new User("Arthur", "Silver");

        System.out.println(arthur.equals(user));
    }
}