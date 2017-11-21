package AnswerStrategy;

/**
 * Created by StasMaster on 21.11.17.
 */
public class InfoAnswer implements AnswerStrategy {
    private  String code = "Оголошення";

    public String formAnswer() {
        return "<b>Оголошення</b>\n" +
                "\n" +
                "Науково-організаційний відділ просить до 1 грудня 2017 р. заповнити та надіслати заявки до Видавничого календаря УКУ на 2018-2019 рр.\n" +
                "До 1 грудня необхідно подати пропозиції до Видавничого календаря УКУ на період січень-серпень 2018 р. Заявки із пропозиціями на вересень 2018 - серпень 2019 р. прийматимуться до 30 червня 2018 р.\n" +
                "Пропозиції, після відповідного розгляду, будуть внесені до Видавничого календаря УКУ та затверджені Видавничою радою УКУ в другій половині грудня.\n" +
                "\n" +
                "<b>Оголошення</b>" +
                "\n"+
                "Завтра, 8 листопада, після загальноуніверситетської Літургії спільнота УКУ дякуватиме \n" +
                "п. Надії Леськів за багатолітню віддану працю на благо нашого університету.\n " +
                "Запрошуємо усіх на подячну Літургію.";
    }
}
