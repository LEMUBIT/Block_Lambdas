package lemubit.academy;

public class Home {

    public static void main(String[] args) {
        Store store = (arr) -> {
            int sum = 0;
            for (int x : arr) {
                sum = sum + x;
            }
            return sum;
        };

        var array = new int[]{3, 3, 4};
        var result = store.add(array);

        System.out.println(result);
    }


    interface Store {
        int add(int[] arr);
    }
}
