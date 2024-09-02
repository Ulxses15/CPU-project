import java.util.Scanner;

public class CPU {
    public static void main(String[] args) throws Exception {
		Scanner scnr = new Scanner(System.in);
		
		Processor brand = new Processor();
		
		System.out.println("Enter CPU brand");
		String CPUtype = scnr.next();
		brand.setName(CPUtype);
		
		System.out.println("Enter model number (ex. 3600)");
		int CPUmodel = scnr.nextInt();
		brand.setModel(CPUmodel);
		
		System.out.println("CPU Brand: " + brand.getName());
		System.out.println("CPU Model: " + brand.getModel());
		System.out.println("Helo world!");
        
	}
}

class Processor {
	private String name;
	private int model;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getModel() {
		return model;
	}
	
	public void setModel(int model) {
		if (model > 0) {
			this.model = model;
		}
		else {
			System.out.println("Enter a valid model number");
		}
	}
}

