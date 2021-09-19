package LessonThree;

import java.sql.SQLOutput;
import java.util.Arrays;

public class LessonThree {
    public static void main(String[] args) {
        // Меняем 1 на 0 и наоборот
      int [] arr = {0,1,1,1,0,1,0,0};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==0){arr[i]=1;}
            else {arr[i]=0;}
        }
        // Заполняем массив от 1 до 100
        int [] nums = new int[100];
        for (int i = 0; i <= nums.length-1 ; i++) {
            nums[i]=i+1;
        }
        // Пример на матиматическое действие
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<6){array[i]*=2;}
        }
        // Заполняем диaгонали
        int[][] arr1 = new int[5][5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println();
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][arr1.length - 1 - i] = 1;
                if (i == j) {
                    arr1[i][j] = 1;
                }
                System.out.print(arr1[i][j] + " ");
            }
        }
        System.out.println();// Чтобы вывод в консоль был читабелен
        System.out.println(Arrays.toString(arrayInit(5,2)));
        findMaxAndMin(array);
        System.out.println(checkEquality(new int[]{2, 2, 2, 1, 2, 2, 6, 1}));
        moveIt(new int []{1,2,3,4},-1);
    }
   public static int[] arrayInit(int len, int initValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initValue;
        }
        return arr;
    }
    public static void findMaxAndMin(int[]arr){
        int max=arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max) {max=arr[i];}
            if(arr[i]<min) {min =arr[i];}
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
    }
    public static boolean checkEquality(int[] arr) {
        int sum = 0;
        int sum1=0;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for(int i =arr.length-1;i>0;i--){
            sum1+=arr[i];
            sum =sum-arr[i];
            if(sum1==sum){flag=true;break;}
        }
        if(flag){return true;}
        else {return false;}
    }
    public static void moveIt(int[]arr,int n){
        if(n<0){
            for (int j = 0; j < Math.abs(n); j++) {
                int temp = arr[0];
                for(int i=0; i< arr.length-1;i++){
                    arr[i]=arr[i+1];
                }
                arr[arr.length-1]=temp;}

            System.out.println(Arrays.toString(arr));}
        if(n>0){
            for (int j = 0; j < Math.abs(n); j++) {
                int temp = arr[arr.length-1];
                for(int i= arr.length-1; i>=1;i--){
                    arr[i]=arr[i-1];
                }
                arr[0]=temp;}
            System.out.println(Arrays.toString(arr));}

    }



}
