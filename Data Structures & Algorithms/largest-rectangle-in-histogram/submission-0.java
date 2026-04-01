class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int nextSmall[]=nextSmaller(heights,n);
        int prevSmall[]=prevSmaller(heights,n);
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
           int nn=nextSmall[i];
           if(nn==-1)
           nextSmall[i]=n;
           
           int len=heights[i];
           int breadth=nextSmall[i]-prevSmall[i]-1;
           int a=len*breadth;
           area=Math.max(area,a);
        }
        return area;
    }
    
    int [] prevSmaller(int h[],int n)
    {
        Stack<Integer>st=new Stack<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                a[i]=-1;
                st.push(i);
            }
            else
            {
            while((!st.isEmpty())&&h[st.peek()]>=h[i])
            st.pop();

            if(!st.isEmpty())
            a[i]=st.peek();
            else
            a[i]=-1;

            st.push(i);
            }
        }
        return a;
    }
    int [] nextSmaller(int h[],int n)
    {
        Stack<Integer>st=new Stack<>();
        int a[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            if(st.isEmpty())
            {
                a[i]=-1;
                st.push(i);
            }
            else
            {
            while((!st.isEmpty())&&h[st.peek()]>=h[i])
            st.pop();

            if(!st.isEmpty())
            a[i]=st.peek();
            else
            a[i]=-1;
            
            st.push(i);
            }
        }
        return a;
    }
}
