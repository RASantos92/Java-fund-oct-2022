import java.util.ArrayList;
public class VoiceMessageTest {

    public static void main(String[] arg){
        VoiceMessageUtil messageUtil = new VoiceMessageUtil();
        System.out.println(messageUtil.greeting("Bobby"));
        System.out.println(messageUtil.greeting("test"));
        messageUtil.getTodaysDate();

        // javascript example
        // messagesPerDay = []
        // messagesPerDay.push(5)
        // fixed Array example for java.
        int[] messagesPerDay = new int[5];
        messagesPerDay[0] = 8;
        messagesPerDay[1] = 6;
        messagesPerDay[2] = 10;

        // System.out.println(messageUtil.countTotalMessages(messagesPerDay));

        // System.out.println("fixed array: "+ messagesPerDay);

        // for(int i = 0; i < messagesPerDay.length; i++){
        //     System.out.println(messagesPerDay[i]);
        // }

        // // javascript example:
        // // messagesPerDay = [1,5,4,8,6]
        // // Build array exaple 2 not fixed
        // System.out.println("******************************* \n");
        String[] messages = {"message1","message2","message3"};

        messageUtil.printAllMessages(messages);
        // for(int i = 0; i < messages.length; i++){
        //     System.out.println(messages[i]);
        // }


        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish Cafe bussiness logic");
        todoList.add("Read ahead for OOP");

        messageUtil.printAllMessages(todoList);



        // type casting

        int days = 7;
        double cost = 10.99;

        // implicit casting
        double totalCost = days * cost; // totalCost: double; day: int => double (no loss of data so java will implicitly convert int to double)
        System.out.println(totalCost);

        // explicit casting
        int totalCost1 = (int)(days * cost);// cost: double => int; day: int => double 
        System.out.println(totalCost1);
        
    }
}