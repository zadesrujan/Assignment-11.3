package eh;
//here we cretaed package as eh which that organizes a set of related classes and interfaces.
public class ExceptionDemo {
	//public keyword is used in the declaration of a class.
		//class defines instance and class fields,methods and inner classes.

		//created class name as ExceptionDemo
		
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		//String[] args is actually an array of java.lang.String type and it's name is args here
		
		// TODO Auto-generated method stub
		void dosomething()
		//in main method we have another method doSomething
		{
			int s1=96,s2=84;
			//Initializing the variables
			int sum=s1+s2;
			//performs addition
			System.out.println("sum:"+sum);
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			
		void doMore()//one more method doMore
		{
			int div=97,divi=0
					;//division with zero
			int divide=div/divi;
			System.out.println("the output is:"+divide);
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			//now it shows error in line 
		}
	}
	}
}