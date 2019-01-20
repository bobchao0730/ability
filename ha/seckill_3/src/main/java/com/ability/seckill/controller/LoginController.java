package com.ability.seckill.controller;
import com.ability.seckill.result.Result;
import com.ability.seckill.service.SeckillUserService;
import com.ability.seckill.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Copyright (C): :
 * FileName: LoginController
 *
 * @author caobo
 * @create 2019-1-2 17:06
 * @since 1.0.0
 * Description:
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private SeckillUserService userService;

    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/doLogin")
    @ResponseBody
    public Result<Boolean> doLogin(HttpServletResponse response, @Valid LoginVo loginVo){
        log.info(loginVo.toString());
        //登录
        userService.login(response,loginVo);
        return Result.success(true);
    }


}
