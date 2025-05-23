public class StackLinkedList implements Stack{

    StackItem top;
    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public Object pop() throws MyEmptyStackException {
        if(this.top == null){
            throw new MyEmptyStackException("Stack is empty!! You can't pop anything from an empty stack!!");
        }
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}
