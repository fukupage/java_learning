//ジェネリックス--------------------------------------------------------------------
class MyData<T>{
  public void getThree(T x){
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}
// class MyInteger{
//   public void getThree(int x){
//     System.out.println(x);
//     System.out.println(x + 1);
//     System.out.println(x + 2);
//   }
// }

public class sample_old_9{
  public static void main(String[] args){
    // MyInteger mi = new MyInteger();
    // mi.getThree(55);
    MyData<Integer> i = new MyData<>();
    i.getThree(350);
    MyData<String> s = new MyData<>();
    s.getThree("ほえほえ");
  }
}


//ラッパークラス--------------------------------------------------------------------
/**
 * Wrapper Class
 * int -> Integer
 * double -> Double
 *
*/

// public class sample{
//   public static void main(String[] args){
//     // Integer i = new Integer(32);
//     // int n i.intValue();
//     Integer i = 32; //auto boxing
//     i = null;
//     int n = i; //auto unBoxing
//     System.out.println();
//   }
// }

//例外処理---------------------------------------------------------------------
// class MyException extends Exception{
//   public MyException(String s){
//     super(s);
//   }
// }

// public class sample{

//   public static void div(int a,int b){
//     try{
//       if(b < 0){
//         throw new MyException("ないわー。まいなすやわー");
//       }
//       System.out.println(a/b);
//     } catch(ArithmeticException e){
//       System.err.println(e.getMessage());
//     } catch(MyException e){
//       System.err.println(e.getMessage());
//     } finally{
//       System.out.println("おわったで");
//     }
//   }
//   public static void main(String[]args){
//     div(3,0);
//     div(3,-5);
//     div(3,1);
//   }
// }


//列挙型---------------------------------------------------------------------
// enum Result {
//   SUCCESS, // 0
//   ERROR, // 1
// }

// public class sample {
//   public static void main(String[] args) {
//     Result res;

//     res = Result.ERROR;

//     switch (res) {
//       case SUCCESS:
//         System.out.println("せいこうしますた");
//         System.out.println(res.ordinal());
//         break;
//       case ERROR:
//         System.out.println("しっぱいしますた");
//         System.out.println(res.ordinal());
//         break;
//     }
//     System.out.println();
//   }
// }
