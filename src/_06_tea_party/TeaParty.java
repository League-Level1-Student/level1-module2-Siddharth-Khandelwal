package _06_tea_party;

public class TeaParty {
 String welcome(){
	return null;
	
}

public String welcome(String name, boolean isWoman, boolean isKnighted) {
	 String message = "Hello ";
			 if(isWoman) {
			if(isKnighted) {
				message+="Lady ";
			}
			 
			
			
			else {
					message+="Ms. ";
				}
			}
			
			 else {
				if(!isKnighted) {
					message+="Mr. ";
				}
			
			
				else {
				
					message+="Sir ";
				}
			}
			 return message+name;
			 
			
			 
}

}
