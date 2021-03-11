public class LeetCode1556 {  //给你一个整数 n，请你每隔三位添加点（即 "." 符号）作为千位分隔符，并将结果以字符串格式返回。
    public static String thousandSeparate(int n) {
       if (n == 0){
           return "0";
       }
       int count = 1;
       String ans = "";

       while (n > 0){
           int d = n % 1000;
           String sd = String.valueOf(d);
           if (n > 1000 && sd.length() < 3){
               if (sd.length() == 0){
                   ans = "000";
               }else if (sd.length() == 1){
                   ans = "00" + sd;
               }else{
                   ans = "0" + sd;
               }
           }

           if (count == 1){
               ans = sd;
           }else{
               ans = sd + "." + ans;
           }

           n = n / 1000;
           count++;
       }
       return ans;
    }


    public static void main(String[] args) {
        String s = thousandSeparate(2123456789);
        System.out.println(s);
    }
}
