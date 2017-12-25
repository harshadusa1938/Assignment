package com.strose;

public class BasePlusCommisionEmployee extends CommisionEmployee
{
private double baseSalary;

//six arguement constructor
public BasePlusCommisionEmployee(String first,String last,String  ssn, double sales, double rate,double salary)
{
//explicite call to super class CommissionEmployee constructor
  super(first, last, ssn, sales, rate);
   
  setBaseSalary(salary); // validate and store base salary
   
}// end six-argument BasePlusCommissionEmployee constructor

//set base salary

public void setBaseSalary(double salary)
{
if(salary>=0.0)
  baseSalary=salary;
else
	throw new IllegalArgumentException("Base salary must>=0.0");
  
}//end of method setBaseSalary

//return base salary
public double getBaseSalary()
{
	return getBaseSalary();

}// end of method getBaseSalary

//calculate earnings
@Override //indicates that this method ovverrides a super class method
public double earnings()
{
int commision = 0;
int grossSales = 0;
// not allowed: commissionRate and grossSales priavet in superclass
  return baseSalary+(commision * grossSales);

}// end method earnings
//return String representation of BasePlusCommissionEmployee
@Override // indicates that this method overrides a superclass method
public String toString()
{
//not allowed: attempts to access private superclass members
  
	return String.format("%s %s\n%s: %.2f","base salaried", super.toString(),"base salary",getBaseSalary());
}//end of method toString
}//end class BasePlusEommissionEmployee
