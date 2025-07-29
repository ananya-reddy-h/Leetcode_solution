class Solution {
    public static int [] merge(int[] nums1, int m, int[] nums2, int n) {
      int l=m+n;
      int temp;
      
      
      for(int j =0;j<n;j++){
        nums1[m+j]=nums2[j];
      } 
         for(int i =0;i<l-1;i++){
        for(int j=0;j<l-i-1;j++){
            if(nums1[j]>nums1[j+1]){
                temp=nums1[j];
                nums1[j]=nums1[j+1];
                nums1[j+1]=temp;
            
            }
        }
          }
        return nums1;
    }
   }
