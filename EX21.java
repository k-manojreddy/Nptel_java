import java.util.*;
class EX21{
	public static void main(String[] args){
		Scanner t=new Scanner(System.in);
		int n=t.nextInt();
		int k=0,s=0;
		for(int i=0;;i+=2){
			if(i%3==0){
				k+=i;
			}
			if(s==n){break;} s++;
		}
		System.out.println(k);
	}
}