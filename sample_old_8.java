//インターフェース　---------------------------------------------------------------------------------------
interface Printable {
  // 定数
  double VERSON = 1.5;

  // 抽象メソッド
  void print();

  // defaultメソッド
  public default void getInfo() {
    System.out.println("I/F ver. " + Printable.VERSON);
  }

  // staticメソッド

}

class User implements Printable{
  @Override
  public void print(){
    System.out.println("あなたのプロフィールをプリント中なり");
  }
}

public class sample_old_8 {
  public static void main(String[] args) {
    User Rei = new User();
    Rei.print();
    Rei.getInfo();
  }
}

// //抽象クラス -> 具象クラス
// ------------------------------------------------------------------------------

// abstract class User {
// public abstract void sayHi(); //抽象メソッド
// }

// class JapaneseUser extends User{
// @Override
// public void sayHi(){
// System.out.println("こにゃにゃちわ");
// }
// }

// class AmericanUser extends User{
// @Override
// public void sayHi(){
// System.out.println("はろぉーえぶりにゃん");
// }
// }

// public class sample{
// public static void main(String[] args) {
// AmericanUser Tom = new AmericanUser();
// JapaneseUser Rei = new JapaneseUser();
// Tom.sayHi();
// Rei.sayHi();
// }
// }
