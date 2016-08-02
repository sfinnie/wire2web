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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class submitComplaint_wireframe0$l$_Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
submitComplaint_wireframe0$l$_s_ad1String_Complaint_Template.loadTemplateMap(submitComplaint_wireframe0$l$_s_ad0String_Complaint_Template.loadTemplateMap(submitComplaint_ta2Complaint_Template.loadTemplateMap(submitComplaint_ta1Complaint_Template.loadTemplateMap(submitComplaint_ta0Complaint_Template.loadTemplateMap(staticEnv)))));
}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){
submitComplaint_ta0Complaint_Template.loadRefArgClasses(refargclasses);
submitComplaint_ta1Complaint_Template.loadRefArgClasses(refargclasses);
submitComplaint_ta2Complaint_Template.loadRefArgClasses(refargclasses);
submitComplaint_wireframe0$l$_s_ad0String_Complaint_Template.loadRefArgClasses(refargclasses);
submitComplaint_wireframe0$l$_s_ad1String_Complaint_Template.loadRefArgClasses(refargclasses);
}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"submitComplaint_wireframe0$l$":keyOverwrite,submitComplaint_wireframe0$l$_Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
public String getUniqueName(){
return "submitComplaint_wireframe0$l$";
}
public String getStateEncodingOfArgument(){
return "";
}
public String getTemplateSignature(){
return "template submitComplaint_wireframe0$l$()";
}
public String getElementsContext(){
if(calledName==null){
return "wireframe";
}
else {
return calledName;
}
}
private  webdsl.generated.domain.Complaint complaint_;
public webdsl.generated.domain.Complaint getComplaint_(){
return complaint_;
}
public void setComplaint_(webdsl.generated.domain.Complaint complaint_){
this.complaint_=complaint_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
PrintWriter out=ThreadLocalOut.peek();
int sec1=threadLocalPageCached.getSectionDepth();
if(RENDER_PHASE==phase){
if(sec1>0){
if(sec1>6){
sec1=6;
}
}
else {
sec1=1;
}
out.print("<h"+sec1);
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
utils.TemplateCall.appendWithPadding(classattrs,"header section"+sec1);
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Submit a Complaint",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
if(RENDER_PHASE==phase){
out.print("</h"+sec1+">");
}
if(RENDER_PHASE==phase){
out.print("<"+"h2");
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
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Please tell us about your Complaint",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
if(RENDER_PHASE==phase){
out.print("</"+"h2"+">");
}
if(threadLocalPageCached.isInForm()){
org.webdsl.logging.Logger.error("Invalid nested <form> tag detected in DOM at URL: "+threadLocalPageCached.getRequest().getRequestURL()+"\n Enclosing form found in "+threadLocalPageCached.getEnclosingForm()+"\n Nested form found in "+getTemplateSignature());
}
threadLocalPageCached.enterForm(getTemplateSignature());
ident=(inForLoop?forelementcounter:"")+("form0"+getUniqueId());
threadLocalPageCached.setFormIdent(ident);
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.setInSubmittedForm(true);
threadLocalPageCached.submittedFormId=ident;
}
java.io.StringWriter sw1=null;
java.io.StringWriter sw0=null;
if(RENDER_PHASE==phase){
threadLocalPageCached.formRequiresMultipartEnc=false;
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
sw1=new java.io.StringWriter();
out=new java.io.PrintWriter(sw1);
ThreadLocalOut.push(out);
}
out.print("<form name=\""+ident+"\" id=\""+ident+"\" action=\""+utils.HTMLFilter.filter(threadLocalPageCached.getPageUrlWithParams()+threadLocalPageCached.getExtraQueryAruments("?"))+"\" accept-charset=\"UTF-8\" method=\"POST\"");
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
if(!ignorecols.contains("form")){
AttributeCollectionLookup.getAttributeCollection("form",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
sw0=new java.io.StringWriter();
out=new java.io.PrintWriter(sw0);
ThreadLocalOut.push(out);
out.print(">");
out.print("<input type=\"hidden\" name=\""+ident+"\" value=\"1\" />");
out.print(threadLocalPageCached.getHiddenParams());
}
if(RENDER_PHASE==phase||threadLocalPageCached.inSubmittedForm()){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall4","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Title"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("submitComplaint_ta0Complaint",getElementsContext(),new Object[]{new RefArg_submitComplaint_wireframe0$l$_Template0(submitComplaint_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Title\") at ../wire2web.app:94/3");
}
if(RENDER_PHASE==phase){
out.print("<"+"br");
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
utils.TemplateCall.appendWithPadding(classattrs,"clear");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print("/>");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall6","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Details"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("submitComplaint_ta1Complaint",getElementsContext(),new Object[]{new RefArg_submitComplaint_wireframe0$l$_Template0(submitComplaint_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Details\") at ../wire2web.app:94/3");
}
if(RENDER_PHASE==phase){
out.print("<"+"br");
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
utils.TemplateCall.appendWithPadding(classattrs,"clear");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print("/>");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall8","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Would you like a response?"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("submitComplaint_ta2Complaint",getElementsContext(),new Object[]{new RefArg_submitComplaint_wireframe0$l$_Template0(submitComplaint_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Would you like a response?\") at ../wire2web.app:94/3");
}
if(RENDER_PHASE==phase){
out.print("<"+"br");
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
utils.TemplateCall.appendWithPadding(classattrs,"clear");
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print("/>");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall10","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"submitComplaint_wireframe0$l$_submit1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new Environment(env).putWithcall("s",new utils.TemplateCall("submitComplaint_wireframe0$l$_s_ad0String_Complaint",getElementsContext(),new Object[]{new RefArg_submitComplaint_wireframe0$l$_Template0(submitComplaint_wireframe0$l$_Template.this)},attrs)),"wrapsubmitString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"submitComplaint_wireframe0$l$_submit1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall13","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"submitComplaint_wireframe0$l$_back1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new Environment(env).putWithcall("s",new utils.TemplateCall("submitComplaint_wireframe0$l$_s_ad1String_Complaint",getElementsContext(),new Object[]{new RefArg_submitComplaint_wireframe0$l$_Template0(submitComplaint_wireframe0$l$_Template.this)},attrs)),"wrapsubmitString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"submitComplaint_wireframe0$l$_back1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
if(RENDER_PHASE==phase){
out.print("</form>");
ThreadLocalOut.popChecked(out);
out=ThreadLocalOut.peek();
if(threadLocalPageCached.formRequiresMultipartEnc){
out.write(" enctype=\"multipart/form-data\"");
}
out.write(sw0.toString());
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
ThreadLocalOut.pop();
if(threadLocalPageCached.submittedFormContent==null){
threadLocalPageCached.submittedFormContent=sw1.toString();
}
else {
out=ThreadLocalOut.peek();
out.write(threadLocalPageCached.submittedFormContent);
}
}
threadLocalPageCached.formRequiresMultipartEnc=false;
}
threadLocalPageCached.setInSubmittedForm(false);
threadLocalPageCached.setFormIdent("");
threadLocalPageCached.leaveForm();
}
protected void initializeLocalVars(){
complaint_=webdsl.generated.domain.Complaint._static_createEmpty_();
}
}
