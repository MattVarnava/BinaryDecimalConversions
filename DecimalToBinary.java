import java.util.*;
public class DecimalToBinary{
public static void main(String args[]){
	if(args[0] == null)
	{
		System.err.println("Usage decimal number");
	}
		int y = Integer.parseInt(args[0]);
		ArrayList<String> binary = new ArrayList<String>();
		ArrayList<String> finals = new ArrayList<String>();
		while(y > 0)
		{
			if((y%2 != 0))
			{
				binary.add("1");
			}
			else
			{
				binary.add("0");
			}
			y = y/2;
		}
		int z = binary.size();
		while(z>0)
		{
			finals.add(binary.get((z-1)));
			z--;			
		}
		String temp = "";
		for(int p = 0; p < finals.size(); p++)
		{
			temp += finals.get(p);
		}
			System.out.println(temp);
		}
}		