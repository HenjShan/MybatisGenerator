package com.hanshan.mysqlgenerator;

import com.hanshan.mysqlgenerator.entity.Admin;
import com.hanshan.mysqlgenerator.mapper.AdminMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanshan.mysqlgenerator.mapper")
public class MysqlgeneratorApplication implements ApplicationRunner {


    @Autowired(required = false)
    private AdminMapper adminMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Admin admin = adminMapper.selectByPrimaryKey(11L);
        System.out.println(admin);
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlgeneratorApplication.class, args);
    }

}
