package ex1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Collection collection;
        List<String> list;
        Set set;
        Queue queue;

        list = new LinkedList<>();
        list.add("hh");
        list.add("tt");
        list.add("java");
        list.add("C++");

        System.out.println(list);
        list.add("p");
        list.addAll(list);

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if (next == "hh" || next == "C++") {
                iterator.remove();
            }
        }

//        try {
//            for (String s : list) {
//                if (s == "hh") {
//                    list.remove(s);
//                }
//            }
//        }
//        catch (ConcurrentModificationException e) {
//            System.out.println("LOH                               GGGG");
//        }
//        System.out.println(list.get(2));
//        list.remove("java");
//        Collections.sort(list);
        System.out.println(list);
    }
}
