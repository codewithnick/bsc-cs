class ItemNotFound extends Exception {
    public ItemNotFound(String s) {
        super(s);
    }
}
class Demo {
    static void find(int arr[], int item) throws ItemNotFound {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i])
                flag = true;
        }
        if (!flag) {
            throw new ItemNotFound("Item Not Found"); //calling constructor of user-defined exception class
        } else {
            System.out.println("Item Found");
        }
    }
    public static void main(String[] args) {
        try {
            find(new int[] {1,2,3}, 4);
        } catch (ItemNotFound i) {
            System.out.println(i);
        }
    }
}
