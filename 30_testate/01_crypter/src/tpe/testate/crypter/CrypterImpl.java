package tpe.testate.crypter;
/**
 *
 * @author t.puertillano
 *
 */

public class CrypterImpl implements Crypter {

	/**
	 * This method encrypts the input
	 * @param input: The input that needs to be encrypted
	 */
	@Override
	public String encrypt(String input) {
		String output="";
		char[] inputArray = input.toLowerCase().toCharArray();
		char[] code1  = {'e','l','o','a','t'};
		char[] code2 = {'3','1','0','4','7'};

		for(int i=0;i<inputArray.length;i++)
		{
			// Check if the character is a special character. If not, encrypt the character
			if(!(((int)inputArray[i]>57 && (int)inputArray[i]<97) || (int)inputArray[i] < 48 || (int)inputArray[i] > 122 ) || (int)inputArray[i] == 32){
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
			// Save encrypted character
			  output+=inputArray[i];
			}
		}
		return output;
	}
	/**
	 * This method decrypts the encrypted input, by using the "encrypt()" method
	 * @param input: Decryption of the encrypted input
	 * @return the decrypted Text
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		// Check whether the encrypted text contains special character.
        for(int i=0;i<input.length();i++){
        	if(Character.isUpperCase(input.charAt(i)) || ((int)input.charAt(i)>57 && (int)input.charAt(i)<97) || (int)input.charAt(i) < 48 || (int)input.charAt(i) > 122 ){
        		throw new IllegalArgumentException();
        	}
        }
         return encrypt(input);
        }
}
