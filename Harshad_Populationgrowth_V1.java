/* Author Name: Harshad Patel
 * Date:        01/18/2017
 * Description:  World Population in the World from Current Year to Next 75 Year, Means 2017 to 2092,
 * There are three column, In first column like year and 2nd Column like Population of the end of year and in 3rd column like Increase the Population (Difference).   
 */

package com.strose;
import java.math.*;

public class Harshad_Populationgrowth_V1 
{
	public static void main(String[] args)
	{
		// Here we are using a BigDecimal data type because we are working with a very large number of population
		BigDecimal num1;
		BigDecimal num2;
		BigDecimal current_pop = new BigDecimal("7479675556.00");        // Current World Population 
		BigDecimal current_rate = new BigDecimal("1.11");                       // Current Growth Rate of World Population
		
		// Print the Data Header here 
		System.out.println("Year      "+"|      "+ "Population End Of The Year      " + " |        "  + "Increase Population(This Year) Difference    \n");      // Table header
		System.out.println("=====================================================================================================");
		System.out.println(" ");      // 
		System.out.println("2017      "+"|          " + current_pop + "                |                     " + "0.0               " );

		for(int i=2018; i<=2092; i++)                // Print upto next 75 years
		{

			BigDecimal current_year_pop = current_pop.multiply(current_rate);              // Population of Current Year
			BigDecimal difference = current_year_pop.subtract(current_pop);           // Increase Population this year
			current_pop = current_year_pop;                                      

			num1 = current_year_pop.setScale(2, BigDecimal.ROUND_HALF_EVEN);        // We will Get the value upto 2 digit of decimal for Population of Current Year
			num2 = difference.setScale(2, BigDecimal.ROUND_HALF_EVEN);          // we will Get value upto 2 digit of decimal for Increase Population of this year

			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println(i + "      |          "       +num1  + "               |              " + num2);          // (1) Print the year, (2) Population of the Current(This) Year and (3)Increase the Population of this year
		}
		System.out.println("-----------------------------------------------------------------------------------------------------"); }
}