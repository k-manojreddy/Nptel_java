import java.util.*;
class EX23{
	int cube(int n){return n*n*n;}
	public static void main(String[] args){
		EX23 e=new EX23();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0,x=n;
		for(int i=0;;i++){
			k+=e.cube(x%10);
			x=x/10;
			if(x==0){break;}
		}
		System.out.print(((k==n)?1:0));
	}
}