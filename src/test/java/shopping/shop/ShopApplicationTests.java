package shopping.shop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import shopping.shop.domain.Person;

@SpringBootTest
@TestPropertySource(properties = {
        "DB_URL=jdbc:mysql://localhost:3306/class",
        "DB_USERNAME=root",
        "DB_PASSWORD=12345678"
})
class ShopApplicationTests {


    @Test
    void contextLoads() {
        Person p = new Person();
        p.setName("황성민");
        p.setName("황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황황");
        //p.setAge(101);
        //p.setAge(-10);
        p.setAge(100);
        //System.out.println(p.getAge());
        p.setAge(17);
        System.out.println(p.getAge());
    }

}
