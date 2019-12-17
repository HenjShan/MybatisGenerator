package com.hanshan.mysqlgenerator;

import com.hanshan.mysqlgenerator.entity.Admin;
import com.hanshan.mysqlgenerator.entity.AdminExample;
import com.hanshan.mysqlgenerator.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlgeneratorApplicationTests {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    @Test
    public void contextLoads() {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminIdEqualTo(7L);
        Admin admin1 = adminMapper.selectByPrimaryKey(7l);
        System.out.println(admin1);
    }

    @Test
    public void testarticle(){
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminAccountNotLike("000");
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        for (Admin admin: admins
             ) {
            System.out.println(admin);
        }
    }

}
