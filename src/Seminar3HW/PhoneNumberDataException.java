package Seminar3HW;

public class PhoneNumberDataException extends MyDataException{
    private String phNumber;

    public PhoneNumberDataException(String message, String phNumber) {
        super(message);
        this.phNumber = phNumber;
    }

    public String getPhNumber() {
        return phNumber;
    }
}
