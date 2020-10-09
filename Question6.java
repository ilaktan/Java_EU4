package MyAssignment5;

public class Question6 {

	public static void main(String[] args) {
//		Question-6:
//
//			Write a program to print Fibonacci series of n terms where n is 
		//declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
//
//
//
		int n=15 ,t1=0,t2=1;
		System.out.println(n);
		
		for(int i=1;i<=n;++i) {
			
			
				System.out.println(t1);
				int sum=t1+t2;
				t1=t2;
				t2=sum;
				
			}
			
		}
		

	}

	