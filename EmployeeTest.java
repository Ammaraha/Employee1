
package employee;
import java.util.Scanner;
/**
 *
 * @author ahashmi
 */
public class EmployeeTest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Employee a1 = new Employee("Michael","Smith",5000);
        a1.SetFirstName("Michael");
        String FirstName = a1.GetFirstName();
        System.out.printf("print name is %s%n", FirstName);
        
        a1.SetLastName("Smith");
       String LastName=a1.GetLastName();
       System.out.printf("print name is %s%n",LastName);
       a1.SetMonthlySalary(5000);
     double MonthlySalary = a1.GetMonthlySalary();
     double YearlySalary = MonthlySalary*12;
       System.out.printf("print salary%f",YearlySalary);
       
      Employee a2 = new Employee("John","Silver", 2000);
       a2.SetFirstName("John");
       String firstName = a2.GetFirstName();
       System.out.printf("print name is %s%n",firstName);
       
       a2.SetLastName("Silver");
       String lastName = a2.GetLastName();
       System.out.printf("print name is %s%n",lastName);
       a2.SetMonthlySalary (2000);
       double MonthlySalary2 = a2.GetMonthlySalary();
       double YearlySalary2 = MonthlySalary2 *12;
       System.out.printf("print salary%f%n",YearlySalary2);
       
       
       
       
       
       
       
        
        
        
        
        
        
       
        
        
        
        
        
        
    }
    
}
