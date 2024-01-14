package MegaPredictor.Predictor;
import java.util.ArrayList;

public class RoleCapMaster {
	public ArrayList<CapabilityDetails> capabilityDetails = new ArrayList<CapabilityDetails>();
	public void addCapabilityDetail(String capability_type,String Capability,String role_type) {
		capabilityDetails.add(new CapabilityDetails(capability_type,Capability,role_type));
	}

}
