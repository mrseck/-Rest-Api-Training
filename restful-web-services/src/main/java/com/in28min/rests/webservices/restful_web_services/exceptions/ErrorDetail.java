package com.in28min.rests.webservices.restful_web_services.exceptions;

import java.time.LocalDate;

public class ErrorDetail {
    private LocalDate timestamp;
    private String message;
    private String detail;

    public ErrorDetail(LocalDate timestamp, String message, String detail) {
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }


    public String getDetail() {
        return detail;
    }


    
}


