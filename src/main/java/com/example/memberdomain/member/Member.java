package com.example.memberdomain.member;

public class Member {
  // 회원 아이디
  Long id;
  // 회원 이름
  String name;
  // 회원 등급
  String grade;

  public Member(Long id, String name, String grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }
}
