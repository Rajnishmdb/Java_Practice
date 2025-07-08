package sample;
class GrandFather{
	void Behaviour()
	{
		System.out.println("\t Good behaviour .");
	}
}
class Father1 extends GrandFather{
	void height()
	{
		System.out.println("\t Taller in height.");
	}
}
class Son1 extends Father1{
	void body() {
		System.out.println("\t Body is fat.");
	}
}
public  class MultilevelInheritance1 {
	public static void main(String[] args) {
		Son1 s = new Son1();
		System.out.println("\tPersonality of son:-");
		s.Behaviour();
        s.height();
        s.body();
	}

}
