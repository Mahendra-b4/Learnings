package Design_Patterns.Builder;

public class OldBuilder {
    private String name;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;

//    public Student build(){
//        // Validations
//        if(getGradYear() > 2022){
//            throw new IllegalArgumentException("Invalid Grad Year");
//        }
//        return new Student(this);
//    }

    public String getName() {
        return name;
    }

    public OldBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public OldBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public OldBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public OldBuilder setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public int getGradYear() {
        return gradYear;
    }

    public OldBuilder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }
}
