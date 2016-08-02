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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class submitComplaint_Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
submitComplaint_wireframe0$l$_Template.loadTemplateMap(staticEnv);
submitComplaint_pagelist0$l$_Template.loadTemplateMap(staticEnv);
}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){
submitComplaint_wireframe0$l$_Template.loadRefArgClasses(refargclasses);
submitComplaint_pagelist0$l$_Template.loadRefArgClasses(refargclasses);
}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"submitComplaint":keyOverwrite,submitComplaint_Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
public String getUniqueName(){
return "submitComplaint";
}
public String getStateEncodingOfArgument(){
return "";
}
public String getTemplateSignature(){
return "page submitComplaint()";
}
protected void putLocalDefinesInEnv(){
submitComplaint_wireframe0$l$_Template.loadTemplateMap("wireframe",env);
Object[] arg5={};
env.putExtraLocalTemplateArguments("wireframe",new utils.LocalTemplateArguments(arg5,"wireframe","wireframe"));
submitComplaint_pagelist0$l$_Template.loadTemplateMap("pagelist",env);
Object[] arg4={};
env.putExtraLocalTemplateArguments("pagelist",new utils.LocalTemplateArguments(arg4,"pagelist","pagelist"));
}
public String getElementsContext(){
if(calledName==null){
return "submitComplaint";
}
else {
return calledName;
}
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
PrintWriter out=ThreadLocalOut.peek();
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall67","wfPageTemplate",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{},"wfPageTemplate"),new Environment(env).putWithcall("elements#wfPageTemplate",new utils.TemplateCall("elementsempty",null,null,null)),"wfPageTemplate",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wfPageTemplate() at ../wire2web.app:92/3");
}
}
}
