import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {

        byte[] data = {0, 10, 30, 100, 6, 12, 11};

        int val;
        ByteArrayInputStream is = new ByteArrayInputStream(data);
        while((val = is.read()) >= 0) {
            byte dataByte = (byte)val;
            //System.out.println(dataByte);
        }

        is.reset();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        while((val = is.read()) >= 0) {
            byte dataByte = (byte)val;
            os.write(dataByte);
        }

        byte[] dataNew = os.toByteArray();
        for(byte datax: dataNew){
            System.out.println(datax);
        }
    }

}
