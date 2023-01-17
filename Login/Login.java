package Login;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名（如没有将为您注册一个）");
        String username = sc.nextLine();
        File file = new File("../Login/Users/"+username+".txt");
        if(file.exists()){
            System.out.println("该用户已存在,请重新运行该程序并且输入新的用户名");

        }else {
            file.createNewFile();
            FileWriter fw =new FileWriter(file);
            fw.write(username);
            fw.close();
        }
        System.out.println("请输入你的密码");

        String password = sc.nextLine();
        File p = new File("../Login/Passwords/"+username+"'s password.txt");
        p.createNewFile();
        FileWriter fwp =new FileWriter(p);
        fwp.write(password);
        fwp.close();
        System.out.println("已为您创建了用户");
    }
}

