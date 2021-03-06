package com.blues.lin.mpauto.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author linzg
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mybatis_user_info")
@Table("mybatis_user_info")
@ApiModel(value="UserInfo对象", description="")
public class UserInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    @Column(comment = "id", type = MySqlTypeConstant.INT, length = 12, isKey = true, isAutoIncrement = true)
    private Integer id;

    @ApiModelProperty(value = "名字")
    @Column(comment = "name")
    private String name;

    @ApiModelProperty(value = "账号")
    @Column(comment = "account")
    private String account;

    @ApiModelProperty(value = "密码")
    @Column(comment = "password")
    private String password;

    @ApiModelProperty(value = "邮箱")
    @Column(comment = "email")
    private String email;

    @ApiModelProperty(value = "年龄")
    @Column(comment = "age", type = MySqlTypeConstant.INT, length = 6)
    private Integer age;

}
