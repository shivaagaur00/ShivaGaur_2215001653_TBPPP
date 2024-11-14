import java.util.Stack;
class reverse{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        func(5,stack);
        // Stack<Integer> st=new Stack<>();
        System.out.println(stack.size());
        reverse(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
    public static void func(int i,Stack<Integer> st){
        if(i<=0) return;
        st.push(i);
        func(i-1, st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int a=st.pop();
        reverse(st);
        // st.insertElementAt(a,0);
        bottom(st,a);
    }
    public static void bottom(Stack<Integer> st,int a){
        if (st.isEmpty()) {
            st.push(a);
            return;
        }
        int i=st.pop();
        bottom(st, a);
        st.push(i);
    }
}