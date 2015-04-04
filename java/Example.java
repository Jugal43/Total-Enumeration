package javaapplication1;

/**
 * @author jugal
 */
public class Example {

    public static void main(String[] args) {
        TotalEnumeration te = new TotalEnumeration(new String[][]{{"a", "b","e","f"}, {"c", "d"}, {"5", "6"}, {"7", "8", "9"}});
        te.genarate();
    }

}
