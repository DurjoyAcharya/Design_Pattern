/**
 * the Liskov Substitution Principle (LSP) states that objects of a superclass should be
 * replaceable with objects of its subclasses without breaking the application.
 * In other words, what we want is to have the objects of our subclasses behaving
 * the same way as the objects of our superclass.
 */

import {SocialMediaSolution} from "./SocialMediaSolution"
import {PostMediaManager} from "./PostMediaManager";
import {SocialVideoCallManager} from "./SocialVideoCallManager";
class Facebook implements SocialMediaSolution,PostMediaManager<Object>,SocialVideoCallManager{
    chatWithFriends(): void {
        console.log('ChatWithFriend functionality supported by facebook')
    }
    sendPhotosAndVideos(): void {
        console.log('Send photos and videos supported in facebook')
    }
    postToMedia(post: Object): void {
        console.log(post)
    }
    groupVideoCall(args: string): void {
        console.log(args);
    }
}
const post={
    item:'Naga-Chicken-Fry',
    price:299,
    rating:'7/10',
    place:'Cafe-De-Progress'
}
let obj=new Facebook();
obj.chatWithFriends();
obj.sendPhotosAndVideos();
obj.postToMedia(post);
obj.groupVideoCall('Bangla Vibe Band');