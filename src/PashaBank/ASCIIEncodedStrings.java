package PashaBank;

public class ASCIIEncodedStrings {

    public static String decode(String encoded) {

        StringBuilder result = new StringBuilder();
        String decode  = new StringBuilder(encoded).reverse().toString();
        int length = encoded.length();

        for (int i = 0; i < length-1;) {
            if (Integer.parseInt(decode.substring(i,i+2)) == 32){
                result.append(String.format("%s",(char) Integer.parseInt(decode.substring(i,i+2))));
                i +=2;
            } else if (Integer.parseInt(decode.substring(i,i+2)) >= 65){
               int i1 = Integer.parseInt(decode.substring(i, i + 2));
               i +=2;
               result.append(String.format("%s",(char)i1));
           } else{
               result.append(String.format("%s",(char) Integer.parseInt(decode.substring(i,i+3))));
               i+=3;
           }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("23511011501782351112179911801562340161171141148"));
        System.out.println(decode("2312179862310199501872379231018117927"));
        System.out.println(decode("1219950180111108236115111016623101401611235115012312161151110101111127"));
    }
}
