package net.xiaoluo.crazyit.crazyjava.javabasiclib;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(18);
        User u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }

}

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        this.address = new Address("Montreal");
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
