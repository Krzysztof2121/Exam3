package ie.gmit;

public class Employee {
    protected String name;
    private String title;
    private String pps;
    private String phone;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        if((title == "Mr") || (title == "Mrs") || (title == "Ms")) {

        this.title = title;
    }
    else {
        throw new IllegalArgumentException("Invalid title");
        }

    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        if (age > 16) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age");
        }
    }
    public Employee(String name, String title, String pps, String phone, int age) {
        this.name = name;
        this.title = title;
        this.pps = pps;
        this.phone = phone;
        this.age = age;
    }


}
