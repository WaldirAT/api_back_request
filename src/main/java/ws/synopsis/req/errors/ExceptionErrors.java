package ws.synopsis.req.errors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionErrors {
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInformation> methodArgumentNotValidException(HttpServletRequest request,
			MethodArgumentNotValidException e) {
		ErrorInformation errorInfo = new ErrorInformation(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorInformation> manejarTodasExcepciones(Exception ex, WebRequest request){
		ErrorInformation exceptionResponse = new ErrorInformation(1, "ERROR al insertar datos!!");
		return new ResponseEntity<ErrorInformation>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
