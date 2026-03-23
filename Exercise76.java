import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise76 {

    public static void main(String[] args) {
        testA();
        testB();
        testC();
        testD();
        testE();
        testF();
    }

    public static LinkedList<Double> makeWeights() {
        LinkedList<Double> weights = new LinkedList<Double>();
        weights.add(5.3);
        weights.add(2.8);
        return weights;
    }

    public static void testA() {
        try {
            LinkedList<Double> weights = makeWeights();
            ListIterator<Double> itr = weights.listIterator();
            itr.add(8.8);
            itr.next();
            itr.remove();
            System.out.println("a. legal -> " + weights);
        } catch (IllegalStateException e) {
            System.out.println("a. illegal -> " + e);
        }
    }

    public static void testB() {
        try {
            LinkedList<Double> weights = makeWeights();
            ListIterator<Double> itr = weights.listIterator();
            itr.add(8.8);
            itr.remove();
            itr.next();
            System.out.println("b. legal -> " + weights);
        } catch (IllegalStateException e) {
            System.out.println("b. illegal -> " + e);
        }
    }

    public static void testC() {
        try {
            LinkedList<Double> weights = makeWeights();
            ListIterator<Double> itr = weights.listIterator();
            itr.next();
            itr.add(8.8);
            itr.remove();
            System.out.println("c. legal -> " + weights);
        } catch (IllegalStateException e) {
            System.out.println("c. illegal -> " + e);
        }
    }

    public static void testD() {
        try {
            LinkedList<Double> weights = makeWeights();
            ListIterator<Double> itr = weights.listIterator();
            itr.next();
            itr.remove();
            itr.add(8.8);
            System.out.println("d. legal -> " + weights);
        } catch (IllegalStateException e) {
            System.out.println("d. illegal -> " + e);
        }
    }

    public static void testE() {
        try {
            LinkedList<Double> weights = makeWeights();
            ListIterator<Double> itr = weights.listIterator();
            itr.remove();
            itr.add(8.8);
            itr.next();
            System.out.println("e. legal -> " + weights);
        } catch (IllegalStateException e) {
            System.out.println("e. illegal -> " + e);
        }
    }

    public static void testF() {
        try {
            LinkedList<Double> weights = makeWeights();
            ListIterator<Double> itr = weights.listIterator();
            itr.remove();
            itr.next();
            itr.add(8.8);
            System.out.println("f. legal -> " + weights);
        } catch (IllegalStateException e) {
            System.out.println("f. illegal -> " + e);
        }
    }
}