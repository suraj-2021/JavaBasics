class Student{
    protected String name;
    protected int enroll;
    
    Student(String n, int e){
        this.name = n;
        this.enroll = e;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Enrollment: "+enroll);
    }
}

class PGStudent extends Student{
    private String Course;
    
    PGStudent(String n, int e, String c){
        super(n,e);
        this.Course = c;
    }
    
    public void DisplayPGStudent(){
        System.out.println("Name: "+name);
        System.out.println("Enrollment: "+enroll);
        System.out.println("Course: "+Course);
    }
    
}

public class Main{
    public static void main(String[] args){
        PGStudent S1 = new PGStudent("Hari",1234,"MSC");
        S1.DisplayPGStudent();
    }
}
