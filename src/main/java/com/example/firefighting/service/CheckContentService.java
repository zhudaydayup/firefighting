package com.example.firefighting.service;

import com.example.firefighting.dao.check.CheckContentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 15:59 2019/7/22
 * @ Description：${description}
 * @ Modified By：
 */
@Service
public class CheckContentService {
    @Resource
    CheckContentDao checkContentDao;
    public List<Map> getCheckContent(){
        return checkContentDao.getCheckContent();
    }
}
