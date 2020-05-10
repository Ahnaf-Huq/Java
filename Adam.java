class Person {
	public Person() {
		System.out.println("This is a new man");
	}
	public Person(String givenName, int yearOfBirth) {
		System.out.println("Name got:"+givenName);
		System.out.println("Birth Year got:"+yearOfBirth);
		name = givenName;
		birthdayYear = yearOfBirth;
	}
	
	public String getName() {
		//System.out.println("Name got:"+name);
		return name;
	}
	public void changeName(String name) {
		this.name =name;
	}
	public int getAgeInYears(int currentYear) {
		return currentYear-birthdayYear;
	}
	private String name;
	private int birthdayYear;
	
}

class Adam {
	public static void main (String args[]){
		Person p1 = new Person();
		Person p2 = new Person("Nouman",1997);
		System.out.println(p2.getName());
		p2.changeName("Khan");
		System.out.println(p2.getName());
		System.out.println("Current Age: "+p2.getAgeInYears(2020));
	}
}
	