package main;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StasMaster on 21.11.17.
 */
public class CreateTabResponse extends MyResponse {

        CreateTabResponse(String request, SendMessage message, long chatId){
            this.request = request;
            this.message = message;
            this.chatId = chatId;
            message.setChatId(chatId).enableHtml(true).setText("Виберіть зі списку команд і я вам допоможу!");
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
            ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboard = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add("Церковні події");
            row.add("Можливості");
            row.add("Важливо");
            keyboard.add(row);
            row = new KeyboardRow();
            row.add("Події");
            row.add("Колегіум");
            row.add("Оголошення");
            keyboard.add(row);
            keyboardMarkup.setKeyboard(keyboard);
            message.setReplyMarkup(keyboardMarkup);
            return true;
        }
    }
