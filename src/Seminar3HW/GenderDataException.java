package Seminar3HW;

public class GenderDataException extends  MyDataException{
    private String gender;

    public GenderDataException(String message, String gender) {
        super(message);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
