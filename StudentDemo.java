\\First class\\
class Student
{
int id=1;
String name="Keerthi";
String phone="123456";

public void display()
{
System.out.println("student details:" +id +" " +name+" "+phone);
}
}

\\Second Class\\
public class StudentDemo{
public static void main(String[] args)
{

Student std=new Student();
std.display();
}
}
