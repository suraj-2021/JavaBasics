class Student{
    String name;
    String course;
    int age;
    
    void display_info(){
        System.out.println("Student Details: ");
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Age: "+age);
    }
}

class SInfo{
    public static void main(String para[]){
        Student student_1;
        student_1 = new Student();
        
        student_1.name ="Sura";
        student_1.course ="MCA";
        student_1.age = 23;
        
        student_1.display_info();
}
}
