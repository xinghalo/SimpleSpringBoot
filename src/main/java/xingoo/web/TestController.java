package main.java.xingoo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinghailong on 2017/7/21.
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
