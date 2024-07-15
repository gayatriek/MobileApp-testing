package DemoProject.FirstProject;

public class CoreJava1 {
	
	public static void main(String[] args) {
		
		int myNum = 5;
		String Name = "GAYATRI KSHIRSAGAR";
		char letter = 'G';
		double dec = 2.11;
		boolean myCard = true;
		
		System.out.println(myNum + " is the value stored in myNum variable");
		
		//Arrays
		
		int[] arr1 = new int[5];
		arr1[0] = 2;
		arr1[1] = 4;
		arr1[2] = 6;
		arr1[3] = 8;
		arr1[4] = 10;
		
		int[] arr2 = {2,4,6,8,10,14,16,18,19,56};
		
		System.out.println(arr2[4]);
		System.out.println(arr1[4]);
		
		//for loop 
		
		for (int i=0; i<arr1.length; i++)
		{  
			System.out.println(arr1[i]);
		}
		for (int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name= { "gayatri", "kshirsagar", "loop", "java"};
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s:name)
		{
			System.out.println(s);
		}
	}

}
