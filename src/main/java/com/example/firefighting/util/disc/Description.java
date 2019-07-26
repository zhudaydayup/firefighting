package com.example.firefighting.util.disc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.firefighting.putData.qintian.CheckRecord;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 10:21 2019/7/25
 * @ Description：${description}
 * @ Modified By：
 */
public class Description {
    public static void main(String[] args) {
        //对象转json对象
        CheckRecord checkRecord = new CheckRecord();
        Object obj1 = JSON.toJSON(checkRecord);
        JSONObject jsonObject1 = JSONObject.parseObject(obj1.toString());
        //对象转json字符串
        String jsonString1 = JSONObject.toJSONString(checkRecord);
        //map转json对象
        Map<String,Object> map = new HashMap<>(5);
        map.put("1","shi");
        Object obj2 = JSON.toJSON(map);
        JSONObject jsonObject2 = JSONObject.parseObject(obj2.toString());
        //json对象转map
        Map<String,Object> map1 = new HashMap<>(5);
        map1.putAll(jsonObject2);
        //map转json字符串
        String jsonString2 = JSONObject.toJSONString(map);
        //json字符串转map:先转成JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString2);
        Map<String,Object> map2 = new HashMap<>(5);
        map2.putAll(jsonObject);
    }
}
