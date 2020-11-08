package com.blues.lin.mpauto.service.mpuser;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blues.lin.mpauto.vo.mpuser.MpUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author linzg
 * @since 2020-11-08
 */
public interface MpUserService extends IService<MpUser> {

    IPage<MpUser> selectUserPage(Page<MpUser> page);

    MpUser selectMpOne(String id);
}
