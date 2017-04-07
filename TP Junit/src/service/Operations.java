package service;

public class Operations {

	
	public static long add(long ... numbers)
	{
		long y=numbers.length ;
		long x=0;
		if (y>0){
			
			int i=0;
			while (i<y)
			{
				x+=numbers[i];
				i++;
			}
			
			/*
			 * if (numbers.length>0)
			 * {
			 * long resultat=0;
			 * for (long n : numbers)
			 * {
				 resultat+=n;
				}
				return resultat;
			 */
				
		}
		return x;
	}
	
	
	
	public static long mult(long ... numbers)
	{
		long y=numbers.length;
	
		if (y>0){
		long x=1;
		int i=0;
		while (i<y)
		{
			x*=numbers[i];
			i++;
		}
		return x;
		
		/*
		 * if (numbers.length>0)
		 * {
		 * long resultat=1;
		 * for (long n : numbers)
		 * {
			 resultat*=n;
			}
			return resultat;
		 */
	}
		else 
		{
			return 0;
		}
	}}
