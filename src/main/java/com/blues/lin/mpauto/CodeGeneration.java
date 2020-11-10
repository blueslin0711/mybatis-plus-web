package com.blues.lin.mpauto;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.blues.lin.mpauto.api.BaseController;

import java.util.Scanner;

/**
 *  @author: haodongdong
 *  @Date: 2020/7/17
 *  @Description: MP自动生成
 */
public class CodeGeneration {

    static String parentPackage = "com.blues.lin.mpauto"; // 父包路径

    static String tablePrefix = "mybatis_"; // 去除表前缀

    static String fieldPrefix = ""; // 去除字段前缀

    static boolean hasSubPackage = false; // 是否需要子包（如server.{subPackage}.***Server.java）

    //main函数
    public static void main(String[] args) {

        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();

        //得到当前项目的路径
        String oPath = System.getProperty("user.dir");

        //生成文件输出根目录
        gc.setOutputDir(oPath + "/src/main/java");

        //生成完成后不弹出文件框
        gc.setOpen(false);

        //文件覆盖
        gc.setFileOverride(false);

        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(false);

        // XML 二级缓存
        gc.setEnableCache(false);

        // XML ResultMap
        gc.setBaseResultMap(true);

        // XML columList
        gc.setBaseColumnList(true);


        // 作者
        gc.setAuthor("linzg");
        gc.setSwagger2(true);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setEntityName("%s");
        autoGenerator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();

        //设置数据库类型
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        //用户名
        dsc.setUsername("****");
        //密码
        dsc.setPassword("****");
        //指定数据库
        dsc.setUrl("jdbc:mysql://****/mybatis_plus_db?useUnicode=true&useSSL=true");
        autoGenerator.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();

        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);

        // 需要生成的表
        String tableName = scanner("请输入需要生成的表名"); // 需要生成的表
        strategy.setInclude(new String[]{tableName});
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        strategy.setSuperControllerClass(BaseController.class);
        strategy.setEntityLombokModel(true);

        //去除表前缀
        strategy.setTablePrefix(tablePrefix);
        //去除字段前缀
        strategy.setFieldPrefix(fieldPrefix);
        autoGenerator.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //父包路径
        pc.setParent(parentPackage);
        String subPackageName = "";
        if (hasSubPackage) {
            subPackageName = "." + StringUtils.underlineToCamel(tableName).toLowerCase();
        }
        pc.setController("api" + subPackageName);
        pc.setService("service" + subPackageName);
        pc.setServiceImpl("service" + subPackageName + ".impl");
        pc.setMapper("mapper" + subPackageName);
        pc.setEntity("entity" + subPackageName);
        pc.setXml("mapper" + subPackageName);
        autoGenerator.setPackageInfo(pc);
        // 执行生成
        autoGenerator.execute();
    }

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }
}