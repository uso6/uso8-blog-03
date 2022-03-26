package com.uso8.blog.controllers;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class BlogForm {

    @NotBlank
    @Size(max=256)
    private String title;

    @NotBlank
    private String article;

}
