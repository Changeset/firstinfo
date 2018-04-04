package com.changeset.firstinfo.dao;

import com.changeset.firstinfo.model.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:36 2018/4/4
 * @ ModifiedBy:
 */
@Mapper
public interface NewsDAO {
    String TABLE_NAME = "news";
    String INSERT_FIELDS = " title, link, image, like_count, comment_count, create_date, user_id ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
    ") values (#{title}, #{link}, #{image}, #{likeCount}, #{commentCount}, #{createDate}, #{userId}"})
    int addNews(News news);

    List<News> selectByUserIdAndOffset(@Param("userId") int userId, @Param("offset") int offset,
                                       @Param("limit") int limit);
}
