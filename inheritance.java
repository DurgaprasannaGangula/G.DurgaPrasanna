class Person
{
	String name;
	String addr;
	void show()
	{
		System.out.println("name:"+name);
		System.out.println("address:"+addr);
	}
}

class Emp extends Person{
	int id;
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("addr:"+addr);
	}
}

class Main
{
	public static void main(String[] args)
	{
		Emp empobj=new Emp();
		empobj.display();
	}
}
	