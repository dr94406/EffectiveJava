package main.com.effectivejava.item9;

import java.io.*;


public class Tryfinally {


    private static final byte BUFFER_SIZE =  127;

    static String firstLineOfFile(String path, String defaultVal) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
        return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}