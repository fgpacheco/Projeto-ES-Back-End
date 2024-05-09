package br.com.es.projeto.exception;

import br.com.es.projeto.model.dto.ResponseExceptionDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(ClienteException.class)
    public ResponseEntity<ResponseExceptionDTO> ClienteException(ClienteException ex, HttpServletRequest request) {
        ResponseExceptionDTO response = new ResponseExceptionDTO(
                HttpStatus.UNPROCESSABLE_ENTITY.value(),
                HttpStatus.UNPROCESSABLE_ENTITY.getReasonPhrase(),
                LocalDateTime.now().toString(),
                request.getRequestURI(),
                ex.getMessage());


        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(response);

    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ResponseExceptionDTO> handleException(HttpServletRequest request, Exception ex) {
        ResponseExceptionDTO response = new ResponseExceptionDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                LocalDateTime.now().toString(),
                request.getRequestURI(),
                ex.getMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
