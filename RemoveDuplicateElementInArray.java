package _MNC_Coding_Que;

import java.util.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementInArray {
    public static void main(String[] args)
    {
        List<Integer> l = Arrays.asList(1,2,3,4,4,5,3,2);
        new HashSet<>(l).forEach(e -> System.out.print(e+" "));


    }
}
