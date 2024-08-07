import java.util.ArrayList;
public class operator_test {
public static void main(String[] args) {
    ArrayList<Integer> x = new ArrayList<Integer>();
    x.add(2);
    x.add(3);
    x.add(5);
    x.add(7);
    x.add(11);
    x.add(13);
    x.add(17);
    int y = 4;
    y--;
    for(int i=0; i<=6; i++) {
    int z = (x.get(i)+y)%5;
    System.out.println(z);
    }

}
}
