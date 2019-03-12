package loginApp;

public enum Option {

    //two options Admin and Student
    Admin, Student;

    private Option() {
    }

    public String value() {
        return name();
    }

    public static Option fromvalue(String v) {
        return valueOf(v);
    }
}
