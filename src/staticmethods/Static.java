package staticmethods;

public class Static {
	
	double radius;
	
	static int numberofobjects =0;
	
	Static(){
		radius = 1;
		numberofobjects++;
	}
	
	Static(double newradius){
		
		radius = newradius;
		numberofobjects++;
	}
	
	static int getnumberofobjects() {
		return numberofobjects;
		
	}
	
	double getArea() {
		return radius*radius*Math.PI;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("before creating the object");
  System.out.println("number of circle object is" + Static.getnumberofobjects());// with out creating an object for var numberofobjects we just use it cause its static var
  
  Static c1 = new Static ();
  System.out.println("\n after creating c1");
  System.out.println("c1: radius ("+ c1.radius +") and no. of circle objects (" + Static.getnumberofobjects() +")");
  
  
  Static c2 = new Static(5);
  
 c1.radius = 9;// cause its not static var the change maded in c2 doesnt affect the c1
 
 System.out.println("\n after creating c2 and modify c1");
 System.out.println("c1: radius ("+ c1.radius +") and no. of circle objects (" + Static.getnumberofobjects() +")");
 System.out.println("c2: radius ("+ c2.radius +") and no. of circle objects (" + Static.getnumberofobjects() +")");

  
	}

}
