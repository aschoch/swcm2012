import java.io.*;

        BufferedReader i = new BufferedReader (new InputStreamReader(System.in));

        PrintWriter o = new PrintWriter(System.out);

        if (text.matches("[^a-zA-ZñÑ]*\\Z")) text = "";

        l1 = text.replaceAll("([^a-zA-ZñÑ]*[a-zA-ZñÑ]+)[^\\x2E]*([\\x2E]+|\\Z)","p");
        la = text.replaceAll("([^a-zA-ZñÑ]*[a-zA-ZñÑ]+)[^\\x2E]*([\\x2E]+|\\Z)","$0 --- ");
        laa = text.replaceAll("([^a-zA-ZñÑ]*[a-zA-ZñÑ]+)[^\\x2E]*([\\x2E]+|\\Z)","$1 --- ");

        l2 = text.replaceAll("[^a-zA-ZñÑ]*[a-zA-ZñÑ]+[^a-zA-ZñÑ]*","w");
        lb = text.replaceAll("[^a-zA-ZñÑ]*[a-zA-ZñÑ]+[^a-zA-ZñÑ]*","$0 --- ");
        o.println("l1: " + l1);
        o.println("la: " + la);
        o.println("laa: " + laa);
        o.println("Phrases: " + l1.length());
        o.println("l2: " + l2); 
        o.println("lb: " + lb);
        o.println("Words: " + l2.length());
        o.close();
   }
