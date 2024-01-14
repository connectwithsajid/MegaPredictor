package MegaPredictor.Predictor;
public class KeySkillDetail {
	public String role_type,key_skills,key_skills_mapped,category,industry;
	public int upper_threshold,lower_threshold,boost,id,active,industry_class_flg,score_incrementer;
	public KeySkillDetail(String role_type,String key_skills,String key_skills_mapped,String category,String industry,int upper_threshold,int lower_threshold,int boost,int id,int active,int industry_class_flg,int score_incrementer) 
	{
		this.role_type=role_type;
		this.key_skills=key_skills;
		this.key_skills_mapped=key_skills_mapped;
		this.category=category;
		this.industry=industry;
		this.upper_threshold=upper_threshold;
		this.lower_threshold=lower_threshold;
		this.boost=boost;
		this.id=id;
		this.active=active;
		this.industry_class_flg=industry_class_flg;
		this.score_incrementer=score_incrementer;
	}

}
