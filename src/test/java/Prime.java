import java.util.Scanner;

public class Prime  
{  
public static void main(String[] args)   
    {  

Scanner s=new Scanner(System.in);	
	System.out.println("Enter the number for factorial");
System.out.println("New check for Git");	
	int n=s.nextInt();
	int factorial=1;
	for(int i=1; i<=n; i++) {
		
factorial=factorial*i;

	}
	
	//System.out.println(factorial);

	
		System.out.println("Enter the number");
		int nt = s.nextInt();
		int a,i=0,j=0;
		a=nt;
		while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		}
		System.out.println("The reverse number is "+j);
	
	
}  



}