public class 次方 {
    public static int pow(int a, int b) {
        int ans = 1;
        for (int i = 0;i < b;i++){
            ans = ans * a;
        }
        return ans;
    }

    public static void main(String[] args) {
        int c = pow(4,2);
        System.out.println(c);
    }
}
