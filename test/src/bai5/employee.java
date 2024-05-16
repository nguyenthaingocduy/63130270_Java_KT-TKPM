package bai5;

public class employee {
    private String Name;
    private String jobTitle;
    private double Salary;

    public employee(String name, String jobTitle, double salary) {
        Name = name;
        this.jobTitle = jobTitle;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

   public void raiseSalary(double percentage){
        Salary = Salary + Salary * percentage / 100;
   }

   public void printEmployeeDetails(){
       System.out.println("Name: " + Name);
       System.out.println("Job Title: "+ jobTitle);
       System.out.println("Salary: " + Salary);
   }
   
}
