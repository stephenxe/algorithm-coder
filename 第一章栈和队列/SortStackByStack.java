//4.用一个栈实现另一个栈的排序
public class SortStackByStack{
  public static void sortStackByStack(Stack<Integer> stack){
    Stack<Integer> help = new Stack<Integer>();
    while(!stack.isEmpty()){
      int cur = stack.pop();
      //help栈顶永远存小值
      while(!help.isEmpty()&&help.peek()<cur){
        stack.push(help.pop());
      }
      help.push(cur);
    }
    while(!help.isEmpty()){
      stack.push(help.pop());
    }
  }
}
