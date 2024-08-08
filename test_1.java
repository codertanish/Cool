public class test_1 {

   
    public static class Person {
        
        int age = 16;

       
        public void printAge() {
            System.out.println(age);
        }
;
        
        public void makeOlder() {
            age += 1;
        }

        
        public void makeYounger() {
            age -= 1;
        }
    }

    
    public static void main(String[] args) {
       
        Person person = new Person();

       
        person.printAge();

        
        person.makeOlder();

       
        person.printAge();
    }
}