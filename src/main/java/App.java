import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static int st;

    public static void main(String[] args) throws FileNotFoundException {

        SoftRef soft = new SoftRef();
        soft.loadImage();


       // 1) java.lang.OutOfMemoryError: Java heap space
       /*
        int[] arr = new int[1000000000];
       System.out.println(arr.length);
       */

        // java.lang.OutOfMemoryError: Java heap space
        /*
       List<Integer> list = new ArrayList<Integer>();
       for (int k=0; k<1000000; k++) {
           list.add(k);
           System.out.println(k);
       }
        */

        // java.lang.OutOfMemoryError: Java heap space
        /*
        List<Depart> list = new ArrayList<Depart>();
        for (int k=0; k<10000000; k++) {
            list.add(new Depart( Integer.toString(k) ) );
            System.out.println(k);
        }
        */
        // java.lang.StackOverflowError   классы создают сами себя
        // 5) ?
        //One one = new One("dddddd");

        st = 0;
        //4) for Exception  java.lang.StackOverflowError    RECURSIVE
        /*
        fact(20);
        //or
        recursionFucn();
        */




     /*  оставляем не закрытые стримы
//        String path = "d:/D/Install/EXPDAT.dmp";
        String path = "d:/D/Install/sqldeveloper.7z";
        try {
            File file = new File(path);
            long len = 0;
            System.out.println("File length "+file.length());
            for (int j = 0; j < 10000; j++) {
                BufferedInputStream str = new BufferedInputStream(new FileInputStream(file));
                int i = 0;
                while ((len = str.read()) != -1) {
                    i++;
                }
                System.out.println(j+" "+i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    public static void f1(Depart dep, int i) {
        dep.setName("fffffffffffffffffffffff");
        i = 2;
        System.out.println("2 "+dep + " " + i);
    }

    public static void recursionFucn() {
        st ++;
        System.out.println("recursionFucn "+st);
        int i = 22222;
        recursionFucn();
    }

    public static long fact(int n) {
        st ++;
        System.out.println("facy "+st);
        return n < 2 ? 1 : n * fact(n - 1);
    }

}
