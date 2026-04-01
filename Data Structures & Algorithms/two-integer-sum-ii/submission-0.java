class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int n=numbers.length;
    int arr[]=new int[2];
     for(int i=0;i<n;i++)
     {
        int search=target-numbers[i];
        int j=binarysearch(i+1,search,numbers);
        if(i==j||j==-1)
        continue;
        else if(i<j)
        {
            arr[0]=i+1;arr[1]=j+1;
            break;
        }
        else {
       arr[0]=j+1;arr[1]=i+1;
       break;
        }
          
     }
     return arr;
    }  
     int binarysearch(int l,int k,int a[])
     {
       
        int r=a.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==k)
            return mid;
            else if(k>a[mid])
            l=mid+1;
            else
            r=mid-1;
        }
        return -1;
     } 
    }
