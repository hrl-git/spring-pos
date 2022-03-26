package itc.hoseo.pos;

import itc.hoseo.pos.domain.Member;
import itc.hoseo.pos.repository.MemberRepository;
import itc.hoseo.pos.repository.impl.HashMapMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MemberTests {

    //@Autowired
    //MemberRepository repository;

    @Test
    void test_Kim(){
        //Member m1 = new Member(1,"김봉남","1",30);
        Member m2 = Member.builder()
                .name("김봉남")
                .build();

        assertEquals("김봉남",m2.getName());
        assertEquals(null,m2.getAge());

    }

    @Test
    void test_Ma(){
        MemberRepository repository = new HashMapMemberRepository();

        Member m1 = new Member(1,"abc123","마봉필","1",30);

        assertEquals("마봉필",m1.getName());
        assertEquals(30,m1.getAge());

        repository.save(m1);
    }

    @Test
    void save(){
        MemberRepository repository = new HashMapMemberRepository();
        Member member = new Member(1,"hrl007","이하랑","12345",23);
        repository.save(member);
    }

    @Test
    void findAll(){
        MemberRepository repository = new HashMapMemberRepository();
        Member m1 = new Member(2,"m1","김익","123",32);
        Member m2 = new Member(3,"m2","박진우","1352",19);
        repository.save(m1);
        repository.save(m2);

        List<Member> result = repository.allMembers();

        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(m1, m2);

    }

    @Test
    void testMemberRepository(){
        MemberRepository repository = HashMapMemberRepository.getInstance();
        repository.save(new Member(1,"a","a","a",1));
        repository.save(new Member(2,"b","b","b",2));
        repository.save(new Member(3,"c","c","c",3));

        assertEquals(3,repository.allMembers().size());
        assertEquals(1, repository.findByName("a").size());
    }
}
