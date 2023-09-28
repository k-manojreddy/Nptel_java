import java.util.*;
class EX22{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		double r=sc.nextDouble();
		if(r<=0){
			System.out.print(" please enter non zero positive number ");
		}
		else{
			System.out.print((2*Math.PI*r)+"\n"+(Math.PI*r*r));
		}
	}
}