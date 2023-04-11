let instance;
let counter=0;
class SingleCounter{
    constructor()
    {
        if(instance)
            throw new Error("Create Only One Instance..");
        instance=this;
    }
    getInstance()
   {
    return this;
   } 
   increment()
   {
    return ++counter;
   }
   decrement()
   {
    return --counter;
   }
}
const SingleCounterInstance=Object.freeze(new SingleCounter());
export default SingleCounterInstance;