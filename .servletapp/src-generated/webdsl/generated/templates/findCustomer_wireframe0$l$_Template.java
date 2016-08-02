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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class findCustomer_wireframe0$l$_Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){
findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_wireframe0$l$_s_ad0String_Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta6Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta5Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta4Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta3Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta2Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta1Party_String_String_String_Set_Gender__Template.loadTemplateMap(findCustomer_ta0Party_String_String_String_Set_Gender__Template.loadTemplateMap(staticEnv)))))))));
}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){
findCustomer_ta0Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_ta1Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_ta2Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_ta3Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_ta4Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_ta5Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_ta6Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_wireframe0$l$_s_ad0String_Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender__Template.loadRefArgClasses(refargclasses);
}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"findCustomer_wireframe0$l$":keyOverwrite,findCustomer_wireframe0$l$_Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
public String getUniqueName(){
return "findCustomer_wireframe0$l$";
}
public String getStateEncodingOfArgument(){
return "";
}
public String getTemplateSignature(){
return "template findCustomer_wireframe0$l$()";
}
public String getElementsContext(){
if(calledName==null){
return "wireframe";
}
else {
return calledName;
}
}
private  webdsl.generated.domain.Party party_;
public webdsl.generated.domain.Party getParty_(){
return party_;
}
public void setParty_(webdsl.generated.domain.Party party_){
this.party_=party_;
}
private  String organisation_;
public String getOrganisation_(){
return organisation_;
}
public void setOrganisation_(String organisation_){
this.organisation_=organisation_;
}
private  String postcode_;
public String getPostcode_(){
return postcode_;
}
public void setPostcode_(String postcode_){
this.postcode_=postcode_;
}
private  String gender_;
public String getGender_(){
return gender_;
}
public void setGender_(String gender_){
this.gender_=gender_;
}
private  java.util.Set<webdsl.generated.domain.Gender> genderOpts_;
public java.util.Set<webdsl.generated.domain.Gender> getGenderOpts_(){
return genderOpts_;
}
public void setGenderOpts_(java.util.Set<webdsl.generated.domain.Gender> genderOpts_){
this.genderOpts_=genderOpts_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
PrintWriter out=ThreadLocalOut.peek();
int sec2=threadLocalPageCached.getSectionDepth();
if(RENDER_PHASE==phase){
if(sec2>0){
if(sec2>6){
sec2=6;
}
}
else {
sec2=1;
}
out.print("<h"+sec2);
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
utils.TemplateCall.appendWithPadding(classattrs,"header section"+sec2);
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
}
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Customer Details",out,threadLocalPageCached.isRawoutput());
}
catch(NullPointerException npe){
utils.Warning.warn("null reference prevented rendering of template element");
}
catch(IndexOutOfBoundsException ine){
utils.Warning.warn("index out of bounds prevented rendering of template element");
}
}
if(RENDER_PHASE==phase){
out.print("</h"+sec2+">");
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
utils.RenderUtils.printPageString("Find Customer",out,threadLocalPageCached.isRawoutput());
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
ident=(inForLoop?forelementcounter:"")+("form1"+getUniqueId());
threadLocalPageCached.setFormIdent(ident);
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.setInSubmittedForm(true);
threadLocalPageCached.submittedFormId=ident;
}
java.io.StringWriter sw3=null;
java.io.StringWriter sw2=null;
if(RENDER_PHASE==phase){
threadLocalPageCached.formRequiresMultipartEnc=false;
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
sw3=new java.io.StringWriter();
out=new java.io.PrintWriter(sw3);
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
sw2=new java.io.StringWriter();
out=new java.io.PrintWriter(sw2);
ThreadLocalOut.push(out);
out.print(">");
out.print("<input type=\"hidden\" name=\""+ident+"\" value=\"1\" />");
out.print(threadLocalPageCached.getHiddenParams());
}
if(RENDER_PHASE==phase||threadLocalPageCached.inSubmittedForm()){
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall24","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Title:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta0Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Title:\") at ../wire2web.app:54/3");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall26","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Forename:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta1Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Forename:\") at ../wire2web.app:54/3");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall28","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Surname:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta2Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Surname:\") at ../wire2web.app:54/3");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall30","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Organisation:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta3Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Organisation:\") at ../wire2web.app:54/3");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall32","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Postcode:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta4Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Postcode:\") at ../wire2web.app:54/3");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall34","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Phone:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta5Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Phone:\") at ../wire2web.app:54/3");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall36","labelString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"Email:"},"labelString"),new Environment(env).putWithcall("elements#labelString",new utils.TemplateCall("findCustomer_ta6Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"labelString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"labelString(\"Email:\") at ../wire2web.app:54/3");
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
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall38","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"findCustomer_wireframe0$l$_next1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new Environment(env).putWithcall("s",new utils.TemplateCall("findCustomer_wireframe0$l$_s_ad0String_Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"wrapsubmitString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"findCustomer_wireframe0$l$_next1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
try{
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall41","wrapsubmitString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{"findCustomer_wireframe0$l$_back1"+webdsl.generated.functions.getTemplate_.getTemplate_().getUniqueIdNoCache()},"wrapsubmitString"),new Environment(env).putWithcall("s",new utils.TemplateCall("findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender_",getElementsContext(),new Object[]{new RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template1(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template2(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template3(findCustomer_wireframe0$l$_Template.this),new RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template.this)},attrs)),"wrapsubmitString",TemplateCall.EmptyAttrs);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"wrapsubmitString(\"findCustomer_wireframe0$l$_back1\" + getTemplate().getUniqueIdNoCache()) at unknown context");
}
}
if(RENDER_PHASE==phase){
out.print("</form>");
ThreadLocalOut.popChecked(out);
out=ThreadLocalOut.peek();
if(threadLocalPageCached.formRequiresMultipartEnc){
out.write(" enctype=\"multipart/form-data\"");
}
out.write(sw2.toString());
if(threadLocalPageCached.inSubmittedForm()&&threadLocalPageCached.isValidationFormRerender()){
ThreadLocalOut.pop();
if(threadLocalPageCached.submittedFormContent==null){
threadLocalPageCached.submittedFormContent=sw3.toString();
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
party_=webdsl.generated.domain.Party._static_createEmpty_();
organisation_="Organisation";
postcode_="";
gender_="";
genderOpts_=webdsl.generated.functions.findCustomer_typedsetCr0_.findCustomer_typedsetCr0_();
}
}
