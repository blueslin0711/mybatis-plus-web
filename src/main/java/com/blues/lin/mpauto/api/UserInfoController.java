package com.blues.lin.mpauto.api;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blues.lin.mpauto.core.model.R;
import com.blues.lin.mpauto.entity.UserInfo;
import com.blues.lin.mpauto.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author linzg
 * @since 2020-11-09
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController {

    @Resource
    UserInfoService userInfoService;

    @GetMapping(value = "/getOne")
    public @ResponseBody
    R getOne(@RequestParam(required = true) String id) {
        UserInfo vo = this.userInfoService.getOne(new QueryWrapper<UserInfo>().eq("id", id));
        System.out.println(vo);
        return R.data(vo);
    }

    @GetMapping(value = "/selectPageVo")
    public @ResponseBody
    R selectPageVo(@RequestParam(required = true) String id) {
        Page<UserInfo> page = new Page<>(1, 5);
        IPage<UserInfo> UserInfoIPage = this.userInfoService.selectUserPage(page);
        System.out.println(UserInfoIPage);
        return R.data(UserInfoIPage);
    }

    @GetMapping(value = "/test")
    public @ResponseBody
    R test(@RequestParam(required = true) String id) {
        return R.data("test");
    }
}

