class Person {
    public Person() {
         name = "Not named";
         birthdayYear = 1999; // by default
    }

    public Person(String givenName, int yearOfBirth) {
         name = givenName;
         birthdayYear = yearOfBirth;
    }

     public String getName() {
         return name;
     }

     public String changeName(String n) {
         String temp;
         this.name = n;
       temp = this.name;
       return temp;
    }

    public int getAgeInYears(int currentYear) {
       return currentYear - birthdayYear;
     }
 
    private String name;
    private int birthdayYear;

    public static void main(String[] args) {
         Person a = new Person();
         Person b = new Person("Huq Ahnaf", 1956);
         String name = a.changeName("Huq");
         System.out.println("Physicist " + name + " makes big " + "discovery");
         System.out.println(b.getName() + " was " + b.getAgeInYears(2020) + " in 2020, in May. ");
     }
}
