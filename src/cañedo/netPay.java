
package cañedo;

import java.time.LocalDate;
import java.util.Scanner;


public class netPay {
    
     public void getPay(){
        
        Scanner input = new Scanner(System.in);
        
        String name;
        int age,rate = 0,hours = 0,total = 0; 
        
        LocalDate date = LocalDate.now();
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
       
        System.out.print("Enter you age: ");
        age = input.nextInt();
        
        System.out.print("Enter total rate per hour: ");
        rate = input.nextInt();
        
        System.out.print("Enter total hours worked: ");
        hours = input.nextInt();
        
        System.out.print("Enter total deduction: ");
        total = input.nextInt();
        
        System.out.println("----------------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("----------------------------------");
        
        System.out.println("Date: " + date);       
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        System.out.println("----------------------------------");
        
        double gross = rate * hours;       
        System.out.println("Total Gross: " + gross);            
        
        double np = gross - (double)total;
        System.out.println("Total Netpay: "+ np);
         
        System.out.println("----------------------------------");
        
       
    }
    
}
    

