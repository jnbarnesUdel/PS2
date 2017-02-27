package pkgInteger;

public class MyInteger 
{
	private int iValue;

	public MyInteger(int iValue) 
	{
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven()
	{
		if(getiValue() %2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		if(getiValue() % 2 !=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrime()
	{
		for(int x = 2; x<getiValue(); x++)
		{
			if(getiValue() % x == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int iValue)
	{
		if(iValue % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd(int iValue)
	{
		if(iValue % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(int iValue)
	{
		for(int x = 2; x<iValue; x++)
		{
			if(iValue % x == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger iValue)
	{
		if(isEven(iValue) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isOdd( MyInteger iValue)
	{
		if(isOdd(iValue) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger iValue)
	{
		if(isPrime(iValue)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}



