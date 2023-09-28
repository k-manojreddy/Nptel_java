import java.io.*;

public class EX35 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile f = null;
        try {
            f = new RandomAccessFile("C:\\Users\\kmred\\OneDrive\\Desktop\\IOtest.txt", "r");
            long fileLength = f.length();
            if (fileLength == 0) {
                System.out.println("File is empty");
            } else {
                f.seek(fileLength);
                int a;
                while ((a = f.read()) != -1) {
                    System.out.print((char) a);
                }
            }
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    // log the exception or handle it
                }
            }
        }
    }
}
