package sample;
class Father{
	void height()
	{
		System.out.println("\t Taller in height.");
	}
}
class Son extends Father{
	void body() {
		System.out.println("\t Body is fat.");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("\tPersonality of son:-");
        s.height();
        s.body();
	}

}
