import java.net.*;
import java.util.*;
import com.google.gson.Gson;
import skilstak.c;
import java.io.*;

public class fooget {
    public static void main(String[] args) throws IOException {
          
        URL url = new URL("http://pokeapi.co/api/v1/pokemon/" + args[0]);
        URLConnection conn = url.openConnection();
        Map data = new Gson().fromJson(new InputStreamReader(conn.getInputStream()), Map.class);
        //System.out.println(data); 
        System.out.println(c.b + args[0] + "'s " + args[1] + " is/are " + c.x); 
        String before = data.get(args[1]).toString();
        for(int i=1, i < before.length(), i++){
            if before.charAt(i);
        }
    }


}
