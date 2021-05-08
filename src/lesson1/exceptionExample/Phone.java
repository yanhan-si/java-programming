package lesson1.exceptionExample;

public class Phone {
    private String phoneNumber;
    private String phoneType;

    public Phone (String phoneNumber, String phoneType) {

        if (phoneType == null || phoneNumber == null) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }

        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return phoneType + " " + phoneNumber;
    }
}
