package stack;

public class MaxStack {
    private int top;
    private int[] data;

    public int push(int x){

        return x;
    }

    public int pop(){
        removeAt(top);
        return data[top];
    }

    private void removeAt(int top) {
    }

    public int top(){
        return data[top];
    }

    public int peekMax(){
        int MaxIndex = findMax();
        return data[MaxIndex];
    }

    private int findMax() {
        return 0;
    }

    public int popMax(){
        int MaxIndex = findMax();
        removeAt(MaxIndex);
        return data[MaxIndex];
    }
}
