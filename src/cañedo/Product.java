
package cañedo;


public class Product {
    
     int id, sold, stock;
    String name;
    double price;
    
    public void addProduct(int pid, String pname, double pprice, int psold, int pstock){
        
        this.id = pid;
        this.sold = psold; 
        this.stock = pstock;
        this.name = pname;      
        this.price = pprice;
               
    }
    
    public void viewProducts(){
        
        double profit = this.sold * this.price;
        String status = (this.sold < 1) ? "Out-of-stock":"Available";
        double tep = this.stock * this.price;
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10s %-10.2f\n",
                           this.id, this.name, this.price, this.sold, this.stock, profit, status, tep);
    }     
   
    
}
    

