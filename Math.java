package com.tts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math {
    public static void doMath(List<Integer> nums) {
        System.out.println("The max number of your entered numbers is:"+max(nums));
        System.out.println("The min number of your entered numbers is:"+min(nums));
        System.out.println("The sum of your entered numbers is:"+sum(nums));
        System.out.println("The average of your entered numbers is:"+avrage(nums));
        System.out.println("The product of your entered numbers is:"+product(nums));
    }
    public static int max(List<Integer> nums) {
        int max = nums.get(0); //nums[0]
        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) > max)
                max = nums.get(i);

        return max;
    }
    public static int min(List<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) < min)
                min = nums.get(i);

        return min;
    }
    public static int sum(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i <nums.size(); i++)
            sum+=nums.get(i);

        return sum;
    }
    public static int product(List<Integer> nums) {
        int mult = 1;
        for (int i = 0; i <nums.size(); i++)
            mult*=nums.get(i);

        return mult;
    }
    public static double avrage(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i <nums.size(); i++)
            sum+=nums.get(i);

        return sum/nums.size();
    }
    public static void main(String[] args) {
        int number;
        List<Integer> numbers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        for(int i=0;i<5;i++){
            try{
                System.out.printf("Number#%d: ", (i+1));
                number=scanner.nextInt();
                numbers.add(number);
            }
            catch (Error e){
                System.out.println("Error:"+e.getMessage());
            }
        }
       doMath(numbers);

//        int sum=0;
//        int mult=1;
//       int max=0;
//       int min=0;
//        int[] myarr= new int[5];
//        Scanner scanner1=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            myarr[i]=scanner1.nextInt();
//        }
//        max=myarr[0];
//        min=myarr[0];
//        for(int i=0;i<5;i++){
//            if(myarr[i]>max){
//                max=myarr[i];
//            }
//            if(myarr[i]<min){
//                min=myarr[i];
//            }
//            sum=myarr[i]+sum;
//            mult=mult*myarr[i];
//        System.out.println("The max number of your entered numbers is:"+max);
//        System.out.println("The min number of your entered numbers is:"+min);
//        System.out.println("The sum of your entered numbers is:"+sum);
//        System.out.println("The product of your entered numbers is:"+mult);
//        }
    }
}
