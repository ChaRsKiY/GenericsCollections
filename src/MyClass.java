import java.util.*;

class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

public class MyClass {
    public static void main(String[] args) {
        HashSet<User> userSet = new HashSet<>();

        User user1 = new User("Bobby", 25, "123456");
        User user2 = new User("Maksym", 18, "654321");
        User user3 = new User("Nikita", 32, "123456");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        System.out.println("Пользователи:");
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
