package com.example.memberdomain.test;
import com.example.memberdomain.member.Member;

public interface TestRepository {

  // C
  Long save(Member member);
  // R (회원 단건 조회)
  Member findById(Long id);
  // U Update한 멤버 객체를 반환
  Member updateMember(Long id, Member member);
  // D 삭제한 객체 id를 반환
  Long removeMember(Long id);
}
