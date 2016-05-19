//如何仅用递归函数和栈操作 逆序一个栈
//栈压入 1、2、3、4、5 逆序后 5、4、3、2、1 只能使用递归实现
public ReverseStack{
  //获取栈底，不改变其他元素的顺序
  public static int getAndRemoveLastElement(Stack<Integer> stack){
    int result = stack.pop();
    if (stack.isEmpty()) {
      return result;
    }else {
      int last = getAndRemoveLastElement(stack);
      stack.push(result);
      return last;
    }
  }
  //递归获得栈底实现逆序
  public static void reverse(Stack<Integer> stack){
    if (stack.isEmpty()) {
      return;
    }
    int i = getAndRemoveLastElement(stack);
    reverse(stack);
    stack.push(i);
  }
}
