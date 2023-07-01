package com.example.memberdomain.service;

import com.example.memberdomain.member.Member;
import com.example.memberdomain.test.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

  private final TestRepository testRepositry;

  public TestServiceImpl(TestRepository testRepository){
    this.testRepositry = testRepository;
  }
  @Override
  public Long joinTest(Member member) {
    testRepositry.save(member);
    return member.getId();
  }

  @Override
  public Member findByTestId(Long id) {
    Member findMem = testRepositry.findById(id);
    return findMem;
  }

  @Override
  public Member updateTest(Long id, Member member) {
    Member updateMem = testRepositry.updateMember(id,member);
    return updateMem;
  }

  @Override
  public Long deleteTest(Long id) {
    return testRepositry.removeMember(id);
  }
}
