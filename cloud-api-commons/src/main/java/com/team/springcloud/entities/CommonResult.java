package com.team.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 全局返回类
 * @ClassName CommonResult.java
 * @Author HuangXuPing
 * @CreateTime 2020年03月26日 14:49:00
 * @Version 1.0
 * @History
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 not_found
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
