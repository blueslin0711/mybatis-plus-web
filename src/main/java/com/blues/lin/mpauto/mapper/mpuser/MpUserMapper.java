package com.blues.lin.mpauto.mapper.mpuser;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blues.lin.mpauto.vo.mpuser.MpUser;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linzg
 * @since 2020-11-08
 */
public interface MpUserMapper extends BaseMapper<MpUser> {

    IPage<MpUser> selectPageVo(Page<?> page);

    MpUser selectMpOne(String id);
}
