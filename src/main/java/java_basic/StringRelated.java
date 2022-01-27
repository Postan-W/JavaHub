package java_basic;

import java.util.Date;

//演示字符串有关的操作
public class StringRelated {
    public static String s = "hello你好";
    public static String s2 = "hello你好";
    public static String s3 = "help";
    public static String s4 = "HELLO你好";
    public static String s5 = " asdf  ";
    //获取字符个数
    public static int getLength(){
        return StringRelated.s.length();
    }
    /*使用==比较字符串,检测的是两个字符串的地址是否相同(如果相同内容当然相等),比较内容是否相等应该使用字符串对象
    的equals方法或equalsIgnoreCase(不区分大小写)*/
    public static boolean checkLocation(){
        return s == s2;//如果返回的是true说明虚拟机将相同的字符串共享了，引用指向同一个位置了，一般情况下字符串常量共享
    }

    public static boolean checkContent(int i){
        if(i==1){
            return s.equals(s2);
        }
        else if(i==2){
            return s.equalsIgnoreCase(s4);
        }
        return true;
    }

    public static String sub(){
        return StringRelated.s4.substring(0,s4.length()-2);
    }
    //由较短的字符串构建较长的字符串可以用+号拼接返回一个新的String对象，重复这样做比较耗费空间
    public static String buildString(){
        //其前身是StringBuffer，其允许采用多线程的方式执行添加删除字符的操作；在单线程中使用StringBuffer更佳
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        builder.append(s2);
        builder.append(s3);
        builder.append(s4);
        return builder.toString();
    }
    //格式化字符串与格式化输出
    public static void format(){
        String message = String.format("Hello, %s, your number is %d","Lee",2321);
        System.out.println(message);
        //printf可以格式化的内容更多
        System.out.printf("%tc",new Date());
    }

}
