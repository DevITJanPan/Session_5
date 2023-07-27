import java.util.Scanner;

public class Baitap_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần chuẩn hóa: ");
        String strStandardize = scanner.nextLine();
        //1. Xóa khoảng trắng 2 đầu
        strStandardize = strStandardize.trim();
        //2. Mỗi từ cách nhau 1 khoảng trắng: \\s+ đại diện cho nhiều khoảng trắng liền nhau
        strStandardize = strStandardize.replaceAll("\\s+", " ");
        //3. Viết thường các ký tự trong chuỗi
        strStandardize = strStandardize.toLowerCase();
        //4. Viết hoa ký tự đầu tiên của các từ
        //4.1. Tách các từ trong chuỗi ra và lưu vào mảng - cắt theo khoảng cách
        String[] arrString = strStandardize.split(" ");
        //4.2. Viết hoa ký tự đầu tiên của phần tử trong mảng arrString và nối vào chuỗi đã được chuẩn hóa
        String strStandardized = "";
        for (String str : arrString) {
            strStandardized += String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) + " ";
        }
        //4.3. Cắt khoảng trắng bên phải cảu chuỗi strStandardized
        strStandardized = strStandardized.trim();

        System.out.println("Chuỗi sau khi chuẩn hóa: " + strStandardized);
    }
}
