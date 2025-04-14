public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        // Test add/get
        list.add(10);
        list.add(20);
        assert list.get(0) == 10 : "Add/get failed";

        // Test remove
        list.remove(0);
        assert list.get(0) == 20 : "Remove failed";

        // Test edge cases
        try {
            list.get(100);
            assert false : "IndexOutOfBoundsException not thrown";
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
        System.out.println("MyArrayList tests passed!");
    }
}