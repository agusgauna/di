package ar.com.ada.sb.api.di.exception.validation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiFieldError {
    private String field;
    private String code;
    private String message;

    public ApiFieldError(String field, String code, String message) {
        this.field = field;
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ApiFieldError {" +
                "field=" + field +
                ", code=" + code +
                ", message=" + message + '\'' +
                " }";
    }
}