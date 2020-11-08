package com.blues.lin.mpauto.api.mpuser;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blues.lin.mpauto.api.BaseController;
import com.blues.lin.mpauto.core.model.R;
import com.blues.lin.mpauto.service.mpuser.MpUserService;
import com.blues.lin.mpauto.vo.mpuser.MpUser;
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
 * @since 2020-11-08
 */
@Controller
@RequestMapping("/mpUser")
public class MpUserController extends BaseController {

    @Resource
    MpUserService mpUserService;

    @GetMapping(value = "/getOne")
    public @ResponseBody
    R getOne(@RequestParam(required = true) String id) {
        MpUser vo = this.mpUserService.getOne(new QueryWrapper<MpUser>().eq("id", id));
        System.out.println(vo);
        return R.data(vo);
    }

    @GetMapping(value = "/selectPageVo")
    public @ResponseBody
    R selectPageVo(@RequestParam(required = true) String id) {
        Page<MpUser> page = new Page<>(1, 5);
        IPage<MpUser> mpUserIPage = this.mpUserService.selectUserPage(page);
        System.out.println(mpUserIPage);
        return R.data(mpUserIPage);
    }
}

