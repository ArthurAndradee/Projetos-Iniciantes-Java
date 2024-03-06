public class Introduction {
    public static void main(String[] args) {
        User arthur = new User();
        
        arthur.setName("Arthur"); 
        arthur.setMembership(User.Membership.Gold);

        System.out.println(arthur.getName());
        System.out.println(arthur._membership);
    }
}