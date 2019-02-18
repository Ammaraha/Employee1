
package employee;
/**
 *
 * @author ahashmi
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double MonthlySalary;
    
    public Employee(String FirstName, String LastName, double Salary)
    {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.MonthlySalary = Salary;
    }
    public String GetFirstName()
    {
        return firstName;
    }
    public void SetFirstName(String FirstName)
    {
        this.firstName = FirstName;
    }
    public String GetLastName()
    {
        return lastName;
    }
    public void SetLastName(String LastName)
    {
        this.lastName = LastName;
    }
    public double GetMonthlySalary()
    {
        return MonthlySalary;
    }
    public void SetMonthlySalary(double MonthlySalary)
    {
        if(MonthlySalary<0)
        this.MonthlySalary = 0;
      else
        {
            if(MonthlySalary>0)
             this.MonthlySalary=MonthlySalary;
        }
        
          
        }
    }


    
        
        
        
        
        
    
            
    
 