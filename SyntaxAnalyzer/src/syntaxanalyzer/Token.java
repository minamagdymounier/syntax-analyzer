package syntaxanalyzer;

public class Token {
    String token;
    String value;

    public Token() {
    }

    public Token(String token, String value) {
        this.token = token;
        this.value = value;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
}
