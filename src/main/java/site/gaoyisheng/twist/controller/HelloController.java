package site.gaoyisheng.twist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import site.gaoyisheng.twist.domain.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String say() {
        return "Hello ~ My twist";
    }

    @RequestMapping(value = "/users" ,method = RequestMethod.GET)
    public Result mothedName(HttpServletRequest request, HttpServletResponse response){
        //Result result = new result();

        return null;
    }
}