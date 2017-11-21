package AnswerStrategy;

/**
 * Created by StasMaster on 21.11.17.
 */
public class StartAnswer implements AnswerStrategy {
    protected  String code = "Початкове повідомлення";

    public String formAnswer() {
        return  "<b>Вітаю!</b>!\n" +
                "\n" +
                "Я Укумейлик - твій особистий помічник для розсилки УКУ!\n" +
                "\n" +
                "Відтепер я допомагатиму тобі залишатися в курсі подій і не перечитувати пошту по 5 разів на день :) \n" +
                "\n" +
                "Починаємо :)"+
                " Щоб дізнатись оновлення на актуальні оголошення пиши /schedule ";
    }

}
