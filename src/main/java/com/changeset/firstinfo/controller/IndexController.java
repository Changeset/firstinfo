package com.changeset.firstinfo.controller;

import com.changeset.firstinfo.service.FirstinfoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 16:08 2018/4/4
 * @ ModifiedBy:
 */
@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    FirstinfoService firstinfoService;
    @RequestMapping(path = {"/", "/index"}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String index(HttpSession session) {
        return "Hello myfriend," + session.getAttribute("msg")
                + "<br> Say:" + firstinfoService.Say();
    }

    @RequestMapping(value = {"/profile/{groupId}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type", defaultValue = "1") int type,
                          @RequestParam(value = "key", defaultValue = "firstinfo") String key) {
        return String.format("GID{%s}, UID{%d}, TYPE{%d}, KEY{%s}", groupId,
                userId, type, key);
    }
}
