package Others;

import java.util.Arrays;

class Sorting {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        System.out.println();
//        System.out.println("Before Sort - "+ Arrays.toString(arr));
//        System.out.println(firstMissingPositive(arr));
//        mergeSort(arr,0, arr.length);
//        System.out.println("After Sort - "+ Arrays.toString(arr));
    }
    public static void insertionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int j=i+1;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }
    public static void cyclicSort(int[] a){
        int i=0;
        while(i<a.length){
            int correct=a[i]-1;
            if(a[i]!=i+1){
                int temp=a[correct];
                a[correct]=a[i];
                a[i]=temp;
            }
            else{
                i++;
            }
        }
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        int index=0;

        while(index<nums.length){
            if(nums[index]!=index+1){
                return index+1;
            }
            index++;
        }
        return nums.length+1;
    }
    public static void mergeSort(int[] a,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=(start+end)/2;
        mergeSort(a,start,mid);
        mergeSort(a,mid,end);
        merge(a,start,mid,end);
    }

    public static void merge(int[] a, int start,int mid, int end) {
        int[] mix= new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(a[i]<a[j]){
                mix[k]=a[i];
                i++;
            }
            else{
                mix[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=a[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k]=a[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            a[start+l]=mix[l];
        }
    }
}