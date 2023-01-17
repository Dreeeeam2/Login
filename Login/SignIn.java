package Login;
import java.io.*;
import java.util.Scanner;
public class SignIn {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String username = sc.nextLine();
        File u = new File("../Login/Users/"+username+".txt");
        FileReader fru = new FileReader(u);
        BufferedReader bru = new BufferedReader(fru);
        String ru = bru.readLine();
        if(username.equals(ru)){
            System.out.println("请输入你的密码");
            String password = sc.nextLine();
            File p = new File("../Login/Passwords/"+username+"'s password.txt");
            FileReader frp = new FileReader(p);
            BufferedReader brp = new BufferedReader(frp);
            String rp = brp.readLine();
            if(password.equals(rp)){
                System.out.println("欢迎您，尊敬的用户"+username);
            }else {
                System.err.println("密码错误");
            }
        }else {
            System.err.println("该用户不存在！！！！！！！！！！");
        }

    }
}