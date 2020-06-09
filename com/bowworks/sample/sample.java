package com.bowworks.sample;
import com.bowworks.sample.model.User;
import com.bowworks.sample.model.AdminUser;
// import com.bowworks.sample.model.*;

public class sample {
  public static void main(String[] args) {
    User Rei = new User("Rei");
    // Rei = new User();
    // System.out.println(Rei.name);
    Rei.sayHi();

    AdminUser Fuku = new AdminUser("Fuku");
    // Rei = new User();
    // System.out.println(Fuku.name);
    Fuku.sayHi();
    Fuku.sayHello();
  }
}
