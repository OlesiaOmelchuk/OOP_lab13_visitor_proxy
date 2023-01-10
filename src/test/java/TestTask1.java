import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.visitor.Group;
import ua.edu.ucu.visitor.Main;
import ua.edu.ucu.visitor.Signature;

public class TestTask1 {
    @Test
    public void testMain(){
        Group<Integer> nestedGroup = new Group<>();
        nestedGroup.addTask(new Signature<>(System.out::println)).addTask(new Signature<>(x -> System.out.println(x * x)));
        Group<Integer> group = new Group<>();
        group.addTask(nestedGroup).addTask(new Signature<>(x -> System.out.println(x * x * x)));
        Assertions.assertDoesNotThrow(() -> group.apply(10));
    }
}
