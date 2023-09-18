package OOPS;

public class introduction{
    public static void main(String[] args) {
        //Data of 5 students: {roll no, name, marks}
        int[] roll_no = new int[5];
        String[] name = new String[5];
        int[] marks = new int[5];

        Students peter = new Students(1, "Peter Parker", 18);
        // peter.roll_no = 59;
        // peter.name = "Peter Parker";
        // peter.marks = 45;

        peter.greeting();

        System.out.println(peter.roll_no);
        System.out.println(peter.name);
        System.out.println(peter.marks);

        Students random1 = new Students(peter);
        System.out.println(random1.name);

        Students random2 = new Students();
        System.out.println(random2.name);

        Students one = new Students();
        Students two = one;

        one.name = "Something";
        System.out.println(two.name);

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "Other Name";

        //We can change the value but we can't reassign it.(When non primitive is final)
        //kunal = new A("new Object");

        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A("Object");
        }


    }
}

class Students{
    int roll_no;
    String name;
    int marks;

    void greeting(){
        System.out.println("Hello " + this.name + " Welcome to the JAVA ");
    }

    Students (Students other) {
        this.name = other. name;
        this.roll_no = other. roll_no;
        this.marks = other. marks;
    }

    Students(){
        //This is how we can call a constructor from another constructor.
        //Internally: new Students(2, "Miles", 89);
        this(2, "Miles", 89);
    }

    //'this' key word
    // Students(){
    //     this.roll_no = 56;
    //     this.name = "Tom Hollend";
    //     this.marks = 59;
    // }

    //Constructor Overloading
    //Student Arpit = new Student(59, "Arpit", 89);
    //Here, 'this' will replace with 'Arpit'
    Students(int roll_no, String name, int marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
}

class A{
    //When Primitive is final we can't change the value.
    final int number = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is Destroyed.");
    }
}