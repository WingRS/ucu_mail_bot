package main;

import org.telegram.telegrambots.api.methods.send.SendMessage;

/**
 * Created by StasMaster on 21.11.17.
 */
public abstract class MyResponse {

    protected String request;
    protected SendMessage message;
    protected long chatId;


    public abstract boolean Start();
    public abstract boolean FormResponse();

}
