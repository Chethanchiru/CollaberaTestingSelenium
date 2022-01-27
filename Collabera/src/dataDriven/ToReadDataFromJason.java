package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ToReadDataFromJason {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		FileReader fr=new FileReader("./testResources/testData.json");

		JSONParser parser= new JSONParser();

		//System.out.println(parser.parse(fr));// {"FavoriteFood":"Green Peas rice Bath","Mobile":"I Phone 13 pro max","Cost":80000}

		JSONObject jsonObj = (JSONObject)parser.parse(fr);

		String data = jsonObj.get("FavoriteFood").toString();
		System.out.println(data);
	}

}
