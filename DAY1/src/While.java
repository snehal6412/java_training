
public class While {
	public static void main(String args[]) {
		int i=1;
		while(true)
		{
			System.out.println(i+ "\t");
			i++;
			if(i<=20)
				continue;
			else
				break;
		}
	}
}
