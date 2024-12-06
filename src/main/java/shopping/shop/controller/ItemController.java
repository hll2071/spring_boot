package shopping.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shopping.shop.domain.Item;
import shopping.shop.domain.ItemRepository;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping("/get-all")
    public List<Item> items() {
        List<Item> result = itemRepository.findAll();
        for(Item s : result) {
            System.out.println(s);
        }
        return itemRepository.findAll().stream()
                .map(Item::new)
                .toList();
    }


    @PostMapping("/save")
    public void save(@RequestParam Map<String,Object> formData) {
        Item item = Item.builder()
                .title((String) formData.get("title"))
                .date((String) formData.get("date"))
                .build();
        itemRepository.save(item);
    }
}
