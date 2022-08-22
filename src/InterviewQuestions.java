import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InterviewQuestions {


    //1)Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
    //wordLen(["a", "bb"])
    //{"bb": 2, "a": 1} wordLen(["this", "and", "that", "and"])  {"that": 4, "and": 3, "this": 4} wordLen(["code", "code", "code", "bug"])  {"code": 4, "bug": 3}

	/*
	 *2) Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
	pairs(["code", "bug"])  {"b": "g", "c": "e"}
	pairs(["man", "moon", "main"])  {"m": "n"}
	pairs(["man", "moon", "good", "night"])  {"g": "d", "m": "n", "n": "t"}
	 */


	/*
	 * 3)wordCount(["a", "b", "a", "c", "b"])  {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"])  {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"])  {"c": 4}
	 */

	/*
	 * 4)firstChar(["salt", "tea", "soda", "toast"])  {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"])  {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([])  {}
	 */



    /*
     * 5) sort array {3,1,6,12,-1,-7}
     */

    /*
     *  6)Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


    /*
     * HomeWork  String[] {a,b,c,b,a} which element when repeat itself create and map  {a:4,b:3}
     */
    public static void main(String[] args) {
        String[] wordLenArray = {"this", "and", "that", "and"};
        String[] pairsArray = {"code", "bug"};
        String[] wordCountsArray = {"a", "b", "a", "c", "b"};

        wordLend(wordLenArray);
        pairs(pairsArray);
        wordCounts(wordCountsArray);

    }

    private static void wordCounts(String[] wordCountsArray) {
        HashSet<String> unique = new HashSet<String>(Arrays.asList(wordCountsArray));
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(String element: unique)
        {
            int count =0;

            for(int z =0;z<wordCountsArray.length;z++)
            {
                if(element.equals(wordCountsArray[z]))
                {
                    count++;
                }
            }

            map.put(element,count);


        }

        System.out.println(map);

    }


    public static void  wordLend(String[] array)
    {
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i< array.length;i++)
        {
            int length =array[i].length();

            map.put(array[i],length);
        }


        System.out.println(map);
    }


    public static void pairs(String[] array)
    {
        HashMap<String,String> map = new HashMap<>();

        for(int i =0; i< array.length;i++)
        {
            String firstChar = "" + array[i].charAt(0);
            String lastChar = "" + array[i].charAt(array[i].length()-1);

            map.put(firstChar,lastChar);
        }

        System.out.println(map);

    }


}
