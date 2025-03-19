package checked;

public class InvalidFilenameException extends Exception{


    private String errorCode;


    public InvalidFilenameException(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {return this.errorCode;}
}
