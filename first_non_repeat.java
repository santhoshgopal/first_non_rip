import java.io.*;
import java.util.*;
class first_non_repeat
{
public static void main(String args[])
{
int count=0;
Scanner in=new Scanner(System.in);
ArrayList<Integer> aaa=new ArrayList<Integer>();
System.out.println("Enter the number of elements");
int len=in.nextInt();
int[] a=new int[len];
for(int i=0;i<len;i++)
aaa.add(in.nextInt());
//Collections.sort(aaa);

	for(int i=0;i<len;i++)
	{
		for(int j=i;j<len-1;j++)
		{	
			if(aaa.get(i)==aaa.get(j+1))
			{
				System.out.println(aaa.get(i)+"\t"+"the value is"+i);
				count++;
				break;
				
			}
		
		}
		if(count==1)
		break;
	}
if(count==0)
System.out.println("NO POSSIBLE REPETATION HERE");
}
}