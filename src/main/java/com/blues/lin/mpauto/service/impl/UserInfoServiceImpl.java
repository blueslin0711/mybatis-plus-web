package com.blues.lin.mpauto.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blues.lin.mpauto.entity.UserInfo;
import com.blues.lin.mpauto.mapper.UserInfoMapper;
import com.blues.lin.mpauto.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linzg
 * @since 2020-11-09
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    @Resource
    UserInfoMapper userInfoMapper;

    @Override
    public IPage<UserInfo> selectUserPage(Page<UserInfo> page) {
        return userInfoMapper.selectPageVo(page);
    }

}
