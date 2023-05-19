package LearnMicroservices.departementservice.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private LocalDateTime timestamp;
    private String path;
    private String errorMessage;

}
