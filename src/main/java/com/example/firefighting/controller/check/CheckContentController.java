package com.example.firefighting.controller.check;

import com.example.firefighting.result.Result;
import com.example.firefighting.service.CheckContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 16:02 2019/7/22
 * @ Description：${description}
 * @ Modified By：
 */
@Controller
@RequestMapping("checkContent")
public class CheckContentController {
    @Autowired
    CheckContentService checkContentService;
    @RequestMapping("getCheckContent")
    @ResponseBody
    public Result getCheckContent(){
        List<Map> checkContent = checkContentService.getCheckContent();
        if(checkContent!=null){
            return Result.success("查询成功", checkContent);
        }else {
            return Result.fail("查询失败");
        }
    }
}
