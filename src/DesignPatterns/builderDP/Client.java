package DesignPatterns.builderDP;

public class Client {
    public static void main(String[] args) {
        User user = User.getBuilder()
                        .setUserName("Mahe")
                        .setUserId("9")
                        .setEmailId("mahendra@gmail.com")
                        .build();

        System.out.println(user);

        User user2 = User.getBuilder()
                .setUserName("Mahendra")
                .setUserId("99")
                .build();

        System.out.println(user2);
    }
}
