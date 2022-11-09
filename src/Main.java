import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer>jup = new ArrayList<>();
        ArrayList<Integer>tak = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(rd.nextInt(1,100));
        }
        for (int a:arrayList
             )if (a%2==0){
            jup.add(a);
        }else tak.add(a);
        System.out.println(arrayList);
        System.out.println(jup);
        System.out.println(tak);
    }
}