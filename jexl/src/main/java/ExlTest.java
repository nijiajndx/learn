import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

/**
 * Created by sfit0450 on 2014/10/13.
 */
public class ExlTest {
    public static void main(String[] args) {
        String exp = "if((a.isTrue(3)||a.isTrue(2))&&a.isTrue(1)){" +
                "System.out.println(' congratulations !');" +
                "}";
        String exp2 = "a.getList();";
        Log log = LogFactory.getLog(ExlTest.class);

        String exp3 = "if((a.isTrue(3)||a.isTrue(2))&&a.isTrue(6)){log.info('wow');}";
        JexlEngine jexl = new JexlEngine();
        Expression e = jexl.createExpression( exp3 );

        // Create a context and add data
        JexlContext jc = new MapContext();
        A a = new A();
        jc.set("a",a);
        jc.set("log",log);
        Object o = e.evaluate(jc);
        System.out.println("end");
    }
    
}
