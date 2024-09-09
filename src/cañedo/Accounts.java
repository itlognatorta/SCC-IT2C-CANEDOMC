
package cañedo;


public class Accounts {

    int id;
    String name, Email, username, password;

    public void addDetails(int uid, String Uname, String uEmail, String userN, String uPass) {

        this.id = uid;
        this.name = Uname;
        this.Email = uEmail;
        this.username = userN;
        this.password = uPass;
    }

    public void viewDetails() {

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-20s %-15s %-20s", "User ID", "Name", "Email", "Username", "Password");
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.printf("%-15d %-15s %-20s %-15s %-20s", this.id, this.name, this.Email, this.username, this.password);

    }

    public boolean passwordVerifier(String password) {

        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!?@#$%^&-+=()])(?=\\S+$).{8,}$";

        return password.matches(regex);
    }
}
    

