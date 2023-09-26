package com.myfuturehub.futuionsales.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppResponse {

    private HttpStatus status;
    private String token;

    private String message;

    private Object entity;

    public AppResponse(HttpStatus status) {
        this.status = status;
    }

    public AppResponse(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public AppResponse(HttpStatus status, String message, Object entity) {
        this.status = status;
        this.message = message;
        this.entity = entity;
    }


}
