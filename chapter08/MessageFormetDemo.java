import java.text.MessageFormat;

// Coding By 김용선.

public class MessageFormetDemo {
    public static void main(String[] args) {
        String java = "java";
        int version = 8;

        String s = MessageFormat.format("language : {1}\nversion: {0}", version, java);

        System.out.println(s);

        Object[] data = { java, version };

        MessageFormat f = new MessageFormat("language : {0}\nversion: {1}");

        System.out.println(f.format(data));
    }
}
