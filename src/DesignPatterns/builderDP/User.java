package DesignPatterns.builderDP;

public class User {
    private final String userName;
    private final String userId;
    private final String emailId;


    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    private User(UserBuilder userBuilder) {
        this.emailId = userBuilder.emailId;
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
    }

    public static UserBuilder getBuilder(){
        return new UserBuilder();
    }

    public static class UserBuilder{
        private String userName;
        private String userId;
        private String emailId;

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
