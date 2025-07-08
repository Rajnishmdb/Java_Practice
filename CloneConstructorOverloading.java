package sample;
class Figure{
	double width;
	double height;
	double depth;
	Figure(Figure ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	Figure(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	Figure(double len){
		width = height = depth = len;
	}
 double volume(){
	return width*height*depth;
}
}
public class CloneConstructorOverloading {

	public static void main(String[] args) {
	   Figure cuboid = new Figure(10,2,5);
	   Figure cuboidclone = new Figure(15,2,2);
	   Figure cube = new Figure(15);
	   double vol;
       vol = cuboid.volume();
       System.out.println("volume of cuboid = "+vol);
       vol = cuboidclone.volume();
       System.out.println("volume of cuboidclone = "+vol);
       vol = cube.volume();
       System.out.println("volume of cube "+vol);
	}

}
