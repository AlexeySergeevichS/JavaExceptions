package Seminar1;

public class CustomArraySizeException extends RuntimeException{
    private final int length1;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return length2;
    }

    private final int length2;
    public CustomArraySizeException(String message, int lenght1,int lenght2) {
        super(message);
        this.length1=lenght1;
        this.length2=lenght2;
    }
}
