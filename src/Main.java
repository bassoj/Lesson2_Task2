import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;

class Main {

    public static void main(String[] args)  {

        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader("D:\\PROG KIEV UA\\LESSON 2\\Task 2\\json.txt"));
            Person person = gson.fromJson(reader, Person.class);
            System.out.println(person.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
