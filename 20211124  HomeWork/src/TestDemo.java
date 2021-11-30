class NameException extends RuntimeException {
    public  NameException (String message) {
        super(message);
    }
}

class PasswordException extends RuntimeException {
    public  PasswordException (String message) {
        super(message);
    }
}
public class TestDemo {
    //实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
    //如果用户名密码出错, 使用自定义异常的方式来处理
    private static final String name = "bit";
    private static final String passWord = "123";

    public static void logIn(String name, String passWord) throws NameException,PasswordException{
        if (!TestDemo.name.equals(name)) {
            throw new NameException("用户名错误");
        }
        if (!TestDemo.passWord.equals(passWord)) {
            throw new PasswordException("密码错误");
        }
    }
    public static void main(String[] args) {
        try{
            logIn("bit","1234");
        }catch (NameException e) {
            System.out.println("用户名错误了！");
            e.printStackTrace();
        }catch (PasswordException e){
            System.out.println("密码错误了！");
            e.printStackTrace();
        }finally {
            System.out.println("执行finall！");
        }
    }
}

