package zavdannya1;

import java.io.*;

public class app8 {
    public static void main(String[] args) {

BufferedWriter bw= null;
BufferedReader br ;
        try { bw = new BufferedWriter(new FileWriter("notes1.txt"));
              br = new BufferedReader(new InputStreamReader(System.in));

            String line="Привіт, мене звати " +br.readLine()+ ",дуже приємно познайомитись";
           { bw.write(line);}

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {
            try { bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } }}










