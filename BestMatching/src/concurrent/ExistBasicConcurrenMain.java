package concurrent;

import data.WordsLoader;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;


public class ExistBasicConcurrenMain {

    public static void main(String[] args) {
        try {
            Date startTime, endTime;
            List<String> dictionary= WordsLoader.load("data/UK Advanced Cryptics Dictionary.txt");

            System.out.println("Dictionary Size: "+dictionary.size());

            startTime=new Date();

//            String word="stitter";
            String word="spitter";

            if (args.length == 1) {
                word=args[0];
            }

            Boolean result;
            result = ExistBasicConcurrentCalculation.existWord(word, dictionary);
            endTime=new Date();
            System.out.println("Word: "+word);
            System.out.println("Exist: "+result);
            System.out.println("Execution Time: "+(endTime.getTime()-startTime.getTime()));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}

