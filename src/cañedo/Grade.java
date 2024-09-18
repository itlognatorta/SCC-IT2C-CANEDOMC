
package cañedo;

import java.util.Scanner;

public class Grade {
    
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
               System.out.println("New Prelim Grade: ");
               double fi = input.nextFloat();
               grs[i].f = fi;
               
           }
       }
    }
      
     public void addGrade () {
         
            Scanner input = new Scanner(System.in);
            Grades[] gr = new Grades[100];
            
            int noStuds = 0;
            String op;
            
            do{
                
                System.out.println("WELCOME TO GRADING APP");
                System.out.println("---------------------------------");
                System.out.println("1. ADD");
                System.out.println("2. VIEW");
                System.out.println("3. EDIT");
                System.out.println("4. REMOVE");
                System.out.println("5. EXIT");
                System.out.println("----------------------------------");
                
                System.out.println("Enter Action");
                int option = input.nextInt();
                
                while(option > 5){
                    System.out.println("Invalid Action");
                    option = input.nextInt();
                    
                }
                 
        switch(option){
                
        case 1:
            System.out.print("Enter no. of students: ");
            noStuds = input.nextInt();
                          
                for(int i = 0; i < noStuds; i++) {
                    System.out.print("Enter details of student " + (i + 1) + ".\n");
                    
                    System.out.print("Student ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Name: ");
                    String name = input.nextLine();                 
                    
                    System.out.print("Prelim: ");
                    double pl = input.nextDouble();
                    
                    System.out.print("Midterm: ");
                    double m = input.nextDouble();
                    
                    System.out.print("Prefinal: ");
                    double pf = input.nextDouble();
                    
                    System.out.print("Final: ");
                    double f = input.nextDouble();
                    
                    gr[i] = new Grades();
                    gr[i].addGrades(id, name, pl, m, pf, f);                    
                }
        break;
        case 2:
                   for (int i = 0; i < noStuds; i++) {
                   gr[i].viewGrades();              
               }
        break;           
        case 3:           
            System.out.println("Enter the ID to update: ");
            int ids = input.nextInt();
            System.out.println(""+ids);
            editGrades(gr, noStuds, ids);                
        break;   
                }
                System.out.println("Do you want to continue (Y/N): ");
                op = input.next();
            }while(op.equals("Y")|| op.equals("y"));
     }
}

    
    
    
    

