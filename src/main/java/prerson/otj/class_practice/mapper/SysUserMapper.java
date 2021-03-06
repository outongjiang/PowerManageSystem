package prerson.otj.class_practice.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import prerson.otj.class_practice.pojo.SysUser;

import java.util.List;

public interface SysUserMapper extends JpaRepository<SysUser,Long> {

    List<SysUser> findByUserNameAndCreateBy(String userName, String createBy);

    List<SysUser> findByUserName(String username);
    //直接用实体里面的字段名称和表名,和不用数据库名
    @Query("select s from SysUser s where s.userName=?1 and s.nickName=?2 ")
    SysUser MyfindByUserNameAndUsernick(String userName,String nickName);

    void deleteByUserName(String username);

    @Transactional(timeout = 4)
    @Modifying
    @Query("delete from SysUser s where s.userName=:user_name")
    void myDel(@Param("user_name") String userName);

}
