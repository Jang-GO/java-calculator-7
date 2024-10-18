package calculator.view;

public class ConsoleManager {
    private final static String WELCOME_MESSAGE = "덧셈할 문자열을 입력해주세요.";
    private final static String RESULT_MESSAGE = "결과 : ";
    public void run(){
        printWelcomeMessage();

        String str = InputManager.consoleInput();

        StringParser parser = ParserSelecter.select(str);
        List<String> list = parser.parse(str);
        int result = Calculator.sum(list);

        printResultMessage(result);
    }
    public void printWelcomeMessage(){
        System.out.println(WELCOME_MESSAGE);
    }
    public String printResultMessage(int result){
        System.out.println(RESULT_MESSAGE + result);
    }
}
