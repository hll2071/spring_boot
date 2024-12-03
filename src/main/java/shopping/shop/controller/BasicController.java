package shopping.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "안녕하세용";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "피싱 사이트에용";
    }

    @GetMapping("/html")
    @ResponseBody
    public String html() {
        return "<h4>반갑습니다</h4>";
    }

    @GetMapping("/html1")
    public String html1() {
        return "index.html";
    }

    @GetMapping("/date")
    @ResponseBody
    public String date() {
        return LocalDateTime.now().toString();
    }
}
