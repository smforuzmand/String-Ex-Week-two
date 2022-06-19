package lexicon.se.String;

public class Ex10 {
    public static void SplitTest2()
    {
        String SplitTest = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arrayToSplit = SplitTest.split(",",-1);
        for (String arr : arrayToSplit)
            System.out.println(arr);
    }
}



