import java.util.Scanner;
class Roll {
public static void main(String arg[]) {
System.out.println("Enter name,DOB,DEPT,college name");
Scanner scan=new Scanner(System.in);
String name=scan.nextLine();
String dob=scan.nextLine();
String dept=scan.nextLine();
String college=scan.nextLine();
String rollno=college.substring(0,1)+dept.substring(0,2)+dob.substring(0,2)+name.substring(0,4)+dob.substring(3,5)+dob.substring(8);

System.out.println("ROLL NO:"+rollno);
}
}
