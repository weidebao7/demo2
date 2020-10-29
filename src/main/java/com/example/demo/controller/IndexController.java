package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model map){
        User user=new User();
        user.setId("222");
        user.setName("卢本伟");
        user.setAge(30);
        map.addAttribute("user",user);
        return "index";
    }

    @RequestMapping("/indexList")
    public String indexList(Model model){
        List<User> list=new ArrayList<User>();
        for (int i=0;i<10;i++){
            User user=new User();
            user.setId("No"+i);
            user.setName("卢本伟"+i);
            user.setAge(30+i);
            user.setSex(i%2==0?1:0);
            list.add(user);
        }
        model.addAttribute("list",list);
        return "list";
    }
}
