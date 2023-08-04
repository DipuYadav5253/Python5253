package DAA;

public class FirstAndSecondHighest {

	public static void main(String[] args) {
		
       int arr[]= {10,2,5,4,6};
         
        for (int i = 0; i < arr.length; ++i) 
        {
 
            for (int j = i + 1; j < arr.length; ++j)
            {
 
                if (arr[i] > arr[j]) 
                {
 
                    int a =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
 
                }
 
            }
 
        }
        int i=0;
        int size=arr.length-1;
         while( i<3) {
        	 System.out.println(i+1+" highest:"+arr[size]);
        	 size--;
        	 i++;
         }
       
       }

}
