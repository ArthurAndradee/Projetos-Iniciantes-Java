public class Student extends User {
    private boolean _verified = false;

    public void set_verified(boolean verified) {
        _verified = verified;
    }

    boolean get_verified() {
        return _verified;
    }
}
