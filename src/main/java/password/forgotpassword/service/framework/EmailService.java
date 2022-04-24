package password.forgotpassword.service.framework;

import password.forgotpassword.entity.Mail;

public interface EmailService {
    void send(Mail mail);
}
