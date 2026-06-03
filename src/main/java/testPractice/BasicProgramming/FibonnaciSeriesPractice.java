package testPractice.BasicProgramming;

import java.util.Scanner;

public class FibonnaciSeriesPractice 
{
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Fibonnaci series : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int currentIndex = 0 ;
        
        int n1 = 1 ;
        int n2 = 1 ;
        
        arr[0] = n1 ;
        arr[1] = n2 ;
        
        System.out.print(n1+" "+n2+" ");
        
        for ( int i = 3 ; i <= n ; i++ )
        {
            
            int n3 = n1+n2;
            arr[i-1] = n3 ;
            n1 = n2 ;
            n2 = n3 ;
            System.out.print(n3+" ");
        }
        
        System.out.println();
        
        for ( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }
        
//        for ( int i = 0 ; i < arr.length ; i++ )
//        {
//            for( int j = 0 ; j < i ; j++ )
//            {
//                if( currentIndex < n )
//                {
////                    System.out.print(arr[currentIndex]+" ");
////                    currentIndex++;
//                	if( i%2 != 0) 
//                	{
//                		System.out.print(arr[currentIndex]+" ");
//                		currentIndex++;
//                	}
//                	else
//                	{
//                		int endRowIndex = currentIndex + i - 1 ;
//                		for
//                	}
//                }
//            }
//            System.out.println();
//        }
        
        try
        {
	        for( int i = 0 ; i < arr.length - 1 ; i++ )
	        {
	        	if( i%2 != 0 && currentIndex < n ) 
	        	{
	        		for ( int j = 0 ; j < i ; j++ )
	        		{
		        		System.out.print(arr[currentIndex]+" ");
		        		currentIndex++;
	        		}
	        	}
	        	else
	        	{
	        		int rowEndIndex = currentIndex + i - 1;
	        		for ( int j = 0 ; j < i ; j++ ) 
	        		{
	        			System.out.print(arr[rowEndIndex - j ]+" ");
	        		}
	        		currentIndex += i ;
	        	}
	        	System.out.println();
	        }
        }
        catch(Exception e)
        {
        	System.out.println();
        }
        
        sc.close();
    }
	
}
