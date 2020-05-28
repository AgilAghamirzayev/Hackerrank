package algorithms.string;

public class BeautifulBinaryString {

    static int beautifulBinaryString(String b) {


        return b.length() - b.replace("010","01").length();
//        String sub = "010";
//        int count = 0;
//
//        for (int i = 0; i < b.length()-2; i++) {
//            if (b.substring(i, i+3).equals(sub)){
//                i += 2;
//                count++;
//            }
//        }
//
//        return count;
    }


    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("0100101010"));
        System.out.println(beautifulBinaryString("0101010"));
        System.out.println(beautifulBinaryString("00110"));
    }
}
