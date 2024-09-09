package week_7A;

public class StackDemo {
		    public static void main(String[] args) {
		        Stackable<Double> linkedListStack = new LinkedListStackImpl<>();
		        Stackable<Character> arrayStack = new ArrayStackImpl<>();

		        System.out.println("Testing LinkedListStackImpl:");
		        linkedListStack.pushItem(1.1);
		        linkedListStack.pushItem(2.2);
		        linkedListStack.peekItem();
		        linkedListStack.popItem();
		        linkedListStack.peekItem();
		        linkedListStack.popItem();

		        System.out.println("\nTesting ArrayStackImpl:");
		        arrayStack.pushItem('A');
		        arrayStack.pushItem('B');
		        arrayStack.peekItem();
		        arrayStack.popItem();
		        arrayStack.peekItem();
		        arrayStack.popItem();
		    }
		}
