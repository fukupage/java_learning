import java.time.*;
import java.time.format.DateTimeFormatter;

public class sample{
  public static void main(String[] aegs){
    LocalDateTime d = LocalDateTime.now();
    // LocalDateTime d = new LocalDateTime.of(2020,1,1,10,10,10);
    // LocalDateTime d = new LocalDateTime.parse("2016-01-01T10:10:10");
    System.out.println(d.getYear());
    System.out.println(d.getMonth().getValue());
    System.out.println(d.plusMonths(2).minusDays(3));

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
    System.out.println(d.format(dtf));


  }
}

// // StreamAPI--------------------------------------------------------------

// public class sample {
//   public static void main(String[] args) {

//     List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
//     // for (Integer sale : sales){
//     //     System.out.println(sale);
//     // }

//     sales
//       .stream()
//       //中間式
//       .filter( e -> e % 3 == 0) //ラムダ式　引数 -> 処理
//       .map(e -> "(" + e + ")" )
//       //終端処理
//       .forEach(System.out::println);
//   }
// }
