// Generated by Haxe 4.1.3
package haxe.ds._ObjectMap;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class ObjectMapValueIterator<K, T> extends haxe.lang.HxObject
{
	public ObjectMapValueIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ObjectMapValueIterator(haxe.ds.ObjectMap<K, T> m)
	{
		//line 515 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		haxe.ds._ObjectMap.ObjectMapValueIterator.__hx_ctor_haxe_ds__ObjectMap_ObjectMapValueIterator(((haxe.ds._ObjectMap.ObjectMapValueIterator<K, T>) (this) ), ((haxe.ds.ObjectMap<K, T>) (m) ));
		//line 515 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	public static <K_c, T_c> void __hx_ctor_haxe_ds__ObjectMap_ObjectMapValueIterator(haxe.ds._ObjectMap.ObjectMapValueIterator<K_c, T_c> __hx_this, haxe.ds.ObjectMap<K_c, T_c> m)
	{
		//line 516 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		__hx_this.i = 0;
		//line 517 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		__hx_this.m = m;
		//line 518 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		__hx_this.len = m.nBuckets;
	}
	
	
	public haxe.ds.ObjectMap<K, T> m;
	
	public int i;
	
	public int len;
	
	public final boolean hasNext()
	{
		//line 522 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 522 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			int _g = this.i;
			//line 522 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			int _g1 = this.len;
			//line 522 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			while (( _g < _g1 ))
			{
				//line 522 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				int j = _g++;
				//line 523 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				if (( (( this.m.hashes[j] & -2 )) != 0 )) 
				{
					//line 524 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					this.i = j;
					//line 525 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
					return true;
				}
				
			}
			
		}
		
		//line 528 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		return false;
	}
	
	
	public final T next()
	{
		//line 532 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		T ret = this.m.vals[this.i];
		//line 533 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		this.i += 1;
		//line 534 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		return ret;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (( field != null )) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				switch (field.hashCode())
				{
					case 107029:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("len")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							this.len = ((int) (value) );
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return value;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("i")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							this.i = ((int) (value) );
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return value;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (( field != null )) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				switch (field.hashCode())
				{
					case 107029:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("len")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							this.len = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return value;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 109:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("m")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							this.m = ((haxe.ds.ObjectMap<K, T>) (value) );
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return value;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("i")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							this.i = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return value;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (( field != null )) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("next")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 109:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("m")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return this.m;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("hasNext")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("i")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return this.i;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 107029:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("len")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return this.len;
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (( field != null )) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				switch (field.hashCode())
				{
					case 107029:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("len")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return ((double) (this.len) );
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 105:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("i")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return ((double) (this.i) );
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		{
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			boolean __temp_executeDef1 = true;
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (( field != null )) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				switch (field.hashCode())
				{
					case 3377907:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("next")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return this.next();
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
					case 696759469:
					{
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						if (field.equals("hasNext")) 
						{
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							__temp_executeDef1 = false;
							//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
							return this.hasNext();
						}
						
						//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
			if (__temp_executeDef1) 
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		baseArr.push("len");
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		baseArr.push("i");
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		baseArr.push("m");
		//line 510 "C:\\HaxeToolkit\\haxe\\std\\java\\_std\\haxe\\ds\\ObjectMap.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


