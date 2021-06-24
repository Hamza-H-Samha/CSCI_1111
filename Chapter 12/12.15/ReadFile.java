import java.util.*;
import java.io.*;
public class ReadFile {
          public static void main(String[] args) throws Exception {

            File createFile = new File("Exercise12_15.txt");
            if (createFile.exists()){
                          System.out.println("This FIle already exists");
                          System.exit(0);





            }
            try (
            PrintWriter output = new PrintWriter(createFile);



            ) {
              for (int i = 0; i<100; i++){
                output.print(((int)(Math.random() * 500) + 1));
                output.print(" ");





              }





            }

            ArrayList<Integer> list = new ArrayList<>();
            try (

            Scanner k = new Scanner(createFile);





            ) {

              while(k.hasNext()){
                list.add(k.nextInt());


              }
              Collections.sort(list);


              System.out.print(list.toString()+"\n");


            }




          }















}
