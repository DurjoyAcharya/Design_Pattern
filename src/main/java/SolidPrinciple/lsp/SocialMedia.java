package SolidPrinciple.lsp;

//Liscove substitution principle

public abstract class SocialMedia<T> {
    //@ support whatsapp,facebook,instagram
    public abstract void chatWithFriend();
    //@ support facebook,instagram
    public abstract void postSocialMedia(T content);

    //@ support facebook instagram,whatsapp
    public abstract void sendPhotosAndVideos();

    //@ support whatsapp facebook
    public abstract void groupCall(String...r);
}
