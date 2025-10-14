package Phase_1_LambdasFuntionalInterface;

import java.util.HashMap;
import java.util.Map;

public class LambdaMapOps {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"John");
        map.put(2,"Jane");
        map.put(3,"Jack");
        //forEach
        map.forEach((k,v)->System.out.println(k+" "+v));
        //replaceAll
        map.replaceAll((k,v)->v.toUpperCase());
        //computeIfPresent
        map.computeIfPresent(2,(k,v)->v+" DOE");
        //computeIfAbsent
        map.computeIfAbsent(4,(k->"Jill"));
        System.out.println(map);

    }
}
