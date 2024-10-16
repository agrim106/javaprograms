class ClassesDefine{
	public static void main(String [] args){
	Person Agrim = new Person("Agrim" , "male" , 22);
	Person Amarbir = new Person("Amar" , "male" , 22);
	System.out.println(Agrim);
	System.out.println(Amarbir);
	}
}
class Computer{
	String brand;
	String modelyear;
	double price;
	
}

class Person{
	String name;
	String gender;
	int age;

	Person(String name, String gender, int age){
	this.name = name;
	this.gender = gender;
	this.age = age;
	}
	@Override 
	public String toString(){
	return "person{name = '"+ name + "' , age " + age + ", gender = '"+ gender + "'}" ;
	}
}





