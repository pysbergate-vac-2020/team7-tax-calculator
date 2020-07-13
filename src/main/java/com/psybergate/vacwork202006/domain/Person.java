package com.psybergate.vacwork202006.domain;

import java.time.LocalDate;

public class Person {

  private String taxNumber; // unique business key

  private String name;

  private String surname;

  public Person() {
  }

  public Person(String taxNumber, String name, String surname) {
    super();
    this.taxNumber = taxNumber;
    this.name = name;
    this.surname = surname;
  }

  public String getTaxNumber() {
    return taxNumber;
  }

  public void setTaxNumber(String taxNumber) {
    this.taxNumber = taxNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

}
