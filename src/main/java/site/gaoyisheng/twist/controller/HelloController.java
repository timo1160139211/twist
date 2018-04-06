package site.gaoyisheng.twist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import site.gaoyisheng.twist.domain.Result;
import site.gaoyisheng.twist.pojo.User;
import site.gaoyisheng.twist.util.ResultUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String say() {
        return "Hello ~ My twist";
    }

    @RequestMapping(value = "/users" ,method = RequestMethod.GET)
    public Result mothedName(HttpServletRequest request, HttpServletResponse response){

        User u1 = new User(1,"张三",25,"123456");
        User u2 = new User(1,"李四",27,"888888");

        List<User> userList = new ArrayList<User>();

        userList.add(u1);
        userList.add(u2);

        return ResultUtil.success(userList);
    }
}