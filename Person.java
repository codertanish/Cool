public class Person {
    
    int age = 16;
    String name = "Bob";
    public void older() {
        age++;
    }

    public void younger() {
        age--;
    }

    public void print(){
        System.out.println(age);
        System.out.println(name);
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setAgeName(String name, int newAge) {
        age = newAge;
        name = this.name;
    }

    public int getAge() {
        return age;
    }
}


