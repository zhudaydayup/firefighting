package com.example.firefighting.util.putdata;

import com.alibaba.fastjson.JSONObject;
import com.example.firefighting.result.Result;
/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 14:41 2019/7/24
 * @ Description：${description}
 * @ Modified By：
 */
public class PutDataUtil {
    /**
     * 推送数据参数为对象时使用此方法，POST方式推送
     * 注意：推送方法，GET和POST必须大写。
     * @param src 推送数据链接
     * @param obj 推送数据对象
     * @return Result：0表示数据推送过去了，0但是返回msg不是成功应该返回的：推送过去，但字段有问题
     */
    public static Result postByObj(String src, Object obj)  {
        String myData = JSONObject.toJSONString(obj);
        String method = "POST";
        String authorization = "Basic ZW1fc291cmNlOlBAc3N3MHJkU2t5bmo";
        try {
            return ConnUtil.getResult(myData, src, method, authorization);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("发生异常");
        }
    }

    /**
     * GET方式推送：参数为对象
     */
    public static Result getByObj(String src, Object obj)  {
        String myData = JSONObject.toJSONString(obj);
        String method = "GET";
        String authorization = "Basic ZW1fc291cmNlOlBAc3N3MHJkU2t5bmo";
        try {
            return ConnUtil.getResult(myData, src, method, authorization);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("发生异常");
        }
    }

    /**
     * GET推送数据：参数为JSONObject对象
     */
    public static Result getByJsonObj(String src, JSONObject obj)  {
        String myData = obj.toJSONString();
        String method = "GET";
        String authorization = "Basic ZW1fc291cmNlOlBAc3N3MHJkU2t5bmo";
        try {
            return ConnUtil.getResult(myData, src, method, authorization);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("发生异常");
        }
    }
    /**
     * POST推送数据：参数为JSONObject对象
     */
    public static Result postByJsonObj(String src, JSONObject obj)  {
        String myData = obj.toJSONString();
        String method = "POST";
        String authorization = "Basic ZW1fc291cmNlOlBAc3N3MHJkU2t5bmo";
        try {
            return ConnUtil.getResult(myData, src, method, authorization);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("发生异常");
        }
    }
}
