package com.example.demo.domain;


public class FeedbackDO {

  private String name;
  private String email;
  private String provinces;
  private String sex;
  private String problem;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getProvinces() {
    return provinces;
  }

  public void setProvinces(String provinces) {
    this.provinces = provinces;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

}
