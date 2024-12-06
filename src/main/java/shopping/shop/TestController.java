package shopping.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import shopping.shop.domain.Item;
import shopping.shop.domain.ItemRepository;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {
    private final ItemRepository itemRepository;
    @GetMapping("/list")
    public String list(Model model) {
        List<Item> results = itemRepository.findAll();
        model.addAttribute("items", results);
        return "list";
    }
    @GetMapping("/write")
    public String write() {
        return "write";
    }
}
