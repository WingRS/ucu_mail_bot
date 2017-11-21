package main;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;

/**
 * Created by StasMaster on 21.11.17.
 */
public class MessageFactory {

    public static   MyResponse checkMessage(String text, SendMessage message, long chatId) {

        switch (text){
            case "/schedule":
                return new CreateTabResponse(text,message, chatId);
            case "/start" :
                return new StartResponse(text,message,chatId);
            default:
                return new TabResponse(text,message,chatId);
        }

    }

}
