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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class root_wireframe0$l$_s_ad0String_Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"root_wireframe0$l$_s_ad0String":keyOverwrite,root_wireframe0$l$_s_ad0String_Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
protected void storeArguments(Object[] args){
root_wireframe0$l$_next10_=(String)args[0];
}
public String getUniqueName(){
return "root_wireframe0$l$_s_ad0String";
}
public String getStateEncodingOfArgument(){
return "";
}
public String getTemplateSignature(){
return "template root_wireframe0$l$_s_ad0(root_wireframe0$l$_next10 : String)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private  String root_wireframe0$l$_next10_="";
public void setRoot_wireframe0$l$_next10_(String root_wireframe0$l$_next10_){
this.root_wireframe0$l$_next10_=root_wireframe0$l$_next10_;
}
public String getRoot_wireframe0$l$_next10_(){
return root_wireframe0$l$_next10_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
PrintWriter out=ThreadLocalOut.peek();
switch(phase){
case DATABIND_PHASE:ident=root_wireframe0$l$_next10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=root_next0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=root_wireframe0$l$_next10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new root_next0().run(threadLocalPageCached,getEnv(),getElementsContext(),ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+root_wireframe0$l$_next10_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryAruments("?")+"\",\""+root_wireframe0$l$_next10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+"); return false;'");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"float-right");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Next",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
out.print("</button>");
}
else {
out.print("<button name=\""+root_wireframe0$l$_next10_+"\"");
{
StringBuilder classattrs=new StringBuilder();
StringBuilder styleattrs=new StringBuilder();
java.util.List<String> ignore=new java.util.ArrayList<String>();
java.util.List<String> ignorecols=new java.util.ArrayList<String>();
utils.TemplateCall.getDynamicIgnoredAttributes(attrs,ignore);
for(String attrcolname:utils.TemplateCall.getDynamicSelectedAttributeCollections(attrs)){
if(!ignorecols.contains(attrcolname)){
AttributeCollectionLookup.getAttributeCollection(attrcolname,classattrs,styleattrs,ignore,ignorecols,out);
}
}
utils.TemplateCall.appendWithPadding(classattrs,"float-right");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Next",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
out.print("</button>");
}
break;}
}
}
