import java.util.*;
public class BinaryToDecimal
{
public static void main(String args[]){
if(args[0] == null)
{
System.err.println("Usage binary number");
}
String binary = args[0];
ArrayList<Integer> decimals = new ArrayList<Integer>();
ArrayList<Integer> finals = new ArrayList<Integer>();
int x = (binary.length()-1);
while(x > -1)
{
	String temp = Character.toString(binary.charAt(x));
	int y = Integer.parseInt(temp);
	decimals.add(y);
	x = x - 1;
}
int z = 0;
	while(z < decimals.size())
	{
		int w = -1;
		int q = decimals.get(z);
		while(w < z)
		{
			q = q*2;
			w++;
		}
		finals.add(q);
		z++;
	}
	int last = 0;
for(int p = 0; p < finals.size(); p++)
{
	last += finals.get(p);
}
	System.out.println("Decimal number = " + (last/2));
	}
}
	
	