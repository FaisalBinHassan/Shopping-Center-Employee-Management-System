package ASSIGNMENTs.Assignment01;

public class Employee {
    // Data
    private int EmpID;
    private String Fname;
    private String Lname;
    private String product;
    private String phone;
    private int age;
    private int center;
    private Employee next;

    /////////////////////////// Constructers /////////////////////////////////////////
    public Employee() {};

    public Employee(int empID, String fname, String lname) {
        EmpID = empID;
        Fname = fname;
        Lname = lname;
    }

    public Employee(int empID, String fname, String Lname, String product, Employee next) {
        EmpID = empID;
        Fname = fname;
        this.Lname = Lname;
        this.product = product;
        this.next = next;
    }

    public Employee(int empID, String fname, String Lname, String product, int center, Employee next) {
        EmpID = empID;
        Fname = fname;
        this.Lname = Lname;
        this.product = product;
        this.center = center;
        this.next = next;
    }

    public Employee(int empID, String fname, String Lname, String product, String phone, int age, int center) {
        EmpID = empID;
        Fname = fname;
        this.Lname = Lname;
        this.product = product;
        this.phone = phone;
        this.age = age;
        this.center = center;
    }

    /////////////////////////// Setters / Getters /////////////////////////////////////////

    public int getEmpID() {
        return EmpID;
    }
    public void setEmpID(int empID) {
        EmpID = empID;
    }
    public String getFname() {
        return Fname;
    }
    public void setFname(String fname) {
        Fname = fname;
    }
    public String getLname() {
        return Lname;
    }
    public void setLname(String lname) {
        this.Lname = lname;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCenter() {
        return center;
    }
    public void setCenter(int center) {
        this.center = center;
    }
    public Employee getNext() {
        return next;
    }
    public void setNext(Employee next) {
        this.next = next;
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "EmpID=" + EmpID +
                ", Fname='" + Fname + '\'' +
                ", lName='" + Lname + '\'' +
                ", product='" + product + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", center=" + center +
                ", next=" + next +
                '}';
    }
}
