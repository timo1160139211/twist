package site.gaoyisheng.twist.util;

import site.gaoyisheng.twist.domain.Result;

/**
 * 返回工具.
 */
public class ResultUtil {

    /**
     * .
     * @param object 数据参数
     * @return
     */
    public static Result success(Object object){

        Result result = new Result();

        result.setCode(0);//成功
        result.setMessage("成功");
        result.setData(object);

        return result;
    }

    /**
     * .
     * @param code 错误码
     * @param message 错误消息
     * @return
     */
    public static Result error(Integer code,String message){

        Result result = new Result();

        result.setCode(code);//返回错误码
        result.setMessage(message);

        return result;
    }
}
