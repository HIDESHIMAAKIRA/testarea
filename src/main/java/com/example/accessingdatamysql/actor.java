package com.example.accessingdatamysql;

public class actor {

  private Integer actor_id;
  private String first_name;
  private String last_name;
  private String last_update;
  

  public Integer getactor_id() {
    return actor_id;
  }

  public void setactor_id(Integer actor_id) {
    this.actor_id = actor_id;
  }

  public String getfirst_name() {
    return first_name;
  }

  public void setfirst_name(String first_name) {
    this.first_name = first_name;
  }

  
  public String getlast_name() {
    return last_name;
  }

  public void setlast_name(String last_name) {
    this.last_name = last_name;
  }

  public String getlast_update() {
    return last_update;
  }

  public void setlast_update(String last_update) {
    this.last_update = last_update;
  }


  @Override
  public String toString() {
    return "customer(actor_id=" + actor_id + ", first_name=" + first_name + ", last_name=" + last_name + ")";
  }

}