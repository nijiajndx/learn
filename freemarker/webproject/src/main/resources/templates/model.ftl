<#import "utils.ftl" as util />
Hello ${hello}
this hello ${this.hello}
<@util.mapping env />
--------------------------------------------------------------------------------------------------------------------------------------------------

${system.out.println("Hello World!")}
//格式化字符串输出:
${static["java.lang.String"].format("%-20s%-20s%-20s", "", thread.currentThread().getName(), thread.activeCount())}

${static["java.lang.String"].format("%-20s%-20s%-20s", "", static["java.lang.Thread"].currentThread().getName(), thread.activeCount())}