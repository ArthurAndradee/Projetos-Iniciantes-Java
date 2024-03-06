public class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        User arthur = new User();
        
        arthur.setName("Arthur"); 
        arthur.membership = "Gold";

        System.out.println(arthur.getName());
    }
}