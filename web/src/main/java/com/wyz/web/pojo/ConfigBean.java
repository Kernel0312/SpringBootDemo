package com.wyz.web.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @author T440P
 * @Title: ConfigBean
 * @ProjectName SpringbootDemo
 * @Description: 配置类，读取配置文件信息
 * @date 2019/7/12
 */
@Data
@ConfigurationProperties(prefix = "wyz.app")
@Component
public class ConfigBean {
    private String name;
    private String message;
}
