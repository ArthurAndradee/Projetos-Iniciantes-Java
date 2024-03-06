public class Teacher extends User{
    public Teacher(String string) {
        //TODO Auto-generated constructor stub
    }

    void verify() {
        System.out.println("Verifying through phone");
        set_verified(true);
    }
}
