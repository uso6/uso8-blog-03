package com.uso8.blog.services;

import com.uso8.blog.repositories.BlogEntity;
import com.uso8.blog.repositories.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public List<BlogEntity> findAll(){
        return blogRepository.findAll();
    }

    @Transactional
    public void create(String title, String article){
        blogRepository.insert(title, article);
    }

    public BlogEntity findById(long blogId){
        return blogRepository.findById(blogId);
    }

}
