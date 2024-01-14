package MegaPredictor.Predictor;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class RoleScoreDetail {
	public int score;
	public String role_type;
	public JSONArray key_word;
	public String key_word_string;
	public double temp_score;
	public RoleScoreDetail(int score,String role_type,JSONArray keyword,String key_word_string) 
	{
		
		this.score=score;
		this.role_type=role_type;
		this.key_word=keyword;
		this.key_word_string=key_word_string;
		//this.temp_score=temp_score;
	}
	public int getScore() 
	{
		return score;
	}
	
	
}
