public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="nitish";
        s1.roll=123;
        s1.pass="abcd";
        s1.marks[0]=10;
        s1.marks[1]=40;
        s1.marks[2]=70;
        Student s2=new Student(s1);
        s2.pass="xyz";
        s1.marks[0]=80;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    int roll;
    String pass;
    String name;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("constructor is called..");
    }
    // Student(String name){
    //     marks=new int[3];
    //     this.name=name;
    // }
    // Student(int roll){
    //     marks=new int[3];
    //     this.roll=roll;
    // }
    //copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.pass=s1.pass;
        this.marks=s1.marks;
    }
}
