package com.gongyu.service;

import com.gongyu.po.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> listCommentById(Long blogId);
    Comment saveComment(Comment comment);
}
