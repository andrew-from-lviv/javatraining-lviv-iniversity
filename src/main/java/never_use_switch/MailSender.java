package never_use_switch;
import lombok.SneakyThrows;



public class MailSender {

    @SneakyThrows
    public void sendMail(MailInfo mailInfo) {

//        MailType mailType = MailType.findByMailCode(mailInfo.getMailCode());
//        MailGenerator mailGenerator = mailType.getMailGenerator();
//        String html = mailGenerator.generateHtml(mailInfo);
//        send(html,mailInfo);


    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }


}
