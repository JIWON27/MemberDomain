package com.example.memberdomain.test;
import com.example.memberdomain.member.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryTestRepository implements TestRepository {

  // 회원 정보를 저장할 리스트
  private final List<Member> collectors = new ArrayList<>();
  @Override
  public Long save(Member member) {
    collectors.add(member);
    return member.getId();
  }

  @Override
  public Member findById(Long id) {
    Member findMem = collectors.get(id.intValue()-1);
    return findMem;
  }

  @Override
  public Member updateMember(Long id, Member member) {
    // 수정할 멤버 객체를 id를 통해 가져온다.
    Member updateMem = collectors.get(id.intValue()-1);
    // setter를 사용해서 멤버 객체를 수정한다.
    // 회원 id는 그대로 두고, 이름이나 등급을 수정하도록 한다.
    updateMem.setName(member.getName());
    updateMem.setGrade(member.getGrade());
    return updateMem;
  }

  @Override
  public Long removeMember(Long id) {
    Member delMem = collectors.remove(id.intValue()-1);
    // 삭제한 멤버 객체 아이디 반환
    return delMem.getId();
  }
}
