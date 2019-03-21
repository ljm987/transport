package com.transport.common;


public class Response<T> {

    private String code;
    private String message;
    private T data;

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(T data) {
        this.data = data;
    }

    public Response(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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


    public static <T> Response ok(T data){
        return new Response(ReturnCode.SUCCESS.getCode(),ReturnCode.SUCCESS.getMessage(),data);
    }

    public static <T> Response exception(BusinessException e){
        return new Response(e.getErrorCode(),e.getMessage());
    }

}
