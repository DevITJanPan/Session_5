import java.util.Scanner;

public class Baitap_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi ");
        String str= scanner.nextLine();
        char[] arrCharacter = new char[str.length()];
        int arrIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean isCheck = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isCheck = false;
                    break;
                }
            }
            if (!isCheck) {
                arrCharacter[arrIndex] = str.charAt(i);
                arrIndex++;
            }
        }
        int[] arrCountChar = new int[arrIndex];
        for (int i = 0; i < arrIndex; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (arrCharacter[i] == str.charAt(j)) {
                    cnt++;
                }
            }
            arrCountChar[i] = cnt;
        }
        System.out.println("Các ký tự xuất hiện duy nhất 1 lần trong chuỗi: ");
        boolean isPremi = true;
        for (int i = 0; i < arrIndex; i++) {
            if (arrCountChar[i] == 1) {
                System.out.printf("%c\t", arrCharacter[i]);
                isPremi = false;
            }
        }
        System.out.printf("\n");
        if (isPremi) {
            System.out.println("Không có ký tự nào xuất hiện 1 lần");
        }
    }
}
