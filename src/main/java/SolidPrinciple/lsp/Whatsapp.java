package SolidPrinciple.lsp;

// This class is not maintain Liscov Substitution Principle cz all functionality are not supported by whatsapp
public class Whatsapp extends SocialMedia<Object> {
    @Override
    public void chatWithFriend() {

    }
    //This method is not applicable for whatsapp
    @Override
    public void postSocialMedia(Object content) {

    }
    @Override
    public void sendPhotosAndVideos() {

    }
    @Override
    public void groupCall(String... r) {

    }
}
