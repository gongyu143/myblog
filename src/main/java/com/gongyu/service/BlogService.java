package com.gongyu.service;

import com.gongyu.po.Blog;
import com.gongyu.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {

    Blog getBlog(Long id);

    Blog getAndConvert(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    Page<Blog> listBlog(Long tagId,Pageable pageable);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id , Blog blog);

    void deleteBlog(Long id);

    List<Blog> listBlogTop(Integer size);

    List<Blog> listRecommendBlogTop(Integer size);



}
