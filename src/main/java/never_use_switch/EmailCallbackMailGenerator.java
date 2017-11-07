package never_use_switch;

@MailCode(2)
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    @MailCode(2)
    public String generateHtml(MailInfo mailInfo) {
        return "<html> don't call use we call you</html>";
    }
}
