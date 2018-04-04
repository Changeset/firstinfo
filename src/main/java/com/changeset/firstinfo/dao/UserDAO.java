package com.changeset.firstinfo.dao;

import com.changeset.firstinfo.model.User;
import org.apache.ibatis.annotations.*;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:35 2018/4/4
 * @ ModifiedBy:
 */
@Mapper
public interface UserDAO {
    String TABLE_NAME = "user";
    String INSERT_FIELDS = " name, password, salt, head_url ";
    String SELECT_FIELDS = " id, name, password, salt, head_url";

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{name}, #{password}, #{salt}, #{head_url})"})
    int addUser(User user);

    @Select({"update", TABLE_NAME, " set password=#{password} where id=#{id}"})
    User selectById(int id);

    @Update({"update ", TABLE_NAME, " set password=#{password} where id=#{id}"})
    void updatePassword(User user);

    @Delete({"delete from ", TABLE_NAME, " where id=#{id}"})
    void deleteById(int id);
}
