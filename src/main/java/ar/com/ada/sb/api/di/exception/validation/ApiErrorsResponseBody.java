package ar.com.ada.sb.api.di.exception.validation;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.Timestamp;


@Getter
@Setter
@NoArgsConstructor
public class ApiErrorsResponseBody {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private Timestamp timestamp;
    private Integer status;
    private String error;
    private List<T> errors;

    public ApiErrorsResponseBody(Integer status, String error, List<T> errors) {
        this.timestamp = new Timestamp(System.currentTimeMillis());
        this.status = status;
        this.error = error;
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ApiErrorsResponseBody {" +
                "timestamp=" + timestamp +
                ", status=" + status +
                ", error=" + error +
                ", errors=" + errors +
                " }";
    }
}
