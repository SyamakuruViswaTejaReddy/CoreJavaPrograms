package Phase_1_StreamOptional;

import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
    
    List<Integer> values = List.of(4, 16, 36, 64);
    int result= values.stream()
                      .reduce(100,(a,b)->a+b ); //100 is initial value(starting point)
    System.out.println(result);
    }
}
