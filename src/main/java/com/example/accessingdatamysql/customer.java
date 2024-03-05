package com.example.accessingdatamysql;

public class customer {

  private Integer Customer_id;
  private String firstName;
  private String lastName;

  public Integer getCustomer_id() {
    return Customer_id;
  }

  public void setCustomer_id(Integer Customer_id) {
    this.Customer_id = Customer_id;
  }

  public String getfirstName() {
    return firstName;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public String getlastName() {
    return lastName;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }
  @Override
  public String toString() {
    return "customer(Customer_id=" + Customer_id + ", firstName=" + firstName + ", lastName=" + lastName + ")";
  }

}