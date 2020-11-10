package com.blues.lin.mpauto.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "test_user")
public class UserEntity extends BaseModel {

    private static final long serialVersionUID = 5199200306752426433L;

//    // 第一种主键设置方式
//    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
//    private Integer	id;

    // 第二种简化的主键设置方式
    @IsKey
    @IsAutoIncrement
    @Column
    private Integer	id;

    // 第一种设置索引的方法，这种方法会在数据库默认创建索引名称为actable_idx_{login_name},索引字段为login_name
    @Index
//    // 第二种设置索引的方法，这种方法会在数据库创建索引名称为actable_idx_{t_idx_login_name},索引字段为login_name
//    @Index("t_idx_login_name")
//    // 第三种设置索引的方法，这种方法会在数据库创建索引名称为actable_idx_{t_idx_login_name},索引字段为login_name
//    @Index(value="t_idx_login_name",columns={"login_name"})
//    // 第四种设置索引的方法，可以设置联合索引，这种方法会在数据库创建索引名称为actable_idx_{login_name_mobile},索引字段为login_name和mobile
//    @Index(columns={"login_name","mobile"})
//    // 第五种设置索引的方法，可以设置联合索引，这种方法会在数据库创建索引名称为actable_idx_{login_name_mobile},索引字段为login_name和mobile
//    @Index(value="t_idx_login_name_mobile",columns={"login_name","mobile"})
    // 唯一约束的注解的使用方法，跟@Index相同
    @Unique
    @Column(name = "login_name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String	loginName;

    // column的简化写法，不配置默认使用当前属性名作为字段名，当前类型默认转换至mysql支持的类型
    @Column
    private String	mobile;

    // column的简化写法，根据需要设置注解属性
    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    private Date createTime;

    @Column(name = "update_time",type = MySqlTypeConstant.DATETIME)
    private Date updateTime;

    @Column(name = "number", type = MySqlTypeConstant.INT, length = 10, decimalLength = 2)
    private BigDecimal number;

//    // 第一种设置字段非空的方法
//    @Column(name = "lifecycle",type = MySqlTypeConstant.CHAR,length = 1,isNull=false)
    // 第二种设置字段非空的方法
    @IsNotNull
    @Column
    private String	lifecycle;

    @Column
    private String	realName;
}