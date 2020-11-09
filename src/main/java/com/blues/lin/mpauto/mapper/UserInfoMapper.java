package com.blues.lin.mpauto.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blues.lin.mpauto.entity.UserInfo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linzg
 * @since 2020-11-09
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    IPage<UserInfo> selectPageVo(Page<?> page);

}
