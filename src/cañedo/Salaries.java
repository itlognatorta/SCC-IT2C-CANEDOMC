
package cañedo;

public class Salaries {

    int id, rate, hours, td;
    String name;

    
        public void employeeData(int uid, String uname, int urate, int uhours, int utd) {
            
            this.id = uid;
            this.name = uname;
            this.rate = urate;
            this.hours = uhours;
            this.td = utd;
        }
        
        public void viewData() {
            
            double gross = this.rate * this.hours;
            double netPay = gross - this.td;
            
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-15s %-10s %-15s %-20s %-10s %-15s %-10s", "Employee ID", "Name", "Rate", "Total Hours Worked", "Gross", "Total Deduction", "Net Pay\n");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("%-15d %-10s %-15d %-20d %-10.2f %-15d %-10.2lf", this.id, this.name, this.rate, this.hours, gross, this.td, netPay);
        }
}
    

