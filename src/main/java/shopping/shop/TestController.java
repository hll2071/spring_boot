package shopping.shop;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/list")
    String list(Model model) {
        model.addAttribute("name","바지");
        model.addAttribute("price",15000);
        model.addAttribute("amount",100);

        return "list.html";
    }
}
