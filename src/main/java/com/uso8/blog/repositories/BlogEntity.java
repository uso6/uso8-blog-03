package com.uso8.blog.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BlogEntity {

    private long id;
    private String title;
    private String article;

}
