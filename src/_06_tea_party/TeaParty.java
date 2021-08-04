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
	 
	return message;
}
}
