package com.example.firefighting.result;

import lombok.Data;

/**
 * @author ：努力吧小朱.
 * @version : Java1.8
 * @date ：Created in 16:44 2019/7/22
 * @ Description：${description}
 * @ Modified By：
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;

    public Result() {
    }

    /**
     * 成功时方法
     */

    public static<T> Result<T> success(String msg,T data){
        return new Result<>(0,msg,data);
    }
    public static<T> Result<T> success(String msg){
        return new Result<>(0,msg);
    }
    /**
     * 失败或错误时方法
     */
    public static<T> Result<T> fail(String msg){
        return new Result<>(1,msg);
    }
    public Result(int code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
