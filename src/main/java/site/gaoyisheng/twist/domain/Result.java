package site.gaoyisheng.twist.domain;

public class Result<T> {

    /**
     * 返回码 .
     */
    private int code;

    /**
     * 返回消息 .
     */
    private String message;

    /**
     * 返回数据.
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
