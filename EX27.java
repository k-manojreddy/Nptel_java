import java.util.*;
public class EX27
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0){
		    System.out.println("Invalid line Number");
		}
		else{
		    for(int i=1;i<=n;i++){
		        if(i<=n/2+1){
	        for(int j=1;j<=n/2+1-i;j++)
	        System.out.print(" ");
	        for(int j=1;j<=i;j++){
	        System.out.print("* ");
	        }
		        }
		        else{
		            for(int j=1;j<=-(n/2+1-i);j++)
	        System.out.print(" ");
	        for(int j=1;j<=n+1-i;j++){
	        System.out.print("* ");
		        }
		        }
	        System.out.println();
	    }
		}
	}
}