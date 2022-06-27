public class MainTest {
    public static void main(String[] args) {
        MainMethod<Integer>  values = new MySimpleArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);

        System.out.println("Add value at index[1] is: " + values.get(1));
        values.update(1,100);
        System.out.println("Value at index[1] after update is: " + values.get(1));
        values.remove(1);
        System.out.println("Size of ArrayList after remove element at index [1]: " + values.size());
        System.out.println("Value at index[1] after update is: " + values.get(1));

        for (Integer val : values) {
            System.out.println("Number: " + val);
        }

        values.isEmpty();
    }
}
