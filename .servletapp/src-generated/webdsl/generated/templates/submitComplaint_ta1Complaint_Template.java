package webdsl.generated.templates;
import static utils.AbstractPageServlet.DATABIND_PHASE;
import static utils.AbstractPageServlet.VALIDATE_PHASE;
import static utils.AbstractPageServlet.ACTION_PHASE;
import static utils.AbstractPageServlet.RENDER_PHASE;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang3.ArrayUtils;
import utils.*;import org.webdsl.tools.Utils;
import org.webdsl.lang.Environment;
import org.webdsl.WebDSLEntity;
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class submitComplaint_ta1Complaint_Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputText_1_submitComplaint_ta1Complaintpc0",RefArg_inputText_1_submitComplaint_ta1Complaintpc0.class);
}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"submitComplaint_ta1Complaint":keyOverwrite,submitComplaint_ta1Complaint_Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
protected void storeArguments(Object[] args){
complaint_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "submitComplaint_ta1Complaint";
}
public String getStateEncodingOfArgument(){
return ""+"ref";
}
public String getTemplateSignature(){
return "template submitComplaint_ta1(complaint : Ref<Complaint>)";
}
public String getElementsContext(){
if(calledName==null){
return "wireframe";
}
else {
return calledName;
}
}
private  utils.RefArg complaint_=null;
public void setComplaint_(utils.RefArg complaint_){
this.complaint_=complaint_;
}
public utils.RefArg getComplaint_(){
return complaint_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
PrintWriter out=ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall18","inputText",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_inputText_1_submitComplaint_ta1Complaintpc0((webdsl.generated.domain.Complaint)complaint_.get())},"inputText"),new Environment(env).putWithcall("elements#inputText",new utils.TemplateCall("elementsempty",null,null,null)),"inputText",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputText(complaint.details) at ../wire2web.app:101/23");
}
}
}
