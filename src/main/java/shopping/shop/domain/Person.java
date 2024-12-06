package shopping.shop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    public void setName(String name) {
        if(name.length() > 100) {
            throw new IllegalArgumentException("이름은 100자를 넘길 수 없습니다.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0 || age>100) {
            throw new IllegalArgumentException("나이는 음수나 100을 넘길 수 없습니다.");
        }
        this.age = age;
    }
    public int getAge() {
        if(age+1 > 100) {
            throw new IllegalStateException("나이는 100을 초과할 수 없습니다.");
        }
        return age+1;
    }


}
