class User {
  String name;

  User(String name) {
    this.name = name;
  }

  User() {
    this("あれれ！");
  }

  void sayHi() {
    System.out.println("はいはぁーーい！" + this.name + "さん、おつかれっすーー！");
  }
}

class AdminUser extends User {
  AdminUser(String name){
    super(name);
  }
  void sayHello(){
    System.out.println("管理人の" + this.name + "さん、ちわーっす！");
  }
  @Override
  void sayHi() {
    System.out.println("はいはぁーーい！" + this.name + "さん、管理人ご苦労さま！！");
  }
}

public class sample {
  public static void main(String[] args) {
    User Rei = new User("Rei");
    //  Rei = new User();
    System.out.println(Rei.name);
    Rei.sayHi();

    AdminUser Fuku = new AdminUser("Fuku");
    //  Rei = new User();
    System.out.println(Fuku.name);
    Fuku.sayHi();
    Fuku.sayHello();
  }
}
