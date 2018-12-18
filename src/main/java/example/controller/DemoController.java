package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gyao
 * @create date 2018-12-18 11:34 PM
 **/

@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
