import java.io.*;

        BufferedReader i = new BufferedReader (new InputStreamReader(System.in));

        PrintWriter o = new PrintWriter(System.out);

        if (text.matches("[^a-zA-ZñÑ]*\\Z")) text = "";

        l2 = text.replaceAll("[^a-zA-ZñÑ]*[a-zA-ZñÑ]+[^a-zA-ZñÑ]*","w");
        lb = text.replaceAll("[^a-zA-ZñÑ]*[a-zA-ZñÑ]+[^a-zA-ZñÑ]*","$0 --- ");

        o.println("l2: " + l2); 
        o.println("lb: " + lb);
        o.println("Words: " + l2.length());
        o.close();
   }
