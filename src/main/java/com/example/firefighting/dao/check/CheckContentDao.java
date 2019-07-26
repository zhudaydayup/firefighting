package com.example.firefighting.dao.check;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 15:42 2019/7/22
 * @ Description：${description}
 * @ Modified By：
 */
@Mapper
public interface CheckContentDao {
//    @Select("select * from Fire_CHECKED_CONTENT")
    /**
     * 获取检查内容
     * @return list
     */
    List<Map> getCheckContent();
}
