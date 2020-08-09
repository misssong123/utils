package com.meng;

import java.io.File;
/**
 * 将指定文件夹中的文件去掉指定字符串
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
                String resultName = "";
                resultName = path.replace(file.getName(),"");
                //将除文件名后缀的内容进行替换，在和文件名后缀进行拼接
                resultName=resultName+file.getName().substring(0,file.getName().lastIndexOf(".")).replace(target,"")+file.getName().substring(file.getName().lastIndexOf("."));
                File result = new File(resultName);
                file.renameTo(result);
            }
            if (file.isDirectory()){
                //记录替换的文件个数
                int num = 0;
                //记录总文件个数
                int total =0;
                File[] files = file.listFiles();
                for (File demo : files){
                    total ++;
                    if (demo.getName().contains(target)){
                        num ++;
                        String name = demo.getName();
                        String resultName = path+"\\"+name.substring(0,name.lastIndexOf(".")).replace(target,"")
                                +name.substring(name.lastIndexOf("."));
                        File result = new File(resultName);
                        demo.renameTo(result);
                    }
                }
                System.out.println("总共有"+total+"个文件,成功替换"+num+"个文件");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
}
