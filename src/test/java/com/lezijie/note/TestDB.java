package com.lezijie.note;

import com.lezijie.note.util.DBUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

public class TestDB {
    //使用日志工厂类，记录日志
   private Logger logger=LoggerFactory.getLogger(TestDB.class);
    // 单元测试方法1.方法的返回值，建议使用void，一般没有返回值2.参数列表，建议空参，一般没有参数
    // 3.方法上需要设置@Test注释4.每个方法都能独立运行
    //判定结果：绿色成功 红色失败
    @Test
    public void testDB(){
        System.out.println(DBUtil.getConnection());
        //使用日志
    logger.info("获取数据库连接："+DBUtil.getConnection());
    logger.info("获取数据库连接：{}",DBUtil.getConnection());
    }

}
