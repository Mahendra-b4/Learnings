package OOPS.accessModifiers;

public class Student {
    public String name;
    int batchId; // default
    protected double psp;
    private String universityName;

    public Student(){
        name = "Ma";
        batchId = 123;
        psp = 95.9;
        universityName = "sdf";
    }

//    parametrised constructor
    public Student(String stname, int stbatchId, double stpsp, String stuniversityName){
        name = stname;
        batchId = stbatchId;
        psp = stpsp;
        universityName = stuniversityName;
    }

//    this keyword take the variable of this class
    public Student(String name, int batchId){
        this.name = name;
        this.batchId = batchId;
    }

    public Student(Student old){
        this.name = old.name;
        this.batchId = old.batchId;
    }
}
