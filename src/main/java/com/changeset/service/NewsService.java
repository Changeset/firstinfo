package com.changeset.service;

import com.changeset.dao.NewsDAO;
import com.changeset.model.News;
import com.changeset.util.FirstinfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:29 2018/4/4
 * @ ModifiedBy:
 */
@Service
public class NewsService {
    @Autowired
    private NewsDAO newsDAO;

    public List<News> getLatestNews(int userId, int offset, int limit) {
        return newsDAO.selectByUserIdAndOffset(userId, offset, limit);
    }

    public int updateCommentCount(int id, int count) {
        return newsDAO.updateCommentCount(id, count);
    }

    public String saveImage(MultipartFile file) throws IOException {
        int doPos = file.getOriginalFilename().lastIndexOf(".");
        if (doPos < 0) {
            return null;
        }
        String fileExt = file.getOriginalFilename().substring(doPos + 1);
        if (!FirstinfoUtil.isFileAllowed(fileExt)) {
            return null;
        }
        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." +fileExt;
        Files.copy(file.getInputStream(), new File(FirstinfoUtil.IMAGE_DIR).toPath(),
                StandardCopyOption.REPLACE_EXISTING);
        return FirstinfoUtil.FIRST_INFO_DOMAIN + "image?name=" + fileName;
    }
}
