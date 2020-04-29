package ku.opensrcsw._MidTerm;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parse{
	public static void main(String[] args) throws ParseException {
		JSONAdd jsonAdd = new JSONAdd();
		jsonAdd.jsonadd();

		JSONParser parser = new JSONParser();

		JSONObject obj = (JSONObject)parser.parse(jsonAdd.json);
        System.out.println(obj.toJSONString());
		JSONObject poem = (JSONObject)obj.get("poem");
        System.out.println(poem.toJSONString());
		String item1 = (String)poem.get("What is this life if, full of care,");
		String item2 = (String)poem.get("We have no time to stand and stare.");
		String item3 = (String)poem.get("No time to stand beneath the boughs");
		String item4 = (String)poem.get("And stare as long as sheep or cows.");
		String item5 = (String)poem.get("No time to see, when woods we pass,");
		String item6 = (String)poem.get("Where squirrels hide their nuts in grass.");
		String item7 = (String)poem.get("No time to see, in broad day light,");
		String item8 = (String)poem.get("Streams full of stars, like skies at night.");
		String item9 = (String)poem.get("No time to turn at beauty's glance,");
		String item10 = (String)poem.get("And watch her feet, how they can dance.");
		String item11 = (String)poem.get("No time to wait till her mouth can");
		String item12 = (String)poem.get("Enrich that smile her eyes began.");
		String item13 = (String)poem.get("A poor life this if, full of care,");
		String item14 = (String)poem.get("We have no time to stand and stare.");
		
		
		

		System.out.println("What is this life if, full of care : "+item1);
		System.out.println("We have no time to stand and stare. : "+item2);
		System.out.println("No time to stand beneath the boughs : "+item3);
		System.out.println("And stare as long as sheep or cows. : "+item4);
		System.out.println("No time to see, when woods we pass, : "+item5);
		System.out.println("Where squirrels hide their nuts in grass. : "+item6);
		System.out.println("No time to see, in broad day light, : "+item7);
		System.out.println("Streams full of stars, like skies at night. : "+item8);
		System.out.println("No time to turn at beauty's glance, : "+item9);
		System.out.println("And watch her feet, how they can dance. : "+item10);
		System.out.println("No time to wait till her mouth can : "+item11);
		System.out.println("Enrich that smile her eyes began. : "+item12);
		System.out.println("A poor life this if, full of care, : "+item13);
		System.out.println("We have no time to stand and stare. : "+item14);
		
		
	}
}
