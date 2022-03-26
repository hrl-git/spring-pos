package itc.hoseo.pos.repository.impl;

import itc.hoseo.pos.domain.Member;
import itc.hoseo.pos.repository.MemberRepository;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

//@Component
public class HashMapMemberRepository implements MemberRepository {
    private static final HashMapMemberRepository instance = new HashMapMemberRepository();

    public HashMapMemberRepository(){}

    private Map<Integer,Member> map = new HashMap<>();
    //private static long sequence = 0L;

    public static HashMapMemberRepository getInstance(){
        return instance;
    }


    //id를 얻어 멤버얻어오기
    @Override
    public Optional<Member> findById(Integer id) {

        return Optional.of(map.get(id));
    }

    //name을 얻어 멤버리스트를 얻어오기
    @Override
    public List<Member> findByName(String name) {
        List<Member> list = new ArrayList<>();
        for(Member m : map.values()){
            if(name.equals(m.getName())){
                list.add(m);
            }
        }
        return list;
        //new Object(){

        //};

        //return map.values().stream()
          //      .filter(i-> {
            //        return name.equals(i.getName());
              //  })
                //.collect(Collectors.toList());
    }

    //멤버저장 메소드
    @Override
    public void save(Member member) {
        //member.setId(String.valueOf(++sequence));
        map.put(member.getSeq(), member);
    }

    //멤버전체 가져오기
    @Override
    public List<Member> allMembers() {

        return new ArrayList(map.values());
    }
}


