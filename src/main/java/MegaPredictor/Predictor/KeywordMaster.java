package MegaPredictor.Predictor;
import java.util.*;
public class KeywordMaster {
	public ArrayList<KeySkillDetail> keyskilldetails = new ArrayList<KeySkillDetail>();
	public void addKeySkillDetail(String roletype,String keyskills,String keyskillsmapped,String category,int threshold_1,int lowerthreshold1,int lowerthreshold2,int id,String industry_1,int active_1,int industryclassflag,int score)
{
		this.keyskilldetails.add(new KeySkillDetail(roletype,keyskills,keyskillsmapped,category,industry_1,threshold_1,lowerthreshold1,lowerthreshold2,id,active_1,industryclassflag,score));
		
	}

}
