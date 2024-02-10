package Design_Patterns.prototypeRegistry;

public class Student implements Prototype{
    private String name ;
    private int age ;
    private String batch;

    public Student(){}

    public Student(Student s){
        this.batch = s.batch;
        this.averageBatchPsp = s.averageBatchPsp;
        this.studentPsp = s.studentPsp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    private double averageBatchPsp;
    private double studentPsp;

    public Student copy(){
        Student newStudent = new Student();
//        newStudent.name = this.name;
//        newStudent.age = this.age;
        return new Student(this);
    }
}
