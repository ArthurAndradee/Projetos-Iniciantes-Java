public class Introduction {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        User arthur = new User();
        
        arthur.name = "Arthur";
        arthur.membership = "Silver"; 
        arthur.age = 18;

        User rafaela = new User();

        rafaela.name = "Rafa";
        rafaela.membership = "Silver";
        arthur.age = 18;

        System.out.println(arthur.name + " " + arthur.membership);
        System.out.println(rafaela.name + " " + rafaela.membership);
    }
}