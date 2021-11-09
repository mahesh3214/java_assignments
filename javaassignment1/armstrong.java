package javaassignments;

public class armstrong {
	public static void main(String[] args){
		 int n,num,i,sum=0;
		for(num=1; num<=1000; num++) {
			i=num;
			while(i>0) {
			n=i%10;
			
			sum= sum +(n*n*n);
			i=i/10;
			
			}{
		
		if(num==sum){ System.out.println("armstrong "+num);}
		sum=0;}
			}
		

}
}