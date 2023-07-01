package com.example.memberdomain.service;
import com.example.memberdomain.member.Member;
public interface TestService {
  // C
  Long joinTest(Member member);
  // R
  Member findByTestId(Long id);
  // U
  Member updateTest(Long id, Member member);
  // D
  Long deleteTest(Long id);
}
