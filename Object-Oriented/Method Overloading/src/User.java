public class User {
    private String _name;
    String _membership;

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


    String getmembership () {
        return _membership;
    }
}
 