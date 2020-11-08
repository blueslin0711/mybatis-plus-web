package com.blues.lin.mpauto.service.mpuser.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blues.lin.mpauto.mapper.mpuser.MpUserMapper;
import com.blues.lin.mpauto.service.mpuser.MpUserService;
import com.blues.lin.mpauto.vo.mpuser.MpUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linzg
 * @since 2020-11-08
 */
@Service
public class MpUserServiceImpl extends ServiceImpl<MpUserMapper, MpUser> implements MpUserService {

    @Resource
    MpUserMapper mpUserMapper;

    @Override
    public MpUser selectMpOne(String id) {
        return mpUserMapper.selectMpOne(id);
    }

    @Override
    public IPage<MpUser> selectUserPage(Page<MpUser> page) {
        return mpUserMapper.selectPageVo(page);
    }
}
