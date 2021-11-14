package com.gongyu;

import com.gongyu.po.Blog;
import com.gongyu.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Pageable;

@SpringBootTest
class MyblogApplicationTests {

    @Autowired
    private BlogService blogService;

    @Test
    void contextLoads() {

        Blog blog = blogService.getBlog(25l);
        System.out.println(blog);
    }

}
