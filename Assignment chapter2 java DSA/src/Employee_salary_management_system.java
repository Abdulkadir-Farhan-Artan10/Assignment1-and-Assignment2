//parent class/super class
class Employee{
    String empId;
    String empName;
    String empDept;
    double basic_salary;
    //parent class constructor which are parametrize constructor
    Employee(String empId,String empName,String empDept,double basic_salary){
        this.empId=empId;
        this.empName=empName;
        this.empDept=empDept;
        this.basic_salary=basic_salary;
    }
    //method to calculate salary
    double calculate_salary(){
        return basic_salary;
    }
    //method display emplye info
    void display_info(){
        System.out.println("Employee ID:" +empId);
        System.out.println("Employee Name:" +empName);
        System.out.println("Employee Dept:" +empDept);
        System.out.println("Monthly Salary: $" +calculate_salary());
        System.out.println();
    }
}
//full-time employee subclass
class Fulltime_employee extends Employee{
    double allowance;
    //full-time subclass constructor
    Fulltime_employee(String empId,String empName,String empDept,double basic_salary,double allowance ){
        super(empId,empName,empDept,basic_salary);
        this.allowance=allowance;
    }
    @Override
    double calculate_salary(){
        return basic_salary + allowance;
    }
    @Override
    void display_info(){
        System.out.println("Employee ID:" +empId);
        System.out.println("Employee Name:" +empName);
        System.out.println("Employee Department:" +empDept);
        System.out.println("Category: Full-Time Employee");
        System.out.println("Monthly Salary: $" +calculate_salary());
        System.out.println();
    }
}
//part-time employee subclass
class Parttime_Employee extends Employee{
    int HoursWorked;
    double hourly_rate;
    //par-time subclass constructor
    Parttime_Employee(String empId,String empName,String empDept,double basic_salary,int HoursWorked,double hourly_rate){
        super(empId,empName,empDept,basic_salary);
        this.HoursWorked=HoursWorked;
        this.hourly_rate=hourly_rate;
    }
    @Override
    double calculate_salary(){
        return HoursWorked * hourly_rate;
    }
    @Override
    void display_info(){
        System.out.println("Employee ID:" +empId);
        System.out.println("Employee Name:" +empName);
        System.out.println("Employee Dept:" +empDept);
        System.out.println("Category: Part-Time Employee");
        System.out.println("Monthly Salary: $" +calculate_salary());
        System.out.println();
    }
}
//manager subclass
class Managerr extends Employee{
    double bonus;

    //manager constructor
    Managerr(String empId,String empName,String empDept,double basic_salary,double bonus){
        super(empId,empName,empDept,basic_salary);
        this.bonus=bonus;
    }
    @Override
    double calculate_salary(){
        return basic_salary+bonus;
    }
    @Override
    void display_info(){
        System.out.println("Employee ID:" +empId);
        System.out.println("Employee Name:" +empName);
        System.out.println("Employee Dept:" +empDept);
        System.out.println("Category: Manager");
        System.out.println("Monthly Salary: $" +calculate_salary());
        System.out.println();
    }

}



public class Employee_salary_management_system {
    static void main() {
        Employee[] emplyes={
                    new Fulltime_employee("101","Ali Umar","IT",600,145),
                    new Parttime_Employee("102","Sahra Hassan","Finance",0,25,7),
                    new Managerr("103","Abdulkadir farhan","management",1500,300),
            };
            System.out.println("=====Employee Salary Report=====");
            System.out.println();
            //display information of each employee
            for (Employee e:emplyes){
                e.display_info();
            }

        }

    }




