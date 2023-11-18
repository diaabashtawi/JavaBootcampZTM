package variables;

import java.util.Arrays;

public class ExampleOfArray {

    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};
        nums[4] = 10;
        System.out.println(nums[4]);
        System.out.println(nums);
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

    }
}
