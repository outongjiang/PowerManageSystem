package prerson.otj.class_practice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import prerson.otj.class_practice.mapper.SysUserMapper;
import prerson.otj.class_practice.pojo.SysUser;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@SpringBootTest
@Transactional
class ClassPracticeApplicationTests {

    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    void contextLoads() throws SQLException {
        List<Long>ids=new ArrayList<Long>();
        ids.add(new Long(2));
        ids.add(new Long(3));
        List<SysUser> sysUsers= sysUserMapper.findAllById(ids);
        System.out.println(sysUsers);
    }
    @Test
    void findByUserNameAndCreateBy(){
        List<SysUser>sysUsers=sysUserMapper.findByUserNameAndCreateBy("惜春","admin");
        System.out.println(sysUsers);
    }

    @Test
    void findByUserName(){
        List<SysUser>sysUsers=sysUserMapper.findByUserName("惜春");
        System.out.println(sysUsers);
    }


    @Test
    void findUser(){
        SysUser sysUser=sysUserMapper.MyfindByUserNameAndUsernick("惜春","惜春");
        System.out.println(sysUser);
    }

    @Test
    public void testdeleteById(){

//        sysUserMapper.deleteAllByIdInBatch(Arrays.asList(new Long(135),new Long(136)));
        SysUser sysUser=new SysUser();
        sysUser.setUserName("张无忌");
        sysUserMapper.delete(sysUser);
    }



    @Test
    public void testMyDelete(){

        sysUserMapper.deleteByUserName("张无忌");
    }



    @Test
    public void testQueryDelete(){

        sysUserMapper.myDel("张无忌");


    }




}
