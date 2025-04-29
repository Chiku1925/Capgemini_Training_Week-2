public class Course{
    String courseName;
    int duration;
    double fee;
    static String institutename="SRM";
    public Course(String coursename,int duration,double fee){
        this.courseName=coursename;
        this.duration=duration;
        this.fee=fee;

    }
    public void displayDetails(){
        System.out.println("The course name = "+ courseName);
        System.out.println("Duration = "+ duration);
        System.out.println("Fees = "+ fee);
        System.out.println("Institute Name = " + institutename);

    } 

    static void updateInstituteName(String new_institute_name){
        institutename=new_institute_name;
    }

    public static void main(String[] args) {
        Course obj= new Course("CSE", 2, 15000);
        obj.displayDetails();
        
        Course.updateInstituteName("DAV");
        obj.displayDetails();
    }
}