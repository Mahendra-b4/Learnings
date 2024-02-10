package OOPS.accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Debug");
//        student.universityName = "MM University"; -> Not accessible as universityName is private
        student.name = "Mahendra";
        student.batchId = 234;
        student.psp = 92.4;

        Student st1 = new Student("Maha", 2345, 98.78, "ert");
        System.out.println("Debug2");

        Student st2 = new Student("MB", 5678);
        System.out.println("Debug3");

//        student and st3 will have same address
        Student st3 = student;
        st3.name = "MBB";
        System.out.println("Debug4");

        Student st4 = new Student(st1);
        System.out.println("Debug");
    }


}
