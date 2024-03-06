import java.util.List;

public class User {
    private String _name;
    String _membership = "Bronze";
    
    public static List<User> admins;

    public String toString() {
        return getName() + " " + getMembership();
    }

    public Boolean equals(User user) {
        //By defult objects are compared by memory address
        if (getName() == user.getName() && getMembership() == user.getMembership()) {
            return true;
        } else {
            return false;
        }
    }

    public User () {
    }

    public User(String name, String membership) {
        setName(name);
        setMembership(membership);
    }

    public User(String name) {
        setName(name);
    }

    void setName(String name) {
        _name = name;
    }

    String getName () {
        return _name;
    }

    void setMembership(String membership) {
        _membership = membership;
    }

    public enum Membership {
        Bronze, Silver, Gold;
    }


    String getMembership () {
        return _membership;
    }
}