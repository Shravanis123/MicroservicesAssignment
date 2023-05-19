package LearnMicroservices.departementservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(DepartmentNotFountException.class)
    public ResponseEntity<ErrorMessage> handleDepartmentNotFoundException(DepartmentNotFountException departmentNotFountException,
                                                                          WebRequest webRequest){
        ErrorMessage errorMessage=new ErrorMessage(
                LocalDateTime.now(),
                webRequest.getDescription(false),
                "DEPARTMENT_NOT_FOUND"
        );
        return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
    }
}
