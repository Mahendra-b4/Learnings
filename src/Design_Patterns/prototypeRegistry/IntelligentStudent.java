package Design_Patterns.prototypeRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }

    /**
     *
     *
     * FLOW:
     *
     * IS ->copy() --> IS(constructor)--> Student(constructor) --> wil create object for student
     * --> IS constructor will be called. --> initialise the values
     *
     *
     */

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
