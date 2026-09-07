class Stack{
private int[] arr;
private int top;
private int size;

Stack (int size) {
this.size= size;
arr=new int[size];
top = -1;
}

void push(int value) {
if (isFull()) {
System.out.println("Stack overflow cannot push"+ value);
return;
}

top++;
arr[top]= value;
System.out.println(value + "pushed into Stack");
}

int pop()
{
if(isEmpty()){
System.out.println("Stack underflow, stack is Emnpty");
return -1;
}
}
int peek() {
if (isEmpty()) {
System.out.println("Stack is empty");

return arr[top];
}
}
boolean isEmpty() {
return top == size -1;
}
boolean isFull() {
return top = size -1;
}
void display() {
if (isEmpty()) {
System.out.println("Stack is empty");
return;
}
System.out.println("Stack elements");
for(int i= top; i>=0; i--){
System.out.println(arr[i]);
}
}

public class StackArray{
public static void main(String[] args) {
Stack stack = new Stack(5);
stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);
 stack.display();
System.out.println("top elements: "+stack.peek());
System.out.println("popped element: "+stack.pop());
System.out.println("popped element: "+stack.pop());
stack.display();
System.out.println("top element: "+stack.peek());
}
}










