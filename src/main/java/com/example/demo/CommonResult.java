package com.example.demo;

import lombok.Data;

/**
 * @author Zhangchao
 * @date 2020/8/5 9:14
 * @description xxx
 */
@Data
public class CommonResult<T> {
    private Code code;
    private T data;

    public CommonResult(Code code, T data) {
        this.code = code;
        this.data = data;
    }
}
