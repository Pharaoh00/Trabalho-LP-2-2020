// Generated by Haxe 4.1.3
package haxe._Int64;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Int64_Impl_
{
	public static long make(int high, int low)
	{
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		long this1 = ( ( ((long) (high) ) << 32 ) | ( ((long) (low) ) & 0xffffffffL ) );
		//line 37 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (this1) );
	}
	
	
	public static long _new(long x)
	{
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		long this1 = x;
		//line 40 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (this1) );
	}
	
	
	
	
	public static long get_val(long this1)
	{
		//line 46 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	public static long set_val(long this1, long x)
	{
		//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 = x;
		//line 49 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	
	
	public static int get_high(long this1)
	{
		//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (( this1 >> 32 )) );
	}
	
	
	
	
	public static int get_low(long this1)
	{
		//line 59 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (this1) );
	}
	
	
	public static long copy(long this1)
	{
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		long this2 = this1;
		//line 62 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (this2) );
	}
	
	
	public static long ofInt(int x)
	{
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((long) (x) );
	}
	
	
	public static boolean is(java.lang.Object val)
	{
		//line 69 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( val instanceof java.lang.Long );
	}
	
	
	public static boolean isInt64(java.lang.Object val)
	{
		//line 72 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( val instanceof java.lang.Long );
	}
	
	
	public static int toInt(long x)
	{
		//line 75 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ( ((long) (x) ) < -2147483648 ) || ( ((long) (x) ) > 2147483647 ) )) 
		{
			//line 76 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown("Overflow")) );
		}
		
		//line 77 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (((long) (x) )) );
	}
	
	
	public static int getHigh(long x)
	{
		//line 81 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (( ((long) (x) ) >> 32 )) );
	}
	
	
	public static int getLow(long x)
	{
		//line 84 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ((int) (((long) (x) )) );
	}
	
	
	public static boolean isNeg(long x)
	{
		//line 87 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (x) ) < 0 );
	}
	
	
	public static boolean isZero(long x)
	{
		//line 90 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (x) ) == 0 );
	}
	
	
	public static int compare(long a, long b)
	{
		//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (a) ) < ((long) (b) ) )) 
		{
			//line 94 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			return -1;
		}
		
		//line 95 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (a) ) > ((long) (b) ) )) 
		{
			//line 96 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			return 1;
		}
		
		//line 97 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return 0;
	}
	
	
	public static int ucompare(long a, long b)
	{
		//line 101 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (a) ) < 0 )) 
		{
			//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			if (( ((long) (b) ) < 0 )) 
			{
				//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				if (( ((long) (a) ) < ((long) (b) ) )) 
				{
					//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					return -1;
				}
				else
				{
					//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					if (( ((long) (a) ) > ((long) (b) ) )) 
					{
						//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
						return 1;
					}
					else
					{
						//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
						return 0;
					}
					
				}
				
			}
			else
			{
				//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				return 1;
			}
			
		}
		
		//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		if (( ((long) (b) ) < 0 )) 
		{
			//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			return -1;
		}
		else
		{
			//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
			if (( ((long) (a) ) < ((long) (b) ) )) 
			{
				//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				return -1;
			}
			else
			{
				//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
				if (( ((long) (a) ) > ((long) (b) ) )) 
				{
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					return 1;
				}
				else
				{
					//line 103 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
					return 0;
				}
				
			}
			
		}
		
	}
	
	
	public static java.lang.String toStr(long x)
	{
		//line 107 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( "" + haxe.root.Std.string(((long) (x) )) );
	}
	
	
	public static java.lang.Object divMod(long dividend, long divisor)
	{
		//line 110 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return new haxe.lang.DynamicObject(new java.lang.String[]{"modulus", "quotient"}, new java.lang.Object[]{((long) (( ((long) (dividend) ) % ((long) (divisor) ) )) ), ((long) (( ((long) (dividend) ) / ((long) (divisor) ) )) )}, new java.lang.String[]{}, new double[]{});
	}
	
	
	public static java.lang.String toString(long this1)
	{
		//line 113 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( "" + haxe.root.Std.string(this1) );
	}
	
	
	public static long parseString(java.lang.String sParam)
	{
		//line 117 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return haxe.Int64Helper.parseString(sParam);
	}
	
	
	public static long fromFloat(double f)
	{
		//line 121 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return haxe.Int64Helper.fromFloat(f);
	}
	
	
	public static long neg(long x)
	{
		//line 125 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return  - (((long) (x) )) ;
	}
	
	
	public static long preIncrement(long this1)
	{
		//line 128 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 += ((long) (1) );
		//line 128 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	public static long postIncrement(long this1)
	{
		//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 += ((long) (1) );
		//line 131 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( this1 - 1 );
	}
	
	
	public static long preDecrement(long this1)
	{
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 -= ((long) (1) );
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return this1;
	}
	
	
	public static long postDecrement(long this1)
	{
		//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		this1 -= ((long) (1) );
		//line 137 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( this1 + 1 );
	}
	
	
	public static long add(long a, long b)
	{
		//line 140 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) + ((long) (b) ) );
	}
	
	
	public static long addInt(long a, int b)
	{
		//line 143 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) + b );
	}
	
	
	public static long sub(long a, long b)
	{
		//line 146 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) - ((long) (b) ) );
	}
	
	
	public static long subInt(long a, int b)
	{
		//line 149 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) - b );
	}
	
	
	public static long intSub(int a, long b)
	{
		//line 152 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a - ((long) (b) ) );
	}
	
	
	public static long mul(long a, long b)
	{
		//line 155 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) * ((long) (b) ) );
	}
	
	
	public static long mulInt(long a, int b)
	{
		//line 158 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) * b );
	}
	
	
	public static long div(long a, long b)
	{
		//line 161 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) / ((long) (b) ) );
	}
	
	
	public static long divInt(long a, int b)
	{
		//line 164 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) / b );
	}
	
	
	public static long intDiv(int a, long b)
	{
		//line 167 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a / ((long) (b) ) );
	}
	
	
	public static long mod(long a, long b)
	{
		//line 170 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) % ((long) (b) ) );
	}
	
	
	public static long modInt(long a, int b)
	{
		//line 173 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) % b );
	}
	
	
	public static long intMod(int a, long b)
	{
		//line 176 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a % ((long) (b) ) );
	}
	
	
	public static boolean eq(long a, long b)
	{
		//line 179 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) == ((long) (b) ) );
	}
	
	
	public static boolean eqInt(long a, int b)
	{
		//line 182 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) == b );
	}
	
	
	public static boolean neq(long a, long b)
	{
		//line 185 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) != ((long) (b) ) );
	}
	
	
	public static boolean neqInt(long a, int b)
	{
		//line 188 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) != b );
	}
	
	
	public static boolean lt(long a, long b)
	{
		//line 191 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) < ((long) (b) ) );
	}
	
	
	public static boolean ltInt(long a, int b)
	{
		//line 194 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) < b );
	}
	
	
	public static boolean intLt(int a, long b)
	{
		//line 197 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a < ((long) (b) ) );
	}
	
	
	public static boolean lte(long a, long b)
	{
		//line 200 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) <= ((long) (b) ) );
	}
	
	
	public static boolean lteInt(long a, int b)
	{
		//line 203 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) <= b );
	}
	
	
	public static boolean intLte(int a, long b)
	{
		//line 206 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a <= ((long) (b) ) );
	}
	
	
	public static boolean gt(long a, long b)
	{
		//line 209 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) > ((long) (b) ) );
	}
	
	
	public static boolean gtInt(long a, int b)
	{
		//line 212 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) > b );
	}
	
	
	public static boolean intGt(int a, long b)
	{
		//line 215 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a > ((long) (b) ) );
	}
	
	
	public static boolean gte(long a, long b)
	{
		//line 218 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >= ((long) (b) ) );
	}
	
	
	public static boolean gteInt(long a, int b)
	{
		//line 221 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >= b );
	}
	
	
	public static boolean intGte(int a, long b)
	{
		//line 224 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( a >= ((long) (b) ) );
	}
	
	
	public static long complement(long x)
	{
		//line 227 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return  ~ (((long) (x) )) ;
	}
	
	
	public static long and(long a, long b)
	{
		//line 230 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) & ((long) (b) ) );
	}
	
	
	public static long or(long a, long b)
	{
		//line 233 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) | ((long) (b) ) );
	}
	
	
	public static long xor(long a, long b)
	{
		//line 236 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) ^ ((long) (b) ) );
	}
	
	
	public static long shl(long a, int b)
	{
		//line 239 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) << b );
	}
	
	
	public static long shr(long a, int b)
	{
		//line 242 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >> b );
	}
	
	
	public static long ushr(long a, int b)
	{
		//line 245 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\Int64.hx"
		return ( ((long) (a) ) >>> b );
	}
	
	
}

