package com.uso8.blog.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity {

    private String username;
    private String password;
    private Authority authority;

    public enum Authority {
        ADMIN,
        USER,
    }
}
