class User {
  private String name;
  private int score;

  public User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public int getScore(){ //getter
    return this.score;
  }

  public void setScore(int score){ //setter
    if(score > 0){
      this.score = score;
    }
  }
}


public class sample_old_5 {
  public static void main(String[] args) {
    User Rei = new User("Rei", 65);
    Rei.setScore(85);
    Rei.setScore(-237);
    // System.out.println(Rei.name);
    System.out.println(Rei.getScore());
  }
}
