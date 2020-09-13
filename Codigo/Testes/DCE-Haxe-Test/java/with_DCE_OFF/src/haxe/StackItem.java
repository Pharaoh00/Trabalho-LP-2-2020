// Generated by Haxe 4.1.3
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StackItem extends haxe.lang.ParamEnum
{
	public StackItem(int index, java.lang.Object[] params)
	{
		//line 240 "C:\\HaxeToolkit\\haxe\\std\\java\\internal\\HxObject.hx"
		super(index, params);
	}
	
	
	public static final java.lang.String[] __hx_constructs = new java.lang.String[]{"CFunction", "Module", "FilePos", "Method", "LocalFunction"};
	
	public static final haxe.StackItem CFunction = new haxe.StackItem(0, null);
	
	public static haxe.StackItem Module(java.lang.String m)
	{
		//line 30 "C:\\HaxeToolkit\\haxe\\std\\haxe\\CallStack.hx"
		return new haxe.StackItem(1, new java.lang.Object[]{m});
	}
	
	
	public static haxe.StackItem FilePos(haxe.StackItem s, java.lang.String file, int line, java.lang.Object column)
	{
		//line 31 "C:\\HaxeToolkit\\haxe\\std\\haxe\\CallStack.hx"
		return new haxe.StackItem(2, new java.lang.Object[]{s, file, line, column});
	}
	
	
	public static haxe.StackItem Method(java.lang.String classname, java.lang.String method)
	{
		//line 32 "C:\\HaxeToolkit\\haxe\\std\\haxe\\CallStack.hx"
		return new haxe.StackItem(3, new java.lang.Object[]{classname, method});
	}
	
	
	public static haxe.StackItem LocalFunction(java.lang.Object v)
	{
		//line 33 "C:\\HaxeToolkit\\haxe\\std\\haxe\\CallStack.hx"
		return new haxe.StackItem(4, new java.lang.Object[]{v});
	}
	
	
	@Override public java.lang.String getTag()
	{
		//line 28 "C:\\HaxeToolkit\\haxe\\std\\haxe\\CallStack.hx"
		return haxe.StackItem.__hx_constructs[this.index];
	}
	
	
}


