package com.strose;

public class CommisionEmployeeTest 
{
    public static void main(String[] args)
    {
        CommisionEmployee employee = new CommisionEmployee("Justin","Bieber","222-22-2222",10000,.06);
        
       
        System.out.printf("Employee information obtained by get methods: \n" );
        System.out.printf("%s %s\n","First name is",employee.getFirstName());
        System.out.printf("%s %s\n","Last name is",employee.getLastName() );
        System.out.printf("%s %s\n","Social Security Number is",employee.getSocialSecurityNumber() );
        System.out.printf("%s %.2f\n","Gross Sales is",employee.getGrossSales() );
        System.out.printf("%s %.2f\n","Commision Rate is",employee.getCommisionRate() );
        employee.setGrossSales(500);
        employee.setCommisionRate(.1);
        
        System.out.printf("\n%s: \n\n%s\n","Updated employee information obtained by tostring",employee);
    }
    
}
