
package cañedo;

import java.util.Scanner;

public class Salary {
    
      public void addData () {
    
        Scanner sc = new Scanner(System.in);
        Salaries[] sal = new Salaries[100];

        System.out.print("Enter number of Employees: ");
        int nums = sc.nextInt();

        for (int x = 0; x < nums; x++) {
            System.out.printf("Enter employee details %d\n", x + 1);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Rate: ");
            int rate = sc.nextInt();

            System.out.print("Hours Worked: ");
            int hours = sc.nextInt();

            System.out.print("Total Deduction: ");
            int td = sc.nextInt();
            
            sal[x] = new Salaries();
            sal[x].employeeData(id, name, rate, hours, td);
        }
        
        for (int x = 0; x < nums; x++) {
            sal[x].viewData();
        }
    }
}
