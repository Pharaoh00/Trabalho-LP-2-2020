// Generated by Haxe 4.1.3
package haxe._Int32;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Int32_Impl_
{
	public static int negate(int this1)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return (  ~ (this1)  + 1 );
	}
	
	
	public static int preIncrement(int this1)
	{
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		this1 =  ++ this1;
		//line 34 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return this1;
	}
	
	
	public static int postIncrement(int this1)
	{
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		int ret = this1++;
		//line 39 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ret;
	}
	
	
	public static int preDecrement(int this1)
	{
		//line 43 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		this1 =  -- this1;
		//line 43 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return this1;
	}
	
	
	public static int postDecrement(int this1)
	{
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		int ret = this1--;
		//line 48 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ret;
	}
	
	
	public static int add(int a, int b)
	{
		//line 52 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ( ((int) (a) ) + ((int) (b) ) );
	}
	
	
	public static int addInt(int a, int b)
	{
		//line 55 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ( ((int) (a) ) + b );
	}
	
	
	public static int sub(int a, int b)
	{
		//line 60 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ( ((int) (a) ) - ((int) (b) ) );
	}
	
	
	public static int subInt(int a, int b)
	{
		//line 63 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ( ((int) (a) ) - b );
	}
	
	
	public static int intSub(int a, int b)
	{
		//line 66 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ( a - ((int) (b) ) );
	}
	
	
	public static double toFloat(int this1)
	{
		//line 248 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return ((double) (this1) );
	}
	
	
	public static int ucompare(int a, int b)
	{
		//line 254 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		if (( a < 0 )) 
		{
			//line 255 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
			if (( b < 0 )) 
			{
				//line 255 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
				return ((int) (( ((int) ( ~ (b) ) ) - ((int) ( ~ (a) ) ) )) );
			}
			else
			{
				//line 255 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
				return 1;
			}
			
		}
		
		//line 256 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		if (( b < 0 )) 
		{
			//line 256 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
			return -1;
		}
		else
		{
			//line 256 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
			return ((int) (( ((int) (a) ) - ((int) (b) ) )) );
		}
		
	}
	
	
	public static int clamp(int x)
	{
		//line 278 "C:\\HaxeToolkit\\haxe\\std\\haxe\\Int32.hx"
		return x;
	}
	
	
}


