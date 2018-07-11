package com.chenfangming.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fangming.chen
 * @since 2018-06-13 12：28
 * Email cfmmail@sina.com
 * Description 程序入口
 */
@SpringBootApplication(scanBasePackages={"com.chenfangming.admin","org.apache.shiro"})
@MapperScan(basePackages = "com.chenfangming.admin.persistence.mapper")
public class AdminApplication {

    /**
     * 主函数
     * @param args 运行参数
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AdminApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
