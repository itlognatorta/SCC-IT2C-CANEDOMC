
package cañedo;

import java.util.Scanner;

public class Salary {
    
    int id, rate, hours, deduction;
    String name;
    double gross,netpay;
    
    
    public void Salaries(int sid, String name, int rate, int hrs, int deduct, double gross,double np){
       this.id = sid; 
       this.name = name;
       this.rate = rate;
       this.hours = hrs;
       this.deduction = deduct; 
       this.gross = gross; 
       this.netpay = np; 
       
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter number of Employee: ");
        int nums = sc.nextInt();
        
         for(int i = 0; i < nums; i++){
             
         System.out.println("Enter details of Employee" + (i+1) + ":");
         
             System.out.print("ID: ");
             int id = sc.nextInt();
             
             System.out.print("Name of Employee: ");
             String nam = sc.next();
             
             System.out.println("Rate: ");
             int rt = sc.nextInt();
             
             System.out.print("Hours: ");
             int hours = sc.nextInt();
             
             System.out.print("Deduction: ");
             int ddc = sc.nextInt();
             
             System.out.print("Gross: ");
             double gros = sc.nextDouble();
             
             System.out.print("Netpay: ");
             double netp = sc.nextDouble();
             
                          
             
         }
             
         
               
       
    
    
            
            
    
}
