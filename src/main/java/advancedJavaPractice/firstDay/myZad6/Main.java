package advancedJavaPractice.firstDay.myZad6;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMAP = new TreeMap<>();
        treeMAP.put(1,"Jan");
        treeMAP.put(10,"Michał");
        treeMAP.put(3,"Adam");
        treeMAP.put(7,"Leon");
        treeMAP.put(2,"Barbara");
        treeMAP.put(1,"John");

        System.out.println(treeMAP.toString());

        printFirstAndEndElement(treeMAP);

    }

    public static void printFirstAndEndElement (TreeMap<Integer, String> map) {
        System.out.println("First element: " + map.firstKey() + " = " + map.get(map.firstKey()));
        System.out.println("Last element: " + map.lastKey() + " = " + map.get(map.lastKey()));
    }
}
