package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		String output="";
		char[] inputArray = input.toLowerCase().toCharArray();
		char[] code1  = {'e','l','o','a','t'};
		char[] code2 = {'3','1','0','4','7'};

		for(int i=0;i<inputArray.length;i++)
		{
			for(int z=0;z<code1.length;z++)
			{
				if(inputArray[i] == code1[z])
				{
					inputArray[i] = code2[z];
				}
				else if(inputArray[i] == code2[z])
				{
					inputArray[i] = code1[z];
				}
			}
			output+=inputArray[i];
		}
		return output;
	}
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
        for(int i=0;i<input.length();i++){
        	if(Character.isUpperCase(input.charAt(i)) || ((int)input.charAt(i)>57 && (int)input.charAt(i)<97) || (int)input.charAt(i) < 48 || (int)input.charAt(i) > 122 ){
        		throw new IllegalArgumentException();
        	}
        }
         return encrypt(input);
        }
}
