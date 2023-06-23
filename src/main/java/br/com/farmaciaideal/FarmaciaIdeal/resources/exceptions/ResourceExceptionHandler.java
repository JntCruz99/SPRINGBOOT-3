package br.com.farmaciaideal.FarmaciaIdeal.resources.exceptions;

import br.com.farmaciaideal.FarmaciaIdeal.services.exceptions.ResourceNotFooundExceptions;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFooundExceptions.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFooundExceptions e, HttpServletRequest request){
        String erro = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value() ,erro ,e.getMessage() ,request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
