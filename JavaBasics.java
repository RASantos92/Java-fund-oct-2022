public class JavaBasics {
    public static void main(String[] args){
        System.out.println("Hello world");
        String firstName = "Bobby";
        String lastName = " Brown";
        System.out.println(firstName + " " +lastName);
        Integer age = 54;
        boolean isBald = true;
        double weight = 175.2378971236444;
        Integer test;
        char grade = 'F';
        System.out.println("Name: " + firstName + " " + lastName + "\n" +
                            "age: " + age+ "\n"+
                            "weight: " + weight + "\n" +
                            "grade: " + grade + " | is bald: " + isBald);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(age.MIN_VALUE);
        // test = 1;
        // System.out.println(test);

        if(weight < 100){
            System.out.println("you need to gain some weight");
        }  else {
            System.out.println("your fine");
        }

        System.out.println(weight < 100 ? "you need to gain some weight" : "your fine");

        String fullName = firstName.concat(lastName);
        System.out.println("full Name length: " + (fullName.length()));
        System.out.println("full name: " + fullName);

        String greeting = String.format("Hi %s, you are %d years old." , fullName, age);
        System.out.println(greeting);
        // System.out.printf("Hi %s, you are %d years old." , fullName, age);

        String firstName1 = "Martha";
        String firstName2 = new String("Martha");
        String firstName3 = "Martha";
        System.out.println(firstName1.equals(firstName2));
        System.out.println(firstName1 == firstName3);

    }
}