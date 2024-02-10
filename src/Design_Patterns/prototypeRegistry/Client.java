package Design_Patterns.prototypeRegistry;


public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
//        Student s1 = new Student();

        Student copyStudent = studentRegistry.get("Aug").copy();
        System.out.println(copyStudent);

        Student copyIntelli = studentRegistry.get("Intelli_Sep").copy();
        System.out.println(copyIntelli);

    }
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student original1 = new Student();
        original1.setBatch("Aug");
        original1.setAverageBatchPsp(90);
        studentRegistry.register("Aug", original1);

        Student original2 = new Student();
        original2.setBatch("Sep");
        original2.setAverageBatchPsp(80);
        studentRegistry.register("Sep", original2);

        IntelligentStudent intelliStudent = new IntelligentStudent();
        intelliStudent.setBatch("Intelli_Sep");
        intelliStudent.setAverageBatchPsp(97);
        studentRegistry.register("Intelli_Sep", intelliStudent);
    }
}
