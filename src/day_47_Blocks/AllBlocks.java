package day_47_Blocks;

public class AllBlocks {

	int nonStaticInt = 10;
	static int staticInt = 10;

	static {
		System.out.println("STATIC BLOCK - i run first and only once");
		staticInt--;
	}

	{
		System.out.println("INIT BLOCK - I run each time when object is created. Before constructor");
		nonStaticInt += 5;
		staticInt += 5;
	}

	public AllBlocks() {
		System.out.println("CONSTRUCTER - I run each time when object is created. After init block");
		nonStaticInt += 3;
		staticInt += 3;

	}

}
