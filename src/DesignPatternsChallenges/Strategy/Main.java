package DesignPatternsChallenges.Strategy;

import java.util.Arrays;




public class Main {
    public static void main(String[] args) {
        Integer[]arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[]copy01OfArr= Arrays.copyOf(arr,arr.length);
        Integer[]copy02OfArr= Arrays.copyOf(arr,arr.length);
        BubleSort bu=new BubleSort();
        bu.sort(copy01OfArr);
        displaySorted(new BubleSort(),copy01OfArr);
        System.out.println(" ");
        MergeSort me=new MergeSort();
        me.sort(copy02OfArr);
        displaySorted(new MergeSort(),copy02OfArr);

    }

    static void displaySorted(SortingStrategy strategy,Integer[]arr){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"  ");
       }
    }

}
class BubleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {

        for(int i=0;i<list.length-1;i++){
            for(int j=0;j<list.length-i-1;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }

}
class MergeSort implements SortingStrategy{
    public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){

        int i=0,l=0,r = 0;

        while(l<left_size && r<right_size){

            if(left_arr[l]<right_arr[r]){
                arr[i++] = left_arr[l++];
            }
            else{
                arr[i++] = right_arr[r++];
            }
        }
        while(l<left_size){
            arr[i++] = left_arr[l++];
        }
        while(r<right_size){
            arr[i++] = right_arr[r++];
        }
    }

    @Override
    public  void sort(Integer[] list) {
        int mid=list.length/2;
        Integer[] list1=new Integer[mid];
        Integer[]list2=new Integer[list.length-mid];
        for(int i=0;i<mid;i++){
            list1[i]=list[i];
        }
        for(int i=mid;i<list.length;i++){
            list2[i-mid]=list[i];
        }
        for(int i=0;i<mid-1;i++){
            for(int j=0;j<mid-i-1;j++){
                if(list1[j]>list1[j+1]){
                    int temp=list1[j];
                    list1[j]=list1[j+1];
                    list1[j+1]=temp;
                }
            }
        }
        for(int i=mid;i<list.length-1;i++){
            for(int j=mid;j<list.length-i-1;j++){
                if(list2[j]>list2[j+1]){
                    int temp=list2[j];
                    list2[j]=list2[j+1];
                    list2[j+1]=temp;
                }
            }
        }
        System.arraycopy(list1,0,list,0,mid);
        System.arraycopy(list2,0,list,mid,list.length-mid);
    }

}