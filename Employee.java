public class Employee {
    String name;
    double salary;
    String designation;

    public void newEmployee(String na) {
      this.name = na;
      this.designation = "junior";
      this.salary = 30000.0;
    } 

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary+" TK");
        System.out.println("Employee Designation: "+designation );
    } 
    public void promoteEmployee(String deg) {
        if(deg.equals("senior")){
            designation = "senior";
            salary+=25000;
        }else if(deg.equals("lead")){
            designation = "lead";
            salary+=50000;
        }else if(deg.equals("manager")){
            designation = "manager";
            salary+=75000;
        }
        System.out.println(name+" has been promoted to "+deg);
        System.out.println("New Salary: "+salary);

    } 
    public void calculateTax() {
        double mul = 0;
        if(salary > 50000){
            mul=0.3;
        }else if(salary > 30000){
            mul=0.1;
        }
        if(mul==0) {System.out.println("No need to pay tax");return;}
        System.out.println(name+" Tax Amount: " + salary*mul +" TK");
      } 
}
