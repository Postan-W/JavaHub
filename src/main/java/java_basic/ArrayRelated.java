package java_basic;

import java.util.Arrays;

public class ArrayRelated {
    //创建数组的几种方式
    public static void createArray(){
        int[] a1;//声明，等同于int a1[];
        a1 = new int[4];//创建数组；整型数组默认元素为0
        for(int i=0;i<4;i++){
            a1[i] = i;
        }
        //---------------------------------------------
        int[] a2 = new int[3];
        for(int i:a2){
            System.out.println(i);
        }
        //---------------------------------------------
        int[] a3 = {10,11,12};//更简洁的创建方式
        for(int i:a3){
            System.out.println(i);
        }
        //-----------------------------------------------
        int[] a4 = a3;//指向同一地址
        a4[2] = 100;
        System.out.println(a3[2]);
        int[] a5 = Arrays.copyOf(a3,2*a3.length);//长度大于被拷贝数组则多的部分用默认值，小于则只拷贝前面的部分；
        a5[2] = 1000;//a5是新的数组，不会影响到a3
        for(int i:a5){
            System.out.println(i);
        }
        for (int i:a3){
            System.out.println(i);
        }
        //------------------------------------------------
        int[][] a6 = {{6,6,6},{7,7,7}};//二维数组。就是以一维数组为元素的数组
        for(int[] row:a6){
            for(int column:row){
                System.out.println(column);
            }
        }
        System.out.println(Arrays.deepToString(a6));
        /*为了凸显java中多维数组就是数组的数组的性质(也就是说对多维数组的操作实质上也是对一维数组的操作，只是因为子元素也是数组，所以
        感觉上像是在操作一个多维数组
        * */
        int[] temp = a6[0];
        a6[0] = a6[1];
        a6[1] = temp;
        System.out.println(Arrays.deepToString(a6));

    }
}
