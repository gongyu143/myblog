package com.gongyu.dao;

import com.gongyu.po.Blog;
import com.gongyu.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    //父集不为空
    List<Comment> findByBlogIdAndParentCommentNull(Long blogID, Sort sort);
}
