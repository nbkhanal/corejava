import java.io.*;

public class EmployeeTest{
  public static void main(String[] args) {
    Employee empOne = new Employee("Nirvik Khanal");
    Employee empTwo = new Employee("Nitesh Regmi");

    empOne.empAge(25);
    empOne.empDesignation("Associate Release Engineer");
    empOne.empSalary(20000);
    empOne.printEmployee();

    empOne.empAge(23);
    empOne.empDesignation("Senior Developer");
    empOne.empSalary(50000);
    empOne.printEmployee();
  }
}
