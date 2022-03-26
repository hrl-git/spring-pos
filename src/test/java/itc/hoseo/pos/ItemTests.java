package itc.hoseo.pos;

import itc.hoseo.pos.domain.Item;
import itc.hoseo.pos.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ItemTests {
    @Test
    void Test1(){
        Item i1 = new Item(12345,"chocolate",2000,10);

        assertEquals(12345,i1.getId());
        assertEquals("chocolate",i1.getName());

        i1.addStock(12345);
        i1.removeStock(12345);


    }

}