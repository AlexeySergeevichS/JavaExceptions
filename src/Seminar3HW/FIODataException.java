package Seminar3HW;

public class FIODataException extends MyDataException{
    private int i;
    private String fio;

    public FIODataException(String message, int i, String fio) {
        super(message);
        this.i = i;
        this.fio = fio;
    }

       public String getFio() {
        switch (this.i){
            case 0 -> {return String.format("фамилию '%s'" , fio);}
            case 1 -> {return String.format("имя '%s'" , fio);}
            case 2 -> {return String.format("отчество '%s'" , fio);}
            default -> {
                return fio;
            }
        }

    }
}
