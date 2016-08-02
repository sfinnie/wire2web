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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class submitComplaint_ta0Complaint_Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_submitComplaint_ta0Complaintpc0",RefArg_inputString_1_submitComplaint_ta0Complaintpc0.class);
}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"submitComplaint_ta0Complaint":keyOverwrite,submitComplaint_ta0Complaint_Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
protected void storeArguments(Object[] args){
complaint_=(utils.RefArg)args[0];
}
public String getUniqueName(){
return "submitComplaint_ta0Complaint";
}
public String getStateEncodingOfArgument(){
return ""+"ref";
}
public String getTemplateSignature(){
return "template submitComplaint_ta0(complaint : Ref<Complaint>)";
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
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
Map<String,String> attrsmapout=new HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","large-text");
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall20","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_inputString_1_submitComplaint_ta0Complaintpc0((webdsl.generated.domain.Complaint)complaint_.get())},"inputString"),new Environment(env).putWithcall("elements#inputString",new utils.TemplateCall("elementsempty",null,null,null)),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(complaint.summary) at ../wire2web.app:100/21");
}
}
}
