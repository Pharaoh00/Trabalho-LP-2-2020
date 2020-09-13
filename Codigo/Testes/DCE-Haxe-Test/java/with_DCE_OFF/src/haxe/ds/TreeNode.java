// Generated by Haxe 4.1.3
package haxe.ds;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TreeNode<K, V> extends haxe.lang.HxObject
{
	public TreeNode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TreeNode(haxe.ds.TreeNode<K, V> l, K k, V v, haxe.ds.TreeNode<K, V> r, java.lang.Object h)
	{
		//line 252 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		haxe.ds.TreeNode.__hx_ctor_haxe_ds_TreeNode(((haxe.ds.TreeNode<K, V>) (this) ), ((haxe.ds.TreeNode<K, V>) (l) ), ((K) (k) ), ((V) (v) ), ((haxe.ds.TreeNode<K, V>) (r) ), ((java.lang.Object) (h) ));
		//line 252 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		java.lang.Object __temp_expr1 = ((java.lang.Object) (null) );
	}
	
	
	protected static <K_c, V_c> void __hx_ctor_haxe_ds_TreeNode(haxe.ds.TreeNode<K_c, V_c> __hx_this, haxe.ds.TreeNode<K_c, V_c> l, K_c k, V_c v, haxe.ds.TreeNode<K_c, V_c> r, java.lang.Object h)
	{
		//line 252 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		int h1 = ( (haxe.lang.Runtime.eq(h, null)) ? (-1) : (((int) (haxe.lang.Runtime.toInt(h)) )) );
		//line 253 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		__hx_this.left = l;
		//line 254 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		__hx_this.key = k;
		//line 255 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		__hx_this.value = v;
		//line 256 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		__hx_this.right = r;
		//line 257 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		if (( h1 == -1 )) 
		{
			//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			int tmp = 0;
			//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			haxe.ds.TreeNode<K_c, V_c> _this = __hx_this.left;
			//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			haxe.ds.TreeNode<K_c, V_c> _this1 = __hx_this.right;
			//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (( (( (( _this == null )) ? (0) : (_this._height) )) > (( (( _this1 == null )) ? (0) : (_this1._height) )) )) 
			{
				//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				haxe.ds.TreeNode<K_c, V_c> _this2 = __hx_this.left;
				//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				tmp = ( (( _this2 == null )) ? (0) : (_this2._height) );
			}
			else
			{
				//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				haxe.ds.TreeNode<K_c, V_c> _this3 = __hx_this.right;
				//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				tmp = ( (( _this3 == null )) ? (0) : (_this3._height) );
			}
			
			//line 258 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			__hx_this._height = ( tmp + 1 );
		}
		else
		{
			//line 260 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			__hx_this._height = h1;
		}
		
	}
	
	
	public haxe.ds.TreeNode<K, V> left;
	
	public haxe.ds.TreeNode<K, V> right;
	
	public K key;
	
	public V value;
	
	public int _height;
	
	@Override public java.lang.String toString()
	{
		//line 267 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		return ( ( (( (( this.left == null )) ? ("") : (( this.left.toString() + ", " )) )) + (( ( ( "" + haxe.root.Std.string(this.key) ) + "=" ) + haxe.root.Std.string(this.value) )) ) + (( (( this.right == null )) ? ("") : (( ", " + this.right.toString() )) )) );
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		{
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (( field != null )) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				switch (field.hashCode())
				{
					case 1487441478:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("_height")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this._height = ((int) (value) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 106079:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("key")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this.key = ((K) (((java.lang.Object) (value) )) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 111972721:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("value")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this.value = ((V) (((java.lang.Object) (value) )) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (value) ))) );
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		{
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (( field != null )) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				switch (field.hashCode())
				{
					case 1487441478:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("_height")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this._height = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 3317767:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("left")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this.left = ((haxe.ds.TreeNode<K, V>) (value) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 111972721:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("value")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this.value = ((V) (value) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 108511772:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("right")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this.right = ((haxe.ds.TreeNode<K, V>) (value) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 106079:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("key")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							this.key = ((K) (value) );
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		{
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (( field != null )) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("toString")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 3317767:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("left")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return this.left;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 1487441478:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("_height")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return this._height;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 108511772:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("right")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return this.right;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 111972721:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("value")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return this.value;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 106079:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("key")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return this.key;
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		{
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (( field != null )) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				switch (field.hashCode())
				{
					case 1487441478:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("_height")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return ((double) (this._height) );
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 106079:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("key")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (this.key) ))) );
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
					case 111972721:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("value")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return ((double) (haxe.lang.Runtime.toDouble(((java.lang.Object) (this.value) ))) );
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		{
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			boolean __temp_executeDef1 = true;
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (( field != null )) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				switch (field.hashCode())
				{
					case -1776922004:
					{
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						if (field.equals("toString")) 
						{
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							__temp_executeDef1 = false;
							//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
							return this.toString();
						}
						
						//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
			if (__temp_executeDef1) 
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		baseArr.push("_height");
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		baseArr.push("value");
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		baseArr.push("key");
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		baseArr.push("right");
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		baseArr.push("left");
		//line 244 "C:\\HaxeToolkit\\haxe\\std\\haxe\\ds\\BalancedTree.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


