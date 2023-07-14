package coreJavaassignment;


public class Person {
	private String name;
	private int age;
	private String address;
      
	static int count;
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		count++;
	}
	static void count()
	{
		System.out.println("Total "+Person.count+" no of persons");
	}
	Person(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
