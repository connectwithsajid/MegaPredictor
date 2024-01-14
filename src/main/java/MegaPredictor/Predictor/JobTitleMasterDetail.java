package MegaPredictor.Predictor;

public class JobTitleMasterDetail {
	public String Industry,Job_title,RollType,IndustryCode,RTcode,Jtcode;
	public int RoleWeightage,ID;
	public JobTitleMasterDetail(String Industry_type,String Job_title,String RollType,int RoleWeightage,String IndustryCode,String Jtcode,String RTcode,int ID) 
	{
		this.Industry=Industry;
		this.Job_title=Job_title;
		this.RollType=RollType;
		this.RoleWeightage=RoleWeightage;
		this.IndustryCode=IndustryCode;
		this.Jtcode=Jtcode;
		this.RTcode=RTcode;
		this.ID=ID;
	}

}
