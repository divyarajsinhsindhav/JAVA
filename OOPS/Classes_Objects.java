package OOPS;

public class Classes_Objects {

    public static void main(String[] args){
        Student S1 = new Student(); //Create new Student object S1
        S1.setDetails("Divyarajsinh", 59, 7);

        System.out.println(S1.getName());
        System.out.println(S1.getRoll_No());
        System.out.println(S1.getCPI());

        Student S2 = new Student(S1);

        Faculty f1 = new Faculty("Devid Malan", 50, "CS");
        Faculty.university = "Harverd University";
        System.out.println(f1.university);
        Faculty f2 = new Faculty();
        System.out.println(f2.university);
        // System.out.println(f1);
    }  
}

class Student{
    private String name;
    int Roll_No;
    int CPI;

    Student(){
        System.out.println("Student Object is Created");
    }

    void setDetails(String name, int Roll_No, int CPI){
        this.name = name;
        this.Roll_No = Roll_No;
        this.CPI = CPI;
    }
    String getName(){
        return this.name;
    }
    int getRoll_No(){
        return this.Roll_No;
    }
    int getCPI(){
        return this.CPI;
    }

    //Copy Constructor
    Student(Student S1){
        this.name = S1.name;
        this.Roll_No = S1.Roll_No;
        this.CPI = S1.CPI;
    }

}

class Faculty{
    String name;
    int age;
    String department;
    static String university;
    Faculty(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Constructor is Called.....");
    }
    Faculty(){
        System.out.println("Faculty is called");
    }
}