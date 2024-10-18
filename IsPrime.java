
public class IsPrime {
	public static void main(String[] args) {
		int n=13,i;
		int a=0;
		for(i=2;i<n;i++)
		{
			if(n%2==0)
			{
				a=1;
				break;
			}
		}
			if(a==0)
			{
				System.out.println("It's a prime num");
			}
			else
			{
				System.out.println("It's not a prime num");
			}
				
		}
	}



