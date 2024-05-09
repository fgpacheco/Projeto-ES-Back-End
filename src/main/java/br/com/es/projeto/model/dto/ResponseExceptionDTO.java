package br.com.es.projeto.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class ResponseExceptionDTO implements Serializable {

    private int statusCode;
    private String error;
    private String timestamp;
    private String path;
    private String message;

    public ResponseExceptionDTO() {
    }

    public ResponseExceptionDTO(int statusCode, String error, String timestamp, String path, String message) {
        this.statusCode = statusCode;
        this.error = error;
        this.timestamp = timestamp;
        this.path = path;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "ResponseExceptionDTO{" +
                "statusCode=" + statusCode +
                ", error='" + error + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", path='" + path + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
