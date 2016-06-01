import java.io.*;
public class employee {

String name;
int age;
String designation;

public employee(String name,int age,String desig) {
this.name=name;
this.age=age;
this.designation=desig;
}

public void printempoyee()
{
System.out.println("name is " + this.name);
System.out.println("age is" + this.age);
System.out.println("desig is " + this.designation);

}

}

