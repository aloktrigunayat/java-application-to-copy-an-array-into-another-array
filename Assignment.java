public class Main
{
	public static void main(String[] args) 
  {
		int a[] = {12, 45, 76, 34, 67, 11};
		int b[] = new int[a.length];
		for(int i=0; i < a.length; i++) 
    {
		    b[i] = a[i];
		}
		System.out.print("Copied Array is:");
		for(int i=0; i < b.length; i++) 
    {
		    System.out.print(" "+b[i]);
		}
	}
}
