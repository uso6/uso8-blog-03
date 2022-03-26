package com.uso8.blog.controllers;

import com.uso8.blog.services.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @GetMapping
    public String showList(Model model){
        model.addAttribute("blogList", blogService.findAll());
        return "blog/listBlog";
    }

    @GetMapping("/postBlog")
    public String showCreateBlog(@ModelAttribute BlogForm form){
        return "blog/postBlog";
    }

    @PostMapping
    public String create(@Validated BlogForm form, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return showCreateBlog(form);
        }
        blogService.create(form.getTitle(), form.getArticle());
        return "redirect:/blog";
    }

    @GetMapping("/{blogId}")
    public String showDetail(@PathVariable("blogId") long blogId, Model model){
        model.addAttribute("blog", blogService.findById(blogId));
        return "blog/detailBlog";
    }

}
