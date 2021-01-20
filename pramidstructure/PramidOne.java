package pramidstructure;

public class PramidOne {
	public static void main(String[] args) {
		 int x=5;
		 for(int i=x;i>=1;i--)
		 {
			 for(int j=i-i;j>=1;j--) {
				 System.out.print(" "); 
				 
				 }
			 for(int j=1;j<=2*i-1;j++)
			 {
				 
			 System.out.print("*");
			 
		 }
			 System.out.println();
	}
	}


}
