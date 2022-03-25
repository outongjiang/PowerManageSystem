package prerson.otj.class_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import prerson.otj.class_practice.mapper.SysUserMapper;
import prerson.otj.class_practice.pojo.SysUser;
import prerson.otj.class_practice.service.SysUserService;

import java.util.List;

@Controller
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @RequestMapping(value = "/sysUser/findAll",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView findAll(ModelAndView modelAndView){
        List<SysUser>sysUsers =sysUserService.findAll();
        modelAndView.addObject("sysUsers",sysUsers);
        modelAndView.setViewName("index");
        System.out.println("进来了");
        return modelAndView;
    }


    @RequestMapping(value = "/sysUser/del",method = {RequestMethod.POST,RequestMethod.GET})
    @Transactional
    @ResponseBody
    public String del(){
        System.out.println("进来了");
        sysUserService.deleteByUsername();
        return "";
    }

    @RequestMapping(value = "/sysUser/update",method = {RequestMethod.POST,RequestMethod.GET})
    @Transactional
    @ResponseBody
    public String update(){
        sysUserService.updateById(135l);
        return "修改成功";
    }
    @RequestMapping(value = "/sysUser/insert",method = {RequestMethod.POST,RequestMethod.GET})
    @Transactional
    @ResponseBody
    public String insert(){
        SysUser sysUser=new SysUser();
        sysUser.setUserName("张三丰");
        sysUser.setNickName("张三丰");
        sysUserService.save(sysUser);
        return "修改成功";
    }

}
