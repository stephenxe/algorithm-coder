//设计一个有getMin功能的栈
//要求：pop，push，getMin操作的时间复杂度都是O（1），设计栈类型可以使用现成的栈结构


public class GetMinStack{
  private Stack<Integer> stackData;
  private Stack<Integer> stackMin;

  public GetMinStack(){
    this.stackData=new Stack<Integer>();
    this.stackMin=new Stack<Integer>();
  }

  public void push(int newNum){
    if (this.stackMin.isEmpty()) {
      this.stackMin.push(newNum);
    }else if(newNum<=geiMin()){
      this.stackMin.push(newNum);
    }

    this.stackData.push(newNum);
  }

  public int pop(){
    if (this.stackData.isEmpty()) {
      throw new RuntimeException("Your stack is empty.");
    }
    int value = this.stackData.pop();
    if (value=this.getMin()) {
      this.stackMin.pop();
    }
    return value;
  }

  public int getMin(){
    if (this.stackMin.isEmpty()) {
      throw new RuntimeException("Your stack is empty.");
    }
    return this.stackMin.peek();
  }
}
