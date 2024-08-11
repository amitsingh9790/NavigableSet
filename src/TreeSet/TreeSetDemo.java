package TreeSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet TS = new TreeSet();
        TS.add("Table");
        TS.add("Chair");
        TS.add("Bed");
        TS.add("Bag");
        TS.add("Bottle");
        TS.add("Laptop");
        TS.add("Mobile");

        System.out.println(TS);
        System.out.println("lower: "+TS.lower("Table"));  // return Exactly just previous value
        System.out.println("higher: "+TS.higher("Bag"));  // return Exactly just next value

        System.out.println("ceiling: "+TS.ceiling("Laptop")); // return Equal or next value
        System.out.println("floor: "+TS.floor("Mobile"));     // return Equal or previous value


        System.out.println(TS);
        System.out.println("Is Bottle: "+TS.contains("Bottle"));
        TS.remove("Bottle");
        System.out.println(TS);

    }
}
