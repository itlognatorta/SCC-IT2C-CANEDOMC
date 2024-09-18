
package cañedo;

import java.util.Scanner;

public class Grades {
    
    int id;
    String name;
    double p, m, pf, f;
  
    
    public void addGrades(int sid, String name, double prl, double mid, double prf, double fi){
       this.name = name;        
       this.id = sid;
       this.p = prl;
       this.m = mid;
       this.pf = prf;
       this.f = fi;
    }
    
    public void viewGrades(){
        double ave = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (ave > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("-%15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s", "Student ID", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks\n");
        System.out.printf("%-10d, %-20s, %-10.2f, %-10.2f, %-10.2f, %-10.2f, %-10.2f, %-10s\n",
        this.id, this.name, this.p, this.m, this.pf, this.f, ave, remarks);
        
    } 
    
    public void editGrades(Grades[] grs, int size, int id){
       Scanner input = new Scanner(System.in);
       for(int i = 0; i < size; i++){
           if(grs[i].id == id){
               System.out.println("New Prelim Grade: ");
               double prl = input.nextFloat();
               grs[i].p = prl;              
               System.out.println("New Midterm Grade: ");
               double mid  = input.nextFloat();
               grs[i].m = mid;                            
               System.out.println("New PreFi Grade: ");
               double prf = input.nextFloat();
               grs[i].pf = prf;
               System.out.println("New Final Grade: ");
               double fi = input.nextFloat();
               grs[i].f = fi;
               
           }
       }
    }   
    
    public int removeGrade(Grades[] grs, int size, int id){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID to remove: ");
        id = input.nextInt();
        for(int i = 0; i < size; i--){
        if(grs[i].id == id){ 
        System.out.printf("\nRemoving Book with ID: %d\n", id);
        for(int x = i; x < size - 1; x++){
            grs[x] = grs[x + 1]; 
        }
        size--;
            System.out.println("Grade removed successfully!");
            return size - 1;
        }
        }
            System.out.println("Grade not Found!");
            return size; 
        
    }
}
     
