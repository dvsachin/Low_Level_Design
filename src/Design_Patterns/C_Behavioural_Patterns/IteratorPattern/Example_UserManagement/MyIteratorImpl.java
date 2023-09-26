package Design_Patterns.C_Behavioural_Patterns.IteratorPattern.Example_UserManagement;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator{
    private List<User> list;
    private int len;
    private int position = 0;
    MyIteratorImpl(List<User> list) {
        this.list = list;
        this.len = list.size();
    }

    @Override
    public boolean hasNext() {
        return position < len;
    }

    @Override
    public Object next() {
        User user = list.get(position);
        position++;
        return user;
    }
}
