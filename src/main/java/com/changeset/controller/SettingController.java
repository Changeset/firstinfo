package com.changeset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author: Xuelong Liao
 * @ Description:
 * @ Date: created in 19:50 2018/4/8
 * @ ModifiedBy:
 */
@Controller
public class SettingController {
    @RequestMapping("/setting")
    @ResponseBody
    public String setting() {return "Setting:OK"; }
}
