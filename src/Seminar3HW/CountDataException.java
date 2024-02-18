package Seminar3HW;

public class CountDataException extends MyDataException{
    private int count;

    public CountDataException(String message, int count) {
        super(message);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
