class Student
 {
    int rollno ;
    int marks;
    String name ;   
}
public class Arrayofstudents {
 public static void main(String[] args)
  {  
   Student s1 = new Student();
   s1.rollno = 1;
   s1.name = " NAVIN";
   s1.marks = 67; 
    Student s2 = new Student();
   s2.rollno = 2;
   s2.name = " harsh";
   s2.marks = 87; 
    Student s3 = new Student();
   s3.rollno = 3;
   s3.name = " kiran";
   s3.marks = 76; 
   Student students [] = new Student[3];
   students[0]=s1;
   students[1]=s2;
   students[2]= s3;
    for (int i =0 ; i<students.length;i++){
        System.err.println(students[i].name + ":" + students[i].marks);
    }


 }
    
}




