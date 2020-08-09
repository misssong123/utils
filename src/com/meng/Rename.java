package com.meng;

import java.io.File;
//https://github.com/misssong123/utils.git
/**
 * 将指定文件夹中文件进行重命名或者去点指定字符串
 */
public class Rename {
    public static void main(String[] args) {
        subString("C:\\下载\\尚硅谷Java数据结构和算法\\视频","-尚硅谷-老韩图解Java数据结构和算法");
    }

    /**
     *
     * @param path 待处理的文件路径
     * @param target 待处理的文件名称
     * @param result 修改后的文件名称
     */
    public static void rename(String path,String target,String result){

    }

    /**
     *
     * @param path 待处理的文件路径
     * @param target 带去除的字符串
     */
    public static void subString(String path,String target){
        File file = new File(path);
        //如果为文件直接替换,如果为文件夹,将文件夹内符合条件的都经替换
        if (file.exists()){
            if (file.isFile()){

            }
            if (file.isDirectory()){

            }
        }else {
            System.out.println("文件不存在");
        }
    }
}
