class Solution {
    public int[] sortArray(int[] nums) {
         int n=nums.length;
         divide(0,n-1,nums);
return nums;
}
public static void divide(int si,int ei,int[] nums){
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    divide(si,mid,nums);
    divide(mid+1,ei,nums);
    conquer(si,ei,nums,mid);
}
public static void conquer(int si,int ei,int[] nums,int mid){
    int[] arr=new int[ei+1-si];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid&&j<=ei){
        if(nums[i]<nums[j]){
            arr[k]=nums[i];
            k++;
            i++;
        }
        else{
            arr[k]=nums[j];
            k++;
            j++;
        }
    }
    while(i<=mid){
        arr[k]=nums[i];
        i++;
        k++;
    }
    while(j<=ei){
        arr[k]=nums[j];
        j++;
        k++;
    }
    for(int l=0, m=si;l<arr.length;l++,m++){
        nums[m]=arr[l];
    }
}
}


//  int temp=nums[min];
//         nums[min]=nums[i];
//         nums[i]=temp;