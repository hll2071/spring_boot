package shopping.shop.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String title;

    private String date;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                '}';
    }

    @Builder
    public Item(String title, String date) {
        this.title = title;
        this.date = date;
    }
    public Item(Item item) {
        this.id = item.getId();
        this.title = item.getTitle();
        this.date = item.getDate();
    }
}
