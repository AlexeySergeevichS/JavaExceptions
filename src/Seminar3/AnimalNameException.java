package Seminar3;

public class AnimalNameException extends AnimalException{
    private final String name;

    public AnimalNameException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
