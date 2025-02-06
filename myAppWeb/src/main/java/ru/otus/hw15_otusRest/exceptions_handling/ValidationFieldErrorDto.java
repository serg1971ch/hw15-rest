package ru.otus.hw15_otusRest.exceptions_handling;

public class ValidationFieldErrorDto {
    private String field;
    private String message;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidationFieldErrorDto() {
    }

    public ValidationFieldErrorDto(String field, String message) {
        this.field = field;
        this.message = message;
    }
}
