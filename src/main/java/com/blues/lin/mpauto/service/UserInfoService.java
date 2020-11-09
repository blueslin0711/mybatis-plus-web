package com.blues.lin.mpauto.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blues.lin.mpauto.entity.UserInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author linzg
 * @since 2020-11-09
 */
public interface UserInfoService extends IService<UserInfo> {

    IPage<UserInfo> selectUserPage(Page<UserInfo> page);

}
