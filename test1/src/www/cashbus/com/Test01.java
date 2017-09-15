package www.cashbus.com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by PCc on 2017/9/15.
 */
public class Test01 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
    @Test
    public void test1() throws Exception {
//        File file=new File("aaa");
//        InputStream is = new FileInputStream(file);
        System.out.print(666);

    }
}
