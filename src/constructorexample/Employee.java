package constructorexample;

public class Employee {
//constructor can be one or multi constructor
//constructor not return type,name=class name
    public Employee(double s) {
        this.salary=s;
    }
    public Employee(String First_name,String Last_name,double _salary){
     this.firstName=First_name;
     this.lastName=Last_name;
     this.salary=_salary;
    }
private String firstName;
private String lastName;
private double salary;
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }



}
