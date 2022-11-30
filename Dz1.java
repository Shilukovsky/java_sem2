
import java.util.HashMap;
import java.util.Map;

public class Dz1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Russia");
        map.put("city", "Moscow");
        map.put("age", null);
       
        System.out.println(getQuery(map));
    }

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder result = new StringBuilder("");
        
        for (Map.Entry<String, String> pair: params.entrySet()){
        try{
        if (!pair.getValue().equals(null)){
        if(result.toString().length() > 1) {
        result.append(" and ");
        }
        result.append(pair.getKey() + " = \'")
        .append(pair.getValue() + "\'");
        }
        }catch (NullPointerException e){}
        }
        return result;
    }
}
