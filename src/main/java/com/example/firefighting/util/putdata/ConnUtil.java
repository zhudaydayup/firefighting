package com.example.firefighting.util.putdata;

import com.alibaba.fastjson.JSONObject;
import com.example.firefighting.result.Result;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 09:49 2019/7/25
 * @ Description：${description}
 * @ Modified By：
 */
public class ConnUtil {
    /**
     * 推送数据具体实施工具
     * @param myData 推送的json字符串
     * @param src 推送的链接
     * @param method 推送方法
     * @param authorization 推送权限
     * @return Result封装数据
     * @throws Exception IO异常
     */
    public static Result getResult(String myData,String src,String method,String authorization) throws Exception {
        URL url = new URL(src);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization",authorization);
        conn.setRequestProperty("Content-Type","application/json");
        conn.setRequestMethod(method);
        conn.setDoOutput(true);
        PrintWriter writer = new PrintWriter(conn.getOutputStream());
        writer.write(myData);
        writer.flush();
        InputStream in = conn.getInputStream();
        StringBuilder stringBuilder = new StringBuilder();
        int len = 0;
        byte[] data = new byte[1024];
        while ((len = in.read(data,0,data.length))!=-1){
            stringBuilder.append(new String(data,0,len));
        }
        writer.close();
        in.close();
        JSONObject jsonObject = JSONObject.parseObject(stringBuilder.toString());
        return Result.success(jsonObject.get("msg").toString());
    }
}
