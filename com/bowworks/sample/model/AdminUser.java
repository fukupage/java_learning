package com.bowworks.sample.model;

public class AdminUser extends User {
  public AdminUser(String name) {
    super(name);
  }

  public void sayHello() {
    System.out.println("管理人の" + this.name + "さん、ちわーっす！");
  }

  @Override
  public void sayHi() {
    System.out.println("はいはぁーーい！" + this.name + "さん、管理人ご苦労さま！！");
  }
}
