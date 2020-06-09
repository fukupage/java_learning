package com.bowworks.sample.model;

public class User {
  protected String name;

  public User(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println("はいはぁーーい！" + this.name + "さん、おつかれっすーー！");
  }
}
