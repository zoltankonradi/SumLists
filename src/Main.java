import java.util.LinkedList;
import java.util.List;

public class Main {

    /*

     Cracking the Coding Interview - Linked Lists

     2.5 - Sum Lists:
     You have two numbers represented by a linked list, where each node contains a single
     digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
     function that adds the two numbers and returns the sum as a linked list.

     EXAMPLE
     Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
     Output: 2 -> 1 -> 9. That is, 912.
     FOLLOW UP
     Suppose the digits are stored in forward order. Repeat the above problem.
     EXAMPLE
     Input:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
     Output: 9 -> 1 -> 2. That is, 912.

    */

    public static void main(String[] args) {
        List<Integer> number1 = new LinkedList<>();
        List<Integer> number2 = new LinkedList<>();
        number1.add(7);
        number1.add(1);
        number1.add(6);
        number2.add(5);
        number2.add(9);
        number2.add(2);
        List<Integer> sum1 = sumListsBackwards(number1, number2);
        sum1.forEach(System.out::println);
        List<Integer> number3 = new LinkedList<>();
        List<Integer> number4 = new LinkedList<>();
        number3.add(6);
        number3.add(1);
        number3.add(7);
        number4.add(2);
        number4.add(9);
        number4.add(5);
        List<Integer> sum2 = sumListsForwards(number3, number4);
        sum2.forEach(System.out::println);
    }

    public static List<Integer> sumListsBackwards(List<Integer> number1, List<Integer> number2) {
        StringBuilder number1String = new StringBuilder();
        StringBuilder number2String = new StringBuilder();
        for (int i = number1.size() - 1; i >= 0; i--) {
            number1String.append(number1.get(i));
            number2String.append(number2.get(i));
        }
        Integer num1 = Integer.parseInt(number1String.toString());
        Integer num2 = Integer.parseInt(number2String.toString());
        String sum = Integer.toString(num1 + num2);
        List<Integer> sumList = new LinkedList<>();
        for (int i = sum.length() - 1; i >= 0; i--) {
            sumList.add(Integer.parseInt(Character.toString(sum.charAt(i))));
        }
        return sumList;
    }

    public static List<Integer> sumListsForwards(List<Integer> number1, List<Integer> number2) {
        StringBuilder number1String = new StringBuilder();
        StringBuilder number2String = new StringBuilder();
        for (int i = 0; i < number1.size(); i++) {
            number1String.append(number1.get(i));
            number2String.append(number2.get(i));
        }
        Integer num1 = Integer.parseInt(number1String.toString());
        Integer num2 = Integer.parseInt(number2String.toString());
        String sum = Integer.toString(num1 + num2);
        List<Integer> sumList = new LinkedList<>();
        for (int i = 0; i < sum.length(); i++) {
            sumList.add(Integer.parseInt(Character.toString(sum.charAt(i))));
        }
        return sumList;
    }
}
