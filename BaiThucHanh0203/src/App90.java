import java.util.Scanner;
public class App90 {
    public static void main(String[] args) throws Exception {
      String chuoi;
      char kyTu;
      Scanner scanner = new Scanner(System.in);  
      System.out.println("Nhập vào chuỗi bất kỳ: ");
      chuoi = scanner.nextLine();
      String[] words = chuoi.split("\\s");
      for (String w : words) {
        System.out.println(w);
       }
    }
}
