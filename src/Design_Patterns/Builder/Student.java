package Design_Patterns.Builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String universityName;
    private int gradYear;

    private Student(Builder builder){
//        Validations
//        if(builder.getGradYear() > 2022){
//            throw new IllegalArgumentException("Invalid Grad Year");
//        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.universityName = builder.getUniversityName();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder(){
        return new Builder();
    }


//    Inner Class -> Design_Patterns.Builder

    public static class Builder {
        private String name;
        private int age;
        private String batch;
        private String universityName;
        private int gradYear;

        public Student build(){
            // Validations
            if(getGradYear() > 2022){
                throw new IllegalArgumentException("Invalid Grad Year");
            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }

}
