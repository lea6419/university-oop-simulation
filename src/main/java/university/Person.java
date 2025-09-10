package university;
/**
 * Abstract class representing a generic person in the university.
 * Contains basic attributes and an abstract method getRole().
 */
abstract class Person {
    private String name;
    private int age;
    protected String address;

    protected Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public abstract String getRole();
}
