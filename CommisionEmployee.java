package com.strose;

public class CommisionEmployee extends Object
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commisionRate;
    
    //five argument constructor
    public CommisionEmployee(String first,String last,String ssn,double sales,double rate)
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommisionRate(rate);
    }
    public void setFirstName(String first)
    {
        firstName = first;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String last)
    {
        lastName = last;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setSocialSecurityNumber(String ssn)
    {
        socialSecurityNumber = ssn;
    }
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    public void setGrossSales(double sales)
    {
        if (sales>=0.0)
            grossSales=sales;
        else
            throw new IllegalArgumentException("Gross sales must be>=0.0");
    }
    public double getGrossSales()
    {
        return grossSales;
    }
    public void setCommisionRate(double rate)
    {
        if (rate>0.0 && rate<1.0)
            commisionRate=rate;
        else
            throw new IllegalArgumentException("Commision Rate must be>0.0 and <1.0");
    }
    public double getCommisionRate()
    {
        return commisionRate;
    }
    public double earnings()
    {
        return commisionRate * grossSales;
    }
    @Override
    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f","commision employee",getFirstName(),getLastName(),"social securtiy number",getSocialSecurityNumber(),"gross sales",getGrossSales(),"commision rate",getCommisionRate());
    }

   
}