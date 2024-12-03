package shopping.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shopping.shop.domain.Item;
import shopping.shop.domain.ItemRepository;

import java.util.List;

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
}
