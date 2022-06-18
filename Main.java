public class Main {
        public static void main(String[] args) {

            SortedIntegerList list1 = new SortedIntegerList (false);
            SortedIntegerList list2 = new SortedIntegerList (false);
            list2.add(1);
            list2.add(3);
            list2.add(0);
            list2.add(9);
            list2.add(15);
            list2.add(10);
            list2.add(-2);
            System.out.print(list2.toString());
            list1 = list2.getLessThan(-2);
            System.out.print(list1.toString());
            System.out.print(list1.equals(list2));
        }
    }


