package mx.com.axity.commons.to;

import java.io.Serializable;

public class ErrorTO implements Serializable {
    private Long errorCode;
    private String errorMessage;

    public ErrorTO() {
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
