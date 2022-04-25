package ss16_io_text_file.BaiTap;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream=new FileInputStream(new File("D:\\[C0222G2]-Tri-tran-thanh\\module2\\p_module2\\src\\ss16_io_text_file\\BaiTap\\copyFile.txt"));
            outputStream= new FileOutputStream(new File("D:\\[C0222G2]-Tri-tran-thanh\\module2\\p_module2\\src\\ss16_io_text_file\\BaiTap\\copyFile1.txt"));
            int length;
            byte[] buffer = new byte[1024];
            while ((length=inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
                System.out.println("File is copied successful!");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
