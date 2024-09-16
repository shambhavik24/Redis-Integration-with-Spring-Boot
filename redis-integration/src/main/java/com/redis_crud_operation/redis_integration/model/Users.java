package com.redis_crud_operation.redis_integration.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users implements Serializable {

    private String UserId;
    private String name;
    private String email;
    private String phoneNumber;
}
