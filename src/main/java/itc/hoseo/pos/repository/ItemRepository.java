package itc.hoseo.pos.repository;

import itc.hoseo.pos.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {
    //ID로 멤버를 찾음
    public Optional<Item> findById(Integer id);
    //이름으로 멤버를 찾음
    public List<Item> findById(String name);
    //멤버를 저장
    public void save(Item item);
    //모든 회원을 반환
    public List<Item> allItems();
}
