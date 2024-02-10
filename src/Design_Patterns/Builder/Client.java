package Design_Patterns.Builder;

public class Client {
    public static void main(String[] args) {
//        Design_Patterns.Builder builder = new Design_Patterns.Builder();

//        Design_Patterns.Builder builder = Student.getBuilder();
//
//        builder.setName("Mahendra");
//        builder.setAge(24);
//        builder.setBatch("Sep-2022");
//        builder.setUniversityName("IARE");
//        builder.setGradYear(2023);

        Student student = Student.getBuilder() // will create & return builder object, as we are calling getBuilder from Student we made it as static
                                 .setName("Babu") // return builder object
                                 .setAge(24) // return builder object
                                 .setBatch("Oct-2022") // return builder object
                                 .setUniversityName("JNTU") // return builder object
                                 .setGradYear(2021) // return builder object
                                 .build(); // create and retrun student object


//        Student student = new Student(builder);
//        Student student = builder.build();
//        Student st2 = new Student(null);
        Student st3 = Student.getBuilder().setName("MB").setGradYear(2020).build();
        System.out.println("Debug");

    }
}
