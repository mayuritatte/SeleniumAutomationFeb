package smokeTest;

import utility.ConfigRead;

public class NOPCommLogin {

	public static void main(String[] args) throws Exception {
		
		
		ConfigRead conf = new ConfigRead();
		
		System.out.println("launch application " + conf.getApplicationURL());
		
		System.out.println(conf.getEmail());

	}

}
