import java.util.*;

public class VoiceMessageUtil {
    //     return type
    public String greeting(String name){
    //^ access modifier
        return "Hello, " + name;
    }
    
    public String greeting(double age){
        return "Hello, your age is: " + age;
    }

    public void getTodaysDate(){
        Date today = new Date();
    }

    public int countTotalMessages(int[] messageCount){
        int output = 0;
        for(int i = 0; i < messageCount.length; i++){
            output += messageCount[i];
        }
        return output;
    }

    public void printAllMessages(String[] messages){
        // for(int i = 0; i< messages.length; i++ ){
        //     System.out.println(messages[i]);
        // }

        for(String m : messages){
            System.out.println(m);
        }
    }

    public void printAllMessages(ArrayList<String> messages){

        // for(int i = 0; i< messages.size(); i++ ){
        //     System.out.println(messages.get(i));
        // }

        for(String m : messages){
            System.out.println(m);
        }
    }

}