// Generated by Haxe 4.1.3
package haxe.java;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Lib extends haxe.lang.HxObject
{
	public Lib(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Lib()
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		haxe.java.Lib.__hx_ctor_haxe_java_Lib(this);
	}
	
	
	protected static void __hx_ctor_haxe_java_Lib(haxe.java.Lib __hx_this)
	{
	}
	
	
	public static haxe.root.Array<java.lang.String> array_String(java.lang.String[] _native)
	{
		//line 102 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.String>) (haxe.root.Array.ofNative(((java.lang.String[]) (_native) ))) );
	}
	
	
	public static void print(java.lang.Object v)
	{
		//line 35 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.System.out.print(((java.lang.Object) (v) ));
	}
	
	
	public static void println(java.lang.Object v)
	{
		//line 42 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.System.out.println(((java.lang.Object) (v) ));
	}
	
	
	public static <T> T[] nativeArray(haxe.root.Array<T> arr, boolean equalLengthRequired)
	{
		//line 52 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		T[] ret = ((T[]) (((java.lang.Object) (new java.lang.Object[arr.length]) )) );
		//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = arr.length;
			//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 53 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 54 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = arr.__get(i);
			}
			
		}
		
		//line 56 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ret;
	}
	
	
	public static <T> java.lang.Class nativeType(T obj)
	{
		//line 65 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((java.lang.Class) (((java.lang.Class) (obj.getClass()) )) );
	}
	
	
	public static <T> java.lang.Class getNativeType(T obj)
	{
		//line 72 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((java.lang.Class) (((java.lang.Class) (obj.getClass()) )) );
	}
	
	
	public static <T> java.lang.Class fromNativeType(java.lang.Class t)
	{
		//line 79 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return t;
	}
	
	
	public static <T> java.lang.Class toNativeType(java.lang.Class cl)
	{
		//line 86 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return cl;
	}
	
	
	public static <T> java.lang.Class toNativeEnum(java.lang.Class cl)
	{
		//line 93 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return cl;
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_Int(int[] _native)
	{
		//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 114 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_Float(double[] _native)
	{
		//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 118 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_Bool(boolean[] _native)
	{
		//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 122 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_java_Int8(byte[] _native)
	{
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 126 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_java_Int16(short[] _native)
	{
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 130 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_java_Char16(char[] _native)
	{
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 134 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_Single(float[] _native)
	{
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 138 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static haxe.root.Array<java.lang.Object> array_haxe_Int64(long[] _native)
	{
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		java.lang.Object[] ret = new java.lang.Object[_native.length];
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		{
			//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g = 0;
			//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			int _g1 = _native.length;
			//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
			while (( _g < _g1 ))
			{
				//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				int i = _g++;
				//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
				ret[i] = _native[i];
			}
			
		}
		
		//line 142 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Array.ofNative(((java.lang.Object[]) (ret) ))) )) );
	}
	
	
	public static <T> haxe.root.Array<T> arrayAlloc(int size)
	{
		//line 149 "C:\\HaxeToolkit\\haxe\\std\\java\\Lib.hx"
		return ((haxe.root.Array<T>) (((haxe.root.Array) (haxe.root.Array.alloc(((int) (size) ))) )) );
	}
	
	
}

