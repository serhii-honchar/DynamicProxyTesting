package ua.kiev.sa;


public class TextService implements Service {

    public String staticText() {
        return "Some static text";
    }

    public String variable(String variable) {
        return variable;
    }

    public String exception(String text) throws RuntimeException {
        //TODO throw your custom exception
        return text;
    }


}
