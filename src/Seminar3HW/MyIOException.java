package Seminar3HW;

import java.io.IOException;

public class MyIOException extends IOException {
    private String fileName;

    public MyIOException(String message, String fileName) {
        super(message);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
