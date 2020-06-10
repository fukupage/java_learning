//このソースはfinal修飾子の使い方の説明（変更ができないなど）の解説のためのもので、コンパイルできません。

class User {
  protected String name;
  private static final double VERSION = 1.1;

  public User(String name){
    this.name = name;
    User.VERSION = 1.2;
  }

  public final void sayHi(){
    System.out.println("あれれ！" + this.name + "さん。おげんきですか？");
  }
}

class AdminUser extends User {
 public AdminUser(String name){
    super(name);
  }

  @Override
  public void sayHi() {
    System.out.println("はいはぁーーい！" + this.name + "さん、管理人ご苦労さま！！");
  }
}

public class sample_old_7{
  public static void main(String[] args) {
    User Rei = new User("Rei");
  }
}
