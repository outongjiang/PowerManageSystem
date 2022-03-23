package prerson.otj.class_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}