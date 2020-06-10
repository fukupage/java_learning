class User {
  private String name;
  private static int count;

  static{
    User.count = 0;
    System.out.println("すたてっく★いにしゃらいざあ");
  }

  {
    System.out.println("いんすたんす★いにしゃらいざあ");
  }


  public User(String name) {
    this.name = name;
    User.count++;
    System.out.println("こんすとらくたあ★");
  }

  public static void getInfo(){ //getter
    System.out.println("# of instance:" + User.count);
  }
}

public class sample_old_6 {
  public static void main(String[] args) {
    User.getInfo();
    User Rei = new User("Rei");
    User.getInfo();
    User Fuku = new User("Fuku");
  }
}
