abstract class SocialMedia<T> {
  public abstract goupCall(medium: T);
  public abstract chatWithFriend();
}
interface NotificationService {
  SendMail(email: string): void;
  SendSMS(phone: string): void;
}
class BankingService implements NotificationService {
  constructor() {}
  SendMail(email: string): void {
    if (email === "da-durjoy@outlook.com")
      console.log("Email Notification Send Successfully");
    else console.log("Email Sending Failed");
  }
  SendSMS(phone: string): void {
    if (phone === "01876068550") console.log("SMS Alert Send Successfully");
    else console.log("SMS Alert Sending Failed");
  }
}
let obj = new BankingService();
obj.SendMail("da-durjoy@outlook.com");
obj.SendMail("durjoy@outlook.com");
obj.SendSMS("01876068550");
obj.SendSMS("01778550625");
