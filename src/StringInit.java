public class StringInit {
    public static void main(String[] args) {
        int a=10;
        // khai bao chuoi bang literal-cach thong thuong
        String str1="RikkeiAcademy";
        String str2="RikkeiAcademy";
        // khai bao chuoi qua lop String
        String str3=new String("Rikkei");
        String str4=new String("Rikkei");
        // Cac phuong thuc lam viec voi chuoi
        //1. length(): Tra ve do dai cua chuoi
        System.out.println("Do dai cua chuoi str1"+str1.length());
        //2. chartAt(index): Tra ve ky tu tai vi tri index
        System.out.println("Ky tu co chi so 4 trong str1 la:"+str1.charAt(4));
        //3. str1.concat(str2): noi chuoi  str1voi chuoi str2(+)
        System.out.println("str1 noi chuoi str3"+str1.concat(str3));
        //4.
        //5.
        //6.
        //7.



    }
}
