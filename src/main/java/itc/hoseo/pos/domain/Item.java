package itc.hoseo.pos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static java.lang.System.out;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    //TODO
    // 속성과 테스트케이스까지 만들어주세요 (10시까지)

    private Integer id;
    private String name;
    private Integer price;
    private Integer stockQuantity;

    public void addStock(int stock) {
        out.println("상품이 추가되었습니다");
    }
    public void removeStock(int stock){
        out.println("상품이 삭제되었습니다");
    }

}
