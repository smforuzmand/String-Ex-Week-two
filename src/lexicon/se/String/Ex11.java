package lexicon.se.String;

public class Ex11 {
    public static void ConvertTest() {
        String sentence = "ThisShouldBeConverted";
        for (int i = 0 ; i< sentence.length();i++)
        {
            char elements = sentence.charAt(i);
            System.out.println("char at "+i+" index is: "+elements);

        }
    }
}
