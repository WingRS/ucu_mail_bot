package main;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Chat;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;


public class MyBot extends TelegramLongPollingBot {


    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();

                long chat_id = update.getMessage().getChatId();
                Chat chat = update.getMessage().getChat();
                SendMessage message = new SendMessage(); // Create a message object object
//
//                    .setChatId(chat_id)
//                    .enableHtml(true)
//                    .setText(chat.getFirstName() + " hah you piece of shit" + chat.getLastName());
                MyResponse response =  MessageFactory.checkMessage(message_text,message,chat_id);
                response.Start();
                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

        }


    }


    public String getBotUsername() {
        // TODO
        return "UCUmail";
    }

    @Override
    public String getBotToken() {
        return "token";
    }
}
