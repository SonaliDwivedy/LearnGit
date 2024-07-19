import java.util.Scanner;
 public class  ReverseString{

	public static void main(String[] args) 
	{
		Scanner r=new Scanner(System.in);
		System.out.print("Enter a string: ");
		char[] a=r.nextLine().toCharArray();
		System.out.print("Reverse String");

		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}
	}
}
