import freemarker.ext.beans.BeansWrapper;
import freemarker.template.*;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by sfit0450 on 2014/10/16.
 */
public class FreeTools {
    private static Configuration cfg = new Configuration();
    //private static Writer out = new PrintWriter(System.out);
    private static Writer out ;

    {
        try {
            cfg.setDirectoryForTemplateLoading(new File("E:\\myfile\\learn\\freemarker\\webproject\\src\\main\\resources\\templates"));
            out = new FileWriter(new File("free.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //拿到静态Class的Model
    public TemplateModel useClass(String className) throws TemplateModelException
    {
        BeansWrapper wrapper = (BeansWrapper) cfg.getObjectWrapper();
        TemplateHashModel staticModels = wrapper.getStaticModels();
        return staticModels.get(className);
    }
    //拿到目标对象的model
    public TemplateModel useObjectModel(Object target) throws TemplateModelException
    {
        ObjectWrapper wrapper = cfg.getObjectWrapper();
        TemplateModel model = wrapper.wrap(target);
        return model;
    }

    //拿到目标对象某个方法的Model
    public TemplateModel useObjectMethod(Object target, String methodName) throws TemplateModelException
    {
        TemplateHashModel model = (TemplateHashModel) useObjectModel(target);
        return model.get(methodName);
    }

    public void testUseClass() throws TemplateException, IOException {
        Map<String, Object> rootMap = new HashMap<String, Object>();
        rootMap.put("hello", "James");
        rootMap.put("env", System.getenv());
        rootMap.put("this", rootMap);

        rootMap.put("static", ((BeansWrapper)cfg.getObjectWrapper()).getStaticModels());
        rootMap.put("thread", useClass("java.lang.Thread"));
        rootMap.put("system", useClass("java.lang.System"));


        Template template = cfg.getTemplate("model.ftl", Locale.getDefault());
        template.process(rootMap, out);

    }
}
