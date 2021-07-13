package academy.mindswap.firstspringboot.model;

public class User {
    private static int userCounter;
    private int id;
    private int age;
    private String name;
    private String email;


    public User(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.id = ++userCounter;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
