package com.myfuturehub.futuionsales.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthRequest {
    private String userName ;
    private String password;
}
