interface Subject {
    attach(observer:Observer):void;
    detach(observer:Observer):void;
    notify():void;
}

interface Observer {
    Update(subject:Subject):void;
}

class ConcreteSubject implements Subject
{

    // @ts-ignore
    public state:number;

    private observers:Observer[]=[];

    public attach(observer: Observer): void {
        // @ts-ignore
        const isExist=this.observers.includes(observer);
        if (isExist)
            return console.log("Subject, Observer has attached already!");
        console.log("Subject Attached an observer !");
        this.observers.push(observer);
    }

    public detach(observer: Observer): void {
        const observerIndex=this.observers.indexOf(observer);
        if (observerIndex===-1)
            return console.log("Subject: non-existed observer");
        this.observers.splice(observerIndex,1);
        console.log('Subject,detached an observer');
    }
    public notify(): void {
        console.log('Subject, notifying observers....');
        for (const observer of this.observers)
        {
            observer.Update(this);
        }
    }
    public someBusinessLogic():void
    {
        console.log('\nSubject: I\'m doing something important');
        this.state=Math.floor(Math.random()*(10+1));
        console.log(`Subject,My state has just changed to ${this.state}`);
        this.notify();
    }
}
class CreateObserverA implements Observer
{
    public Update(subject: Subject): void {
        if (subject instanceof ConcreteSubject && (subject.state<3))
        {
            console.log('ConcreateObserverA: Reacted to the event');
        }
    }
}
class CreateObserverB implements Observer
{
    public Update(subject: Subject): void {
        if (subject instanceof ConcreteSubject && (subject.state===0 && subject.state>=2))
        {
            console.log('ConcreateObserverB: Reacted to the event');
        }
    }
}
const subject=new ConcreteSubject();

const observer1=new CreateObserverA();
subject.attach(observer1);

const observer2=new CreateObserverA();
subject.attach(observer2);

subject.someBusinessLogic();
subject.someBusinessLogic();

subject.detach(observer2);

subject.someBusinessLogic();
