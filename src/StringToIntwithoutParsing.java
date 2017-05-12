import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

/**
 * Created by parde on 5/11/2017.
 */

public class StringToIntwithoutParsing {

    public static void main(String[] args) {

       int num = myStringToInt("123");
        System.out.println("The given String number is : "+ num);
    }
    public static int myStringToInt(String str){
        int sum = 0;
        char[] array = str.toCharArray();
        int j = str.length()-1;
        for(int i = 0 ; i <= str.length() - 1 ; i++){
            sum += Math.pow(10, j)*(array[i]-'0');                  //reading string as per 100th, 10th  and 1st place.
            j--;                                                    // that why we r doing sum all together.
        }
        return sum;
    }
}