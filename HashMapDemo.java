package assignment_18_05;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {


    HashMap<String,Integer> hashMap=new HashMap<>();
hashMap.put("prashanth",1);
        hashMap.put("prashanth1",2);
        hashMap.put("prashanth2",3);
        hashMap.put("prashanth3",4);
        hashMap.put("prashanth4",5);
        System.out.println(hashMap);
        Set<String> key=hashMap.keySet();
        for(String keys:key){
            System.out.println(keys+"====>"+hashMap.get(keys));
        }

    }
}
