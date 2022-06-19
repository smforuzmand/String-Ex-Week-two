package lexicon.se.String;

public class Ex6 {
    public static void CorrectionTest(){
        String sentence = "Java is the worst programming language!";
        String Correction = sentence.replace("worst", "best");
        System.out.println(Correction);
    }
}
