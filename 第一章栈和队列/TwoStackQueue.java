//由两个栈组成队列
//两个栈实现队列支持队列基本操作 add,poll,peek
public TwoStackQueue{
  public Stack<Integer> stackPush;
  public Stack<Integer> stackPop;

  public TwoStackQueue(){
    stackPop = new Stack<Integer>();
    stackPush = new Stack<Integer>();
  }

  public void add(int pushInt){
    stackPush(pushInt);
  }

  public int poll(){
    if (stackPop.empty()&&stackPush.empty()) {
      throw new RuntimeException("Queue is empty.");
    }else if (stackPop.empty()) {
      while(!stackPush.empty()){
        stackPop.push(stackPush.pop());
      }
    }
    return stackPop.pop();
  }

  public int peek(){
    if (stackPop.empty()&&stackPush.empty()) {
      throw new RuntimeException("Queue is empty.");
    }else if (stackPop.empty()) {
      while(!stackPush.empty()){
        stackPop.push(stackPush.pop());
      }
    }
    return stackPop.peek();
  }
}
