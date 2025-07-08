package sample;
class Father2{
	void height()
	{
		System.out.println("\t Taller in height.");
	}
}
class Son2 extends Father2{
	void body()
	{
		System.out.println("\t Son is fat.");
	}
	
}
class Doughter extends Father2{
	void body() 
	{
		System.out.println("\t Daughter is slim.");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Son2 s = new Son2();
		System.out.println("Personality of Son:-");
        s.height();
        s.body();
        Doughter d = new Doughter();
		System.out.println("Personality of Daughter:-");
        d.height();
        d.body();

	}

}
