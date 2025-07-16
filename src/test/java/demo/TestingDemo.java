package demo;


public class TestingDemo 
{
  
	public static void main(String[] args) 
	{
		String x="3214123";
		char[] a1=x.toCharArray();
		StringBuffer bf=new StringBuffer();
		String z=bf.append(a1).toString();
		System.out.println("value="+z);
		char[] a=x.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(x.indexOf(a[i])<i)
			{
				continue;
			}
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+"  ,"+count);
		}
		
		
	}
	
}
