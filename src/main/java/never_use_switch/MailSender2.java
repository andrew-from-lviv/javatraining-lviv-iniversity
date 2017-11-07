package never_use_switch;


import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lombok.SneakyThrows;

public class MailSender2 {

    private Map<Integer, MailGenerator> map = new HashMap<>();

    @SneakyThrows
    public MailSender2() {
        Reflections scanner = new Reflections("never_use_switch");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                map.put(aClass.getAnnotation(MailCode.class).value(), aClass.newInstance());
            }
        }

    }

    public void sendMail(MailInfo mailInfo) {

        MailGenerator mailGenerator = map.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html,mailInfo);


    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }


}
