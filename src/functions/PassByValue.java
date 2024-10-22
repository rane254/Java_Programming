package functions;

public class PassByValue {
    public static void main(String[] args) {
        /// Note: There is no Pass By Reference like C++
        /// Java only has Pass By Value
        /// Primitive DataTypes - A reference variable's copy value is passed
        /// whereas in Non-Primitive DataTypes(Objects, Arrays, etc.) - A value of reference variable itself is passed.
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original Array: "); // 1 2 3 4 5
        for (int i : arr){
            System.out.print(i + " ");
        }
        changeArr(arr);
        System.out.print("\nModified Array: "); // 1 0 3 0 5
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    static void changeArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
    }


}
