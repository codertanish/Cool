public class conditional_test {
public static void main(String[] args) {
    double x = Math.random()*100;
    System.out.println("Intial Value: " + x);
    if(x<100) {
        x+=50;
    }
    if(x>100) {
        x/=20;
    }
    System.out.println("Final Value: " + x);
}
}
