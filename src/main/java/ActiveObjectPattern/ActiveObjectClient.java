package ActiveObjectPattern;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

record Task(int priority,String name){}
interface ActiveObject{
    CompletableFuture<Task> doTask(Task task);
}
class ActiveObjectImpl implements ActiveObject{
    private final ExecutorService executor= Executors.newSingleThreadExecutor();
    @Override
    public CompletableFuture<Task> doTask(Task task) {
        return CompletableFuture.supplyAsync(()->{
            return task;
        },executor);
    }
}
public class ActiveObjectClient
{
    private final ActiveObject activeObject;

    public ActiveObjectClient(ActiveObject activeObject) {
        this.activeObject = activeObject;
    }
    public void doClientTask(Task task)
    {
        var futureResult=activeObject.doTask(task);
        Task join = futureResult.join();
        System.out.println(join.toString());
    }

    public static void main(String[] args) {
        //CompletableFuture<String> list=new CompletableFuture<>();
        new ActiveObjectClient(
                new ActiveObjectImpl()).doClientTask(new Task(1,"Ayesha"));

    }
}

