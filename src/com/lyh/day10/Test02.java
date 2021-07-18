package com.lyh.day10;

import java.io.File;

//遍历 你D盘 的 其中一个文件夹 , 并查找出 文件后缀名带有.class的文件
public class Test02 {
    public static void main(String[] args) {
        File file = new File("D:\\Temp");
        getFile(file);
    }

    private static void getFile(File dir) {
        File[] files = dir.listFiles();  //创建文件的数组
        if(files!=null){    //如果文件的数组不为空
            for (File file : files) {
                if (file.isDirectory()){   //如果文件是目录
                    getFile(file);    //继续遍历
                }else{
                    if (file.getName().endsWith(".class")){   //判断文件是不是.java文件
                        System.out.println(file.getAbsolutePath());   //获取文件路径
                    }
                }
            }
        }

    }
}
