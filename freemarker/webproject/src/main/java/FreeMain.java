import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by sfit0450 on 2014/10/16.
 */
public class FreeMain {

    public static void main(String[] args) throws IOException, TemplateException {
        FreeTools freeTools = new FreeTools();
        freeTools.testUseClass();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("t");
        System.out.println(resourceBundle.getString("aaa"));
    }


}
