public class TestDemo1{

    public static void main(String[] args){
        AA aa= new AA();
        String s = aa.str;//(请问aa.str是在栈还是在堆？)    //在堆上
        System.out.println(s);
    }

}

class AA{
    String str = new String ("A");
}