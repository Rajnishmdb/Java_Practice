package sample;

//multilevel inheritance example java program

class students
{
        private int RegNo;
        private String sname;
        public void setstud(int no,String name)
        {
        	    RegNo = no;
                sname = name;
        }
        public void printstud()
        {
                System.out.println("Student RegNo : " + RegNo);
                System.out.println("Student Name : " + sname);
        }
}
class marks extends students
{
        protected int mark1,mark2;
        public void setmarks(int m1,int m2)
        {
                mark1 = m1;
                mark2 = m2;
        }
        public void printmarks()
        {
                System.out.println("Mark1 : " + mark1);
                System.out.println("Mark2 : " + mark2);
        }
}
class finaltotle extends marks
{
        private int total;
        public void calc()
        {
                total = mark1 + mark2;
        }
        public void printtotal()
        {
                System.out.println("Total : " + total);
        }
        
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		 finaltotle f = new finaltotle();
                f.setstud(006,"Rajnish Ranjan");
                f.setmarks(78,89);
                f.calc();
                f.printstud();
                f.printmarks();
                f.printtotal();
        }
       
	}


