package ku.opensrcsw._MidTerm;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JSONAdd {
	String json;
	void jsonadd(){
			JSONObject inner = new JSONObject(); 
			inner.put("item1", "What is this life if, full of care,"); 
			inner.put("item2", "We have no time to stand and stare.");
			inner.put("item3", "No time to stand beneath the boughs");
			inner.put("item4", "And stare as long as sheep or cows.");
			inner.put("item5", "No time to see, when woods we pass,");
			inner.put("item6", "Where squirrels hide their nuts in grass.");
			inner.put("item7", "No time to see, in broad day light,");
			inner.put("item8", "Streams full of stars, like skies at night.");
			inner.put("item9", "No time to turn at beauty's glance,");
			inner.put("item10", "And watch her feet, how they can dance.");
			inner.put("item11", "No time to wait till her mouth can");
			inner.put("item12", "Enrich that smile her eyes began.");
			inner.put("item13", "A poor life this if, full of care,");
			inner.put("item14", "We have no time to stand and stare.");
		
			JSONObject outer = new JSONObject();
			outer.put("poem", inner);
			
			json = outer.toJSONString();
			System.out.println(json);
		}
	}



		
    
  


