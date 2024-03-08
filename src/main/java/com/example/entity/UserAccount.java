package com.example.entity;

public class UserAccount {

private Integer account_id;
private String password;


public Integer getAccount_id() {
    return account_id;
}

public void setAccount_id(Integer account_id) {
    this.account_id = account_id;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}


@Override
public String toString() {
    return "customer(account_id=" + account_id + ", password=" + password + ")";
}

}