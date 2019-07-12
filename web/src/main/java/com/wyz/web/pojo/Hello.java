package com.wyz.web.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author T440P
 * @Title: Hello
 * @ProjectName SpringbootDemo
 * @Description: 实体类
 * @date 2019/7/11
 */
@Data
@Component
public class Hello {
    @Value("${wyz.say}")
    private String message;
}
