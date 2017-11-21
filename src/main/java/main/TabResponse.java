package main;


import AnswerStrategy.*;
import org.telegram.telegrambots.api.methods.send.SendMessage;

/**
 * Created by StasMaster on 21.11.17.
 */
public class TabResponse extends MyResponse {


    public TabResponse(String request, SendMessage message, long chatId) {
       this.request = request;
       this.message = message;
       this.chatId = chatId;
       message.setChatId(chatId).enableHtml(true);
    }
    @Override
    public boolean Start() {
        if(this.FormResponse()){
            return true;
        }
        return false;
    }

    @Override
    public boolean FormResponse() {
        switch (request){
            case "Церковні події":
                message.setText(new ChurchAnswer().formAnswer());
                return true;
            case "Можливості" :
                message.setText(new OpportunityAnswer().formAnswer());
                return true;
            case "Важливо" :
                message.setText(new ImportantAnswer().formAnswer());
                return true;
            case "Події" :
                message.setText(new EventsAnswer().formAnswer());
                return true;
            case "Колегіум" :
                message.setText(new DormitoryAnswer().formAnswer());
                return true;
            case "Оголошення" :
                message.setText(new InfoAnswer().formAnswer());
                return true;
            default:
                message.setText(new DefaultAnswer().formAnswer());
                return false;
        }
    }

}
