public class User {
    private String _name;
    String _membership = "Bronze";

    public String toString() {
        return getName() + " " + getMembership();
    }

    //By defult objects compare by memory address
    public Boolean equals(User user) {
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

    void setName(String name) {
        _name = name;
    }

    String getName () {
        return _name;
    }

    void setMembership(String membership) {
        _membership = membership;
    }

    void setMembership(Membership membership) {
        _membership = membership.name();
    }

    
    public enum Membership {
        Bronze, Silver, Gold;
    }


    String getMembership () {
        return _membership;
    }
}
 