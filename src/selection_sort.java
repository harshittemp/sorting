import java.util.Arrays;

public class selection_sort {
    public  static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxIndex=getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[]arr,int max,int last)
    {
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;

    }
    static int getMax(int []arr,int start,int last)
    {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }
}
