package selenium.serialization;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class JSONParse {


    public static void main(String[] args) throws IOException, ParseException {

        JSONObject obj = new JSONObject();
        obj.put("firstName", "John");

        Map map = new LinkedHashMap();
        map.put("streetAddress", "21 2nd Street");
        obj.put("address", map);

        JSONArray jsonArray = new JSONArray();
        map = new LinkedHashMap();
        map.put("type", "home");
        map.put("number", "212 555-1234");
        obj.put("phoneNumbers", map);

        PrintWriter pw = new PrintWriter("mydata.json");
        pw.write(obj.toString());

        pw.flush();
        pw.close();


        FileReader fr =  new FileReader("mydata.json");

        JSONParser jsonParser = new JSONParser();

        Object obj1 = jsonParser.parse(fr);

        JSONObject obj2 = (JSONObject) obj1;

        System.out.println((String)obj2.get("firstName"));


        map = (Map) obj2.get("address");

        Set set = map.entrySet();

        Iterator<Map.Entry> itr = set.iterator();

        while(itr.hasNext()){

            Map.Entry myentry= itr.next();

            System.out.println(myentry.getKey());
            System.out.println(myentry.getValue());
        }








    }


    /*

    {
    "firstName": "John",
    "address": {
        "streetAddress": "21 2nd Street",

    },
    "phoneNumbers": [
        {
            "type": "home",
            "number": "212 555-1234"
        },

    ]
}


     */
}
