package Com.brigelabz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Person {
private String name;
private int age;
private static  int budget;

	public Person(String name, int age, int budget) {
	super();
	this.name = name;
	this.age = age;
	this.budget = budget;
}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}

	public static void main(String[] args) {
	Person [] p1=new Person[3];	
	p1[0]=new Person("Jhon",21,23000);
	p1[1]=new Person("Steve",32,40000);
    p1[2]=new Person("Martin",16,2700);
System.out.println(Arrays.toString(p1));
int totalBudget=0;
for(int i =0;i<p1.length;i++) {
	totalBudget+=p1[i].getBudget();
}
System.out.println(totalBudget);
System.out.println("Using ArrayList TotalBudget is ");
List<Person> list=new ArrayList<Person>(Arrays.asList(p1));
int totalBudget1=list.stream().map(e->e.budget).reduce(0,(sum,budgt)->sum+budget);	
System.out.println(totalBudget1);
	}

}
