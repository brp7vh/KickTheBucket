package cs4720.cs.virginia.edu.kickthebucket;

/**
 * Original Code from Mark Sherriff
 * We do not understand the use of the boolean below
 */

import java.util.ArrayList;

public class BucketItem{
    private String mTodo;
    private boolean mOnline;

    public BucketItem(String todo, boolean online) {
        mTodo = todo;
        mOnline = online;
    }

    public String getTodo() {
        return mTodo;
    }

    public boolean isOnline(){
        return mOnline;
    }

    private static int lastTodoItem = 0;

    public static ArrayList<BucketItem> createTodoList(int numTodo){
        ArrayList<BucketItem> items = new ArrayList<BucketItem>();

        for (int i = 1; i <= numTodo; i++) {
            items.add(new BucketItem("Todo Item " + ++lastTodoItem, i <= numTodo / 2));
        }

        return items;
    }
}