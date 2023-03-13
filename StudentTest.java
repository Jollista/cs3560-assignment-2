public class StudentTest 
{
	public static void main(String[] args)	
	{
		//create john
		Student john = new Student("John", "CS", 3.5);
		
		//create and initialize mary ann
		Student maryAnn = new Student();
		maryAnn.setName("Mary Ann");
		maryAnn.setMajor("CE");
		maryAnn.setGpa(3.3);

		//print students
		//automatically calls toString()
		System.out.println(john);
		System.out.println(maryAnn);
	}
}
