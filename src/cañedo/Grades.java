 
package cañedo;

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
}
