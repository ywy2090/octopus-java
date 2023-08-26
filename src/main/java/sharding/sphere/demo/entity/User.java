package sharding.sphere.demo.entity;

public class User {
    private String userName;
    private String phoneNumber;
    private String idNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "User{"
                + "userName='"
                + userName
                + '\''
                + ", phoneNumber='"
                + phoneNumber
                + '\''
                + ", idNumber='"
                + idNumber
                + '\''
                + '}';
    }
}
