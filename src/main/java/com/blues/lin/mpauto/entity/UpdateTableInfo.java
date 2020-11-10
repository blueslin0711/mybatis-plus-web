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
@TableName("update_table_info")
@Table("update_table_info")
@ApiModel(value="UpdateTableInfo对象", description="")
public class UpdateTableInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    @Column(length = 15, type = MySqlTypeConstant.INT, isAutoIncrement = true, isKey = true, comment = "id")
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
    @Column(type = MySqlTypeConstant.INT, length = 5, comment = "age")
    private Integer age;


}
