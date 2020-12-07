import java.util.Scanner;

public class Student {
    String name;
    Integer rollNo;
    static String collegeName;
    static Integer counter=0;

    public Student(String name) {
        this.name = name;
        this.rollNo = setRollNo();
    }

    static int setRollNo(){
        return counter++;
    }

    static void setCllg(String name){
        collegeName = name;
    }

    public void getStudentInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Roll No: "+this.rollNo);
        System.out.println("College: "+collegeName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter College name:");
        String coll = sc.nextLine();

        Student s1 = new Student(name);
        Student.setCllg(coll);

        System.out.println();
        s1.getStudentInfo();
        System.out.println();

        System.out.print("Enter Name:");
        name = sc.nextLine();
        System.out.print("Enter College name:");
        coll = sc.nextLine();
        sc.close();

        Student s2 = new Student(name);
        Student.setCllg(coll);

        System.out.println();
        s2.getStudentInfo();
        System.out.println();
    }
}
