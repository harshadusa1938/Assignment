package com.strose;

public class BasePlusCommisionEmployeeTest
{
public static void main(String[] args)
{
//instantiate BasePlusComiissionEmployee object
  BasePlusCommisionEmployee employee=new BasePlusCommisionEmployee("Bob","Lewis","333-33-3333",5000,.04,300);
  
  //get base salaried commission employee data
  System.out.println("Employee information obtained by getMethods: \n");
  //System.out.pritnln("Employee information obtained by getMethods: \n");
  
  System.out.printf("%s %s\n","First Name is:",employee.getFirstName());
  System.out.printf("%s %s\n","Last Name is:",employee.getLastName());
  
  System.out.printf("%s %s\n","Social security number is:",employee.getSocialSecurityNumber());
  System.out.printf("%s %.2f\n","Gross Sales is:",employee.getGrossSales());
  System.out.printf("%s %s\n","Commistion Rate is:",employee.getCommisionRate());
  System.out.printf("%s %s\n","Base Salary is:",employee.getBaseSalary());
  
  employee.setBaseSalary(10); //set base salary
  System.out.printf("\n%s:\n\n%s\n","Updated emplyee information obtained by toString",employee.toString());
}//end of main method
}//end class BasePlusCommissionEmployeeTest