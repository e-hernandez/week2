
package Grades;
import java.util.Scanner;


public class Average {
	private static float test1, test2,test3,test4;
	 private static float sum=0;
	 private static float avg=0;

	public static float sum() 
	{

	sum=(test1+test2)/2;
	return(sum);

	}
	public static float threenumbers(int a,int b, int c)
	{
		return ((a+b+c)/3);
	}
	public static float fourexams()
	{
		return ((test1+test2+test3+test4)/4);
	}
	
    public static void GetNumbers()
    {
    	Scanner input= new Scanner(System.in);
    	for(int i=1;i<5;i++)
    	{
    		System.out.println("Give me a test score");
    		if(i==1)
    		{
    		 test1=input.nextInt();	
    		}
    		if(i==2)
    		{
    		 test2=input.nextInt();	
    		}
    		if(i==3)
    		{
    		 test3=input.nextInt();	
    		}
    		if(i==4)
    		{
    		 test4=input.nextInt();	
    		}
    		
    	}
    	//System.out.println(test1+test2+test3+test4);
    }
    
}
