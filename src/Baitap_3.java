import java.util.Scanner;

public class Baitap_3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi ");
        String str= scanner.nextLine();
        String[] arr = str.split(" ");
        String str1 = "";
        for (int i = 0; i < arr.length; i++)
        {
            String arrString = arr[i];
            String reverseWord = "";
            for (int j = arrString.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + arrString.charAt(j);
            }
            str1 = str1+ reverseWord + " ";
        }
        System.out.println(str1);
    }

}
