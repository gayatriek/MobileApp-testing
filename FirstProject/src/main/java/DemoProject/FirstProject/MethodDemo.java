package DemoProject.FirstProject;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MethodDemo d = new MethodDemo();
        d.Getdata();
        
        String name =d.Getdata1();
        System.out.println(name);
        
        MethodDemo1  d1 = new MethodDemo1();
        String Surname =d1.Getdata1();
        System.out.println(Surname);
        
        Getdata2();
        
        
	}
	
	
	public void Getdata(){
		
		System.out.println("Hello world");
		
	}
	public String Getdata1() {
		
		System.out.println("Gayatri");
		return "name";
	}
    
    public static void Getdata2() {
		
		System.out.println("Eknath");
		
	}

	
}
