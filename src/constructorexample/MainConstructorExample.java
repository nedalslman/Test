
package constructorexample;

public class MainConstructorExample {

    public static void main(String[] args) {
       Employee e1=new Employee(1500);
        System.out.println("The salary is :"+e1.getSalary());
        
        Employee e2=new Employee("nedal", "odeh", 4700);
        System.out.println("The employee name is :"+e2.getFirstName()+" "+e2.getLastName());
        System.out.println("The employee salary is :"+e2.getSalary());
        
    }
    
}
