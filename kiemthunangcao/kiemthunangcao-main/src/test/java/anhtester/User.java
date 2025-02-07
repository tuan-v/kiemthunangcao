package anhtester;

public class User {
    private String name;

    public String getName() {
        if (name == null) throw new NullPointerException("Name is null");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
