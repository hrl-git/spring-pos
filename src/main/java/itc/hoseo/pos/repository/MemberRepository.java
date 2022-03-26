package itc.hoseo.pos.repository;

import itc.hoseo.pos.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //ID로 멤버를 찾음
    public Optional<Member> findById(Integer id);

    //이름으로 멤버를 찾음
    public List<Member> findByName(String name);

    //멤버를 저장
    public void save(Member member);

    //모든 회원을 반환
    public List<Member> allMembers();
}
