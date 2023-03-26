public class bai2 {
    public static void main(String[] args) {
        int [] arr = {1,35,5,4,15,6,7,8,9,10};
        int count = 0;
        double max = arr[0];
        for(int i =0; i< arr.length; i++){
            count += arr[i];
        }
        for (int j = 0; j< arr.length; j++) {
            if(max < arr[j])
                max = arr[j];
        }
        System.out.printf("Số lớn nhất trong mảng là: " + max);
        System.out.println();
        System.out.println("Tổng = " + count);
    }
}
