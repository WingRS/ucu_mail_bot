package main;

import AnswerStrategy.StartAnswer;
import org.telegram.telegrambots.api.methods.send.SendMessage;

/**
 * Created by StasMaster on 21.11.17.
 */
public class StartResponse extends MyResponse {

    public StartResponse(String request, SendMessage message, long chatId) {
        this.request = request;
        this.message = message;
        this.chatId = chatId;
        message.setChatId(chatId).enableHtml(true);
    }

    @Override
    public boolean Start() {
        if(FormResponse()){
            return true;
        }
        return false;
    }

    @Override
    public boolean FormResponse() {
        message.setText(new StartAnswer().formAnswer());
        return true;
    }
}
