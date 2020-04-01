package com.team.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * @Description TODO
 * @ClassName Payment.java
 * @Author HuangXuPing
 * @CreateTime 2020年03月26日 14:49:00
 * @Version 1.0
 * @History
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
