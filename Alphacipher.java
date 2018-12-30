public class Alphacipher{
	public static void main(String args[]){

		if (args.length<2){
			System.out.println("Key and message required.");
			System.exit(0);
		}

		String key = args[0];
		String msg = args[1];
		String table = "abcdefghijklmnopqrstuvwxyz";
		//create a mask for the msg
		String mask="";
		for(int i=0; i<msg.length();i++){
			mask+=key.charAt(i%key.length());
		}
		System.out.println(mask);
		char a= 'a';
		char b = 'c';
		System.out.println((a+1));


		//for each letter of the alphabet
		// char a is int value of 97
		String encoded="";
		for (int i=0; i< msg.length();i++){
			encoded+=table.charAt((msg.charAt(i)-194+mask.charAt(i))%26);
		}
		System.out.println(encoded);
		String decoded="";
		for (int i=0; i< msg.length();i++){
			char letter='a';
			int let = msg.charAt(i)-mask.charAt(i);
			if (let<0){
				let+=26;
			}
			letter +=let;
			decoded+=letter;
		}
		System.out.println(decoded);

		//add the cipher letter to a string
		//verbalise string

	}
}

//10.30am -11.13am
//finished decode 11.33

