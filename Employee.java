import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private double salary;
    private String email;
    private String password;
    private String username;
    void inputDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name for the employee:");
        firstName = sc.nextLine();
        System.out.println("Enter last name for the employee:");
        lastName = sc.nextLine();
        System.out.println("Enter department for the employee:");
        department = sc.nextLine();
        System.out.println("Enter position of the employee:");
        position = sc.nextLine();
        System.out.println("Enter salary of the employee:");
        salary = sc.nextDouble();
        sc.close();
    }
    String generateEmail(String[] allEmails){
        Email ob = new Email();
        email = ob.generateEmail(firstName, lastName, department, allEmails, (int)(Math.random()*10));
        return email;
    }
    String generatePassword(){
        Password ob = new Password();
        password = ob.generatePassword(8);
        return password;
    }
    String generateUsername(String[] allUsernames){
        Username ob = new Username();
        username = ob.generateUsername(firstName, lastName, (int)(Math.random()*10), allUsernames);
        return username;
    }

    //Print Employee Details
    void printDetails(){ 
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.out.println("Department: "+department);
        System.out.println("Position: "+position);
        System.out.println("Email: "+email);
        System.out.println("Salary: "+salary);
    }
    
}