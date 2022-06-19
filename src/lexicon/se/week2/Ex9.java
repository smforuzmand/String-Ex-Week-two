package lexicon.se.week2;

public class Ex9 {
    public static void SplitTest() {
        String SplitTest = "Oil and Water";
        String[] ArrayToSplit = SplitTest.split("and");
        for (String arr : ArrayToSplit) {
            System.out.println(arr);
        }

    }
}
