public class Course {
    public String name;
    public String code;
    public int credit;

    public void updateDetails(String n,String co,int cr){
        this.name = n;
        this.code = co;
        this.credit = cr;
    }

  
    public void displayCourse(){
        System.out.println("Course Name: " +name);
        System.out.println("Course code: " +code);
        System.out.println("Course credit: " +credit);
    }
}
