import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Created by sfit0450 on 2014/10/13.
 */
public class A {
    public List<String> getList(){
        ImmutableList<String> list = ImmutableList.of("hey","man","what the fuck are u doing?");
        return list;
    }

    public boolean isTrue(int n){
        System.out.println(n);
        return (n%3==0);
    }
}
