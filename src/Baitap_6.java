import java.util.Scanner;

public class Baitap_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi :");
        String str= scanner.nextLine();
        String replaceString=str.replace("Academy","Học viện");
        System.out.println("Chuỗi sau khi thay thế :"+replaceString);
    }
}
