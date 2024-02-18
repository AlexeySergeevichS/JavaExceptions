package Seminar3HW;

public class DateDataException extends MyDataException{
    private String bDate;

    public DateDataException(String message, String bDate) {
        super(message);
        this.bDate = bDate;
    }

    public String getbDate() {
        return bDate;
    }
}
