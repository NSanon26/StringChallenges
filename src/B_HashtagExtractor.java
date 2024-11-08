import java.awt.*;

/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding #and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        int hashtagIndex = post.indexOf('#');
        while(hashtagIndex != -1) {
String hashtag = "";
                int spaceIndex = post.indexOf(' ', hashtagIndex);
                if(spaceIndex != -1) {
                     hashtag = post.substring(hashtagIndex, spaceIndex);
                }else {
                    hashtag = post.substring(hashtagIndex);
                    System.out.println("Hashtag: " + hashtag);
                    break;
                }
                    System.out.println("Hashtag: " + hashtag);
                    hashtagIndex = post.indexOf('#', spaceIndex);

        }


    }

}
