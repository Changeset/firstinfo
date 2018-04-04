package com.changeset.firstinfo.service;

import com.changeset.firstinfo.dao.NewsDAO;
import com.changeset.firstinfo.model.News;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:29 2018/4/4
 * @ ModifiedBy:
 */
public class NewsService {
    @Autowired
    private NewsDAO newsDAO;

    public List<News> getLastestNews(int userId, int offset, int limit) {
        return newsDAO.selectByUserIdAndOffset(userId, offset, limit);
    }
}
