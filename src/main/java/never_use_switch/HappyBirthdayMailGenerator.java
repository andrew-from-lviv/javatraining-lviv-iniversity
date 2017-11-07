package never_use_switch;

@MailCode(3)
public class
HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    @MailCode(3)
    public String generateHtml(MailInfo mailInfo) {
        return "happy birthday " + mailInfo.getClient().getName();
    }
}
