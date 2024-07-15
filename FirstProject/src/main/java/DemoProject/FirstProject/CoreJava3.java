package DemoProject.FirstProject;

public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string literal 
      // String S1 = "Gayatri Eknath Kshirsagar";
       //String S2 = "Gayatri Eknath Kshirsagar";
       String S3 = "Hello";
       
       // New 
       String S4 = new String ("Welcome");
       String S5 = new String ("Welcome");
       
       String S6 = "Gayatri Eknath Kshirsagar";
       
       String[] SplittedString = S6.split(" ");
       System.out.println(SplittedString[0]);
       System.out.println(SplittedString[1]);
       System.out.println(SplittedString[2]);
       
       System.out.println(SplittedString[1].trim());
       
       for (int i =0; i<S6.length(); i++)
       {
    	   System.out.println(S6.charAt(i));
       }
		
		for (int i=S6.length() - 1; i>=0; i--)
		{  System.out.println(S6.charAt(i));
		
	}
	}
}
