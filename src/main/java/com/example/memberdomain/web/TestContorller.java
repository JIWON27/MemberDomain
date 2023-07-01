package com.example.memberdomain.web;

import com.example.memberdomain.member.Member;
import com.example.memberdomain.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/latest")
public class TestContorller {

  private final TestService testService;

  public TestContorller(TestService testService){
    this.testService = testService;
  }
  // C
  @PostMapping("/test")
  public ResponseEntity<String> create(@RequestBody Member member){
    testService.joinTest(member);
    // 동작 확인용
    System.out.println("추가한 회원 ID : "+member.getId());
    System.out.println("추가한 회원 이름 : "+member.getName());
    System.out.println("추가한 회원 등급 : "+member.getGrade());
    return ResponseEntity.ok("CREATED");
  }
  // R
  @GetMapping("/test/{id}")
  public ResponseEntity<String> read(@PathVariable Long id){
    Member readMem = testService.findByTestId(id);
    // 동작 확인용
    System.out.println("[ 회원 조회 ]");
    System.out.println("회원 ID : " + readMem.getId());
    System.out.println("회원 이름 : " + readMem.getName());
    System.out.println("회원 등급 : " + readMem.getGrade());
    System.out.println("[ 회원 조회 완료]");
    return ResponseEntity.ok("READ");
  }
  // U
  @PutMapping("/test/{id}")
  public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Member member){
    Member updateMem = testService.updateTest(id, member);
    // 동작 확인용
    System.out.println("수정할 회원 ID : " + id);
    System.out.println("[ 변경 내용 ]");
    System.out.println("변경 ID : " + updateMem.getId());
    System.out.println("변경 이름 : " + updateMem.getName());
    System.out.println("변경 등급 : " + updateMem.getGrade());
    System.out.println("[ 변경 완료 ]");
    return ResponseEntity.ok("UPDATED");
  }
  // D
  @DeleteMapping("/test/{id}")
  public ResponseEntity<String> delete(@PathVariable Long id){
    Long delId = testService.deleteTest(id);
    // 동작 확인용
    System.out.println("[삭제된 회원 ID] = " + delId);
    return ResponseEntity.ok("DELETED");
  }
}
