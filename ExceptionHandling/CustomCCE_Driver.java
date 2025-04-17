class CustomClassCastException extends RuntimeException
{
	public CustomClassCastException()
	{
		super("Object cannot be casted to StringBuffer");
	}
	public CustomClassCastException(String desc)
	{
		super(desc);
	}
}

class CustomCCE_Driver
{
	public static void main(String[] args) 
	{
		Object obj = new StringBuffer("hello");
		// Object obj = new String("hello"); Compiletime Exception CustomClassCastException
		StringBuffer sb = castObject(obj);
		System.out.println(sb);
	}

	public static StringBuffer castObject(Object obj)
	{
		StringBuffer sb = null;
		if(!(obj instanceof StringBuffer))
		{
			throw new CustomClassCastException("Object cannot be casted to StringBuffer");
		}
		else
		{
			sb = (StringBuffer)obj;
		}
		return sb;
	}
}