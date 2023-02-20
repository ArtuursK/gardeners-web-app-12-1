package com.gardeners.app.mapper;

import com.gardeners.app.entities.Post;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GardenerPostMapper implements RowMapper<Post> {

    @Override
    public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
        Post post = new Post();
        post.setId(rs.getInt("post_id"));
        post.setDescription(rs.getString("description"));
        post.setAuthorName(rs.getString("username"));
        post.setDatetime(rs.getTimestamp("datetime"));
        return post;
    }
}
