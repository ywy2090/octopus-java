package sharding.sphere.demo.entity;

public class BinaryUser {
    private String userName;
    private String phoneNumber;
    private String idNumber;

    private byte[] binaryUserName;

    private byte[] binaryPhoneNumber;
    private byte[] binaryIdNumber;

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

    public byte[] getBinaryUserName() {
        return binaryUserName;
    }

    public void setBinaryUserName(byte[] binaryUserName) {
        this.binaryUserName = binaryUserName;
    }

    public byte[] getBinaryPhoneNumber() {
        return binaryPhoneNumber;
    }

    public void setBinaryPhoneNumber(byte[] binaryPhoneNumber) {
        this.binaryPhoneNumber = binaryPhoneNumber;
    }

    public byte[] getBinaryIdNumber() {
        return binaryIdNumber;
    }

    public void setBinaryIdNumber(byte[] binaryIdNumber) {
        this.binaryIdNumber = binaryIdNumber;
    }
}
