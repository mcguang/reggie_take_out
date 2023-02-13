package com.itheima.test;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CalcHistory {
    //统计history命令下的词频
    @Test
    public void calcFreq() throws IOException {
        Map<String,Integer> map = new HashMap<>();

        String fileName = "/Users/meicg/history.txt";
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(fileName));
        //按行读取
        String line = reader.readLine();
        while(line != null){
            //System.out.println(line);
            String[] S = line.split(" ");
            for(String s : S){
                map.put(s,map.getOrDefault(s,0) + 1);
            }
            line = reader.readLine();
        }
        reader.close();

        //排序输出
        String[] strings = map.keySet().toArray(new String[0]);
        Arrays.sort(strings,(a,b)-> -map.get(a).compareTo(map.get(b)));
        System.out.println("freq\tword");
        for(String s : strings){
            if(map.get(s) > 4)
            System.out.println(map.get(s) + "\t" + s);
        }


    }

}
