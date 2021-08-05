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
			 }
			String message2 = "Hello ";
			if(isWoman=true) {
				if(isKnighted=false) {
					message2+="Ms. ";
				}
			}
			String message3 = "Hello ";
			if(isWoman=false) {
				if(isKnighted=false) {
					message3+="Mr. ";
				}
			}
			String message4 = "Hello ";
			if(isWoman=false) {
				if(isKnighted=true) {
					message4+="Sir ";
				}
			}
			 return message;
			 
			
			 
}

}
