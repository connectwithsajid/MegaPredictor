package MegaPredictor.Predictor;

public class rolePredictor {


	public String role_type;
	public double score;
	public rolePredictor(String role_type,double score) 
	{
		this.role_type=role_type;
		this.score=score;
	}
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}

}
