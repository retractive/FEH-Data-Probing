import java.net.MalformedURLException;
import java.net.URL;

public class FireEmblem {

    public static void main(String[] args){
//        System.out.println("let's predict what color or type a character will be based on their stats!");
//        train();
//        Character c = new Character();
//        predict(c);

        System.out.println("Reading from URL test");
        String testUrl = "https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet";
        try {
            URL markdown = new URL(testUrl);
        }
        catch (MalformedURLException e){
            System.err.println("Bad URL!");
        }

    }

    private static void train(){
        // import training data (all lvl 40 5*):
        // Name,hp,atk,spd,def,res,color,movetype,wpntype,
        // String,int,int,int,int,int,String,String,String,

    }

    private static void predict(Character c){

    }

    /** TODO: MINE STATS FROM SITE, store in SQL database.
     * Count how many "/ hero / *" entries are
     * in each letter of
     * alphabet, store this number in database */
    private static void mine(){
        String root = "https://fireemblem.gamepress.gg/hero/";
//        while(){
//
//        }

    }

}
