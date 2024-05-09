package br.com.es.projeto.exception;

public class ClienteException extends RuntimeException {

    public ClienteException() {
    }

    public ClienteException(String message) {
        super(message);
    }
}
