import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;

public class SoftRef {
    private static final String imageName = "d:/Eclipce1.jpg";
    private InputStream defaultImage;

    public void loadImage () {
        List<SoftReference<String>> listString = new ArrayList<SoftReference<String>>();
//        List<String> listString = new ArrayList<String>();
        int k = 0;
        for (int i=0; i<10000000; i++) {
            k++;
//            String str = "SSgggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"+i;
            SoftReference<String> str = new SoftReference("SSgggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"+i);
            listString.add(str);
            System.out.println(k);
        }
        /*
        if (defaultImage == null) {
            defaultImage = this.getClass().getResourceAsStream(imageName);
        }
        */
       // return defaultImage;
    }

}





