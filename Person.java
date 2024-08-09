public class Person {
    
    int age = 16;
    String name = "Keyaan";
    public void older() {
        age++;
    }

    public void younger() {
        age--;
    }

    public void print(){
        System.out.println(name +": " + age);
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setAgeName(String name, int newAge) {
        age = newAge;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}


