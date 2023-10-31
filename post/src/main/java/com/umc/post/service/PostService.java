package com.umc.post.service;

import com.umc.post.data.dto.PostDto;
import com.umc.post.data.entity.Post;

import java.util.List;

public interface PostService {
    void upload(PostDto postDto);

    List<Post> getAllPost();

    Post getPostById(Long id);
}
