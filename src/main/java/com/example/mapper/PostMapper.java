package com.example.mapper;

import com.example.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {

    void insertPost(PostDTO postDTO);
    PostDTO selectPostById(int id);
    void updatePost(PostDTO postDTO);
    void deletePostById(int id);
    List<PostDTO> selectAllPosts();
    int getPostOwnerId(int postId);
}
