package blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/show")
    @ResponseBody // return "문자열" 그대로 반환
    public String show() {
        return "<h1>show</h1>";
    }

}
