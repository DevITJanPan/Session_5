import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhập vào chuỗi thứ hai: ");
        String str2 = scanner.nextLine();

        String resultStr = concatStr(str1, str2);
        System.out.println("Chuỗi sau khi nối và cắt: " + resultStr);
    }

    public static String concatStr(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        // Tiến hành cắt bỏ các ký tự đầu của chuỗi dài hơn cho đến khi chúng bằng nhau
        while (length1 > length2) {
            str1 = str1.substring(1); // Cắt bỏ ký tự đầu của chuỗi thứ nhất
            length1--;
        }
        while (length2 > length1) {
            str2 = str2.substring(1); // Cắt bỏ ký tự đầu của chuỗi thứ hai
            length2--;
        }

        // Tiến hành nối 2 chuỗi lại với nhau
        return str1.concat(str2);
    }
}
