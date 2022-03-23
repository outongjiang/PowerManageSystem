package prerson.otj.class_practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prerson.otj.class_practice.mapper.SysUserMapper;
import prerson.otj.class_practice.pojo.SysUser;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;
    public List<SysUser>findAll(){
        return sysUserMapper.findAll();
    }

}
