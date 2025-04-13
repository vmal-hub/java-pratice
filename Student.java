public class Student
{
String name;
int rollno;
String address;
String course;


  public static void main (String[]args)
{
 
 Student stud1 = new Student("vimal",52,"chennai","Java");
 stud1.display();
 stud1.displayinfo();
 Student stud2 = new Student();
} 
 public Student(String name, int rollno, String address, String course)
{

this.name=name;
this.rollno=rollno;
this.address=address;
this.course=course;


}

public Student(){


}

public void display(){
    System.out.println("name=>" + name);
    System.out.println("rollno=>" + rollno);
    System.out.println("address=>" + address);
    }
public void displayinfo(){

    System.out.println("course=>" + course);

}
}

    





