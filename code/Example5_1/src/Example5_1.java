class People{ // define the human class
	int hand = 2, leg = 2;  // Number of hands,feet
	int age; // age , The initial value is 0
	void speak() { // Export personal information
		System.out.print("\n" + age + "岁，有"
	+ hand + "只手，"+leg+"只脚");
	}
}

class Student extends People{ 
// Define the student class, which is a subclass of human
	int number; // Adds the subclass`s own member variable, student number
	void showmessage() {// Display student`s personal information
		speak();
		// Invoke a method inherited from the parent class
		System.out.print("  number:" + number);
	}
	
	int add(int a, int b) {// Subclass new method:Do addition
		return a+b;
	}
}

//Define the undergraduate class,which is a subclass of student
class UniverStudent extends Student{
	int multi(int a,int b) {// Subclass new method:Do multiplication
		return a*b;
	}
}

public class Example5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People p1 = new People(); // Create a person object
		p1.age = 19;
		p1.speak();
		
		Student huang = new Student(); //Create a Student object
		huang.age = 10;
		huang.number = 9527;
		huang.showmessage();
		int a=2,b=5;
		int sum = huang.add(a, b);
		System.out.println("    Can add:"+sum);
	}

}
