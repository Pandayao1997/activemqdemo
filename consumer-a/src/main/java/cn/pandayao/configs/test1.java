package cn.pandayao.configs;

import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {
        int a[] = {1, 5, 9, 2, 4, 7, 9, 2, 1};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - i - 1; j++) {
//                int temp=0;
//                if(a[j]<a[j+1]){
//                    temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(a));

        String string ="abc";
        StringBuffer stringBuffer= new StringBuffer(string);
        stringBuffer.reverse();
        System.out.println(stringBuffer);




    }


}
