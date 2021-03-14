public class MyArrays {
    public static String toString(long[] array){
        String ans = "[";
        for (int i = 0;i < array.length;i++){
            ans = ans + array[i];
            if (i != array.length - 1){
                ans = ans + ",";
            }
            if (i == array.length - 1){
                ans = ans + "]";
            }
        }
        return ans;
    }

    public static long[] copyOf(long[] original, int newLength){
        if (newLength < 0){
            throw new RuntimeException("newLength必须 >= 0");
        }
        long[] ans = new long[newLength];
        int size = Integer.min(original.length,newLength);
        for (int i = 0;i < size;i++){
            //long element = original[i];
            ans[i] = original[i];
        }
        return ans;
    }

    public static long[] copyOfRange(long[] original,int from,int to){
        if (from < 0){
            throw new RuntimeException("拷贝起始位置不能小于0");
        }
        if (from > original.length){
            throw new RuntimeException("拷贝起始位置不能大于被拷贝数组的长度");
        }
        if (from > to){
            throw new RuntimeException("拷贝起始位置不能大于拷贝结束位置下标");
        }
        int copyLength = to - from;
        long[] ans = new long[copyLength];
        //下标合法区间的判断
        // 1. i 在 ans 中是合法下标  [0, ans.length)
        // 2. from + i 在 original 中是合法下标 [0, original.length)
        //    i 的取值范围 [-from, original.length - from)
        // 最后，i 的合法范围：[0, ans.length) 和 [-from, original.length - from) 的交集
        // i ~ [0, min(ans.length, original.length - from))
        int size = Math.min(copyLength,original.length - from);
        for (int i = 0;i < size;i++){
            ans[i] = original[from + i];
        }
        return  ans;
    }

    public static long[] bubbleSort(long[] arr){      //冒泡排序 左开右闭
        //最少需要 arr.length次排序
        int times = arr.length - 1;
        //乱序区间为 [0 , arr.length - i)
        //j 需要保证 j + 1区间合法 为   [0 , arr.length - i)
        //则     j~ [-1 , arr.length - i - 1)求交集为
        //j~[0,arr.length - i - 1)
        for (int i = 0;i < times;i++){
            for (int j = 0;j < arr.length - i - 1;j++){
                if (arr[j] > arr[j+1]){
                long t = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = t;
                }
            }
        }
        return arr;
    }


    public static int binarySearch(long[] arr,long target){
        int lowIndex = 0;
        int highIndex = arr.length;

        while (highIndex - lowIndex > 0){
            int midIndex =  (highIndex + lowIndex)/2;
            long midElement = arr[midIndex];

            if (target == midElement){
                return midIndex;
            }else if (target < midElement){
                highIndex = midIndex;
            }else{
                lowIndex = midIndex + 1;
            }
        }
        return -1;
    }

    public static void reverse(long[] arr){
        int left = 0;
        int right = arr.length - 1;
        while ((right - left) > 0){
            long t = arr[right];
            arr[right] = arr[left];
            arr[left] = t;
            right--;
            left++;
        }
    }

    public static void transform(long[] arr){
        int left = 0;
        int right = arr.length - 1;
        while ((right - left) > 0){
            while (right >left && arr[left] % 2 == 0){
                left++;
            }
            while (right >left && arr[right] % 2 != 0){
                right--;
            }

            long tmp = arr[right];
            arr[right] = arr[left];
            arr[left] = tmp;
        }
    }
    public static void transform2(long[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (right > left) {
            while (right > left && (arr[left] % 2) == 0) {
            left++;
            }
            while (right > left && (arr[right] % 2) != 0) {
                right--;
            }
            long tmp = arr[right];
            arr[right] = arr[left];
            arr[left] = tmp;
        }

    }


}
