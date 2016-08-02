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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender__Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender_":keyOverwrite,findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender__Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
protected void storeArguments(Object[] args){
findCustomer_wireframe0$l$_back10_=(String)args[0];
party_=(utils.RefArg)args[1];
organisation_=(utils.RefArg)args[2];
postcode_=(utils.RefArg)args[3];
gender_=(utils.RefArg)args[4];
genderOpts_=(utils.RefArg)args[5];
}
public String getUniqueName(){
return "findCustomer_wireframe0$l$_s_ad1String_Party_String_String_String_Set_Gender_";
}
public String getStateEncodingOfArgument(){
return ""+("ref"+("ref"+("ref"+("ref"+"ref"))));
}
public String getTemplateSignature(){
return "template findCustomer_wireframe0$l$_s_ad1(findCustomer_wireframe0$l$_back10 : String, party : Ref<Party>, organisation : Ref<String>, postcode : Ref<String>, gender : Ref<String>, genderOpts : Ref<Set<Gender>>)";
}
public String getElementsContext(){
if(calledName==null){
return "s";
}
else {
return calledName;
}
}
private  String findCustomer_wireframe0$l$_back10_="";
public void setFindCustomer_wireframe0$l$_back10_(String findCustomer_wireframe0$l$_back10_){
this.findCustomer_wireframe0$l$_back10_=findCustomer_wireframe0$l$_back10_;
}
public String getFindCustomer_wireframe0$l$_back10_(){
return findCustomer_wireframe0$l$_back10_;
}
private  utils.RefArg party_=null;
public void setParty_(utils.RefArg party_){
this.party_=party_;
}
public utils.RefArg getParty_(){
return party_;
}
private  utils.RefArg organisation_=null;
public void setOrganisation_(utils.RefArg organisation_){
this.organisation_=organisation_;
}
public utils.RefArg getOrganisation_(){
return organisation_;
}
private  utils.RefArg postcode_=null;
public void setPostcode_(utils.RefArg postcode_){
this.postcode_=postcode_;
}
public utils.RefArg getPostcode_(){
return postcode_;
}
private  utils.RefArg gender_=null;
public void setGender_(utils.RefArg gender_){
this.gender_=gender_;
}
public utils.RefArg getGender_(){
return gender_;
}
private  utils.RefArg genderOpts_=null;
public void setGenderOpts_(utils.RefArg genderOpts_){
this.genderOpts_=genderOpts_;
}
public utils.RefArg getGenderOpts_(){
return genderOpts_;
}
protected void handlePhase(int phase){
String ident="";
String forelementcounter="0";
int fallbackcounter=0;
boolean inForLoop=false;
int forLoopCounter=0;
PrintWriter out=ThreadLocalOut.peek();
switch(phase){
case DATABIND_PHASE:ident=findCustomer_wireframe0$l$_back10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
threadLocalPageCached.actionToBeExecutedHasDisabledValidation=findCustomer_back0.isValidationDisabled();
}
break;case ACTION_PHASE:ident=findCustomer_wireframe0$l$_back10_;
if(threadLocalPageCached.getParammap().get(ident)!=null){
if(isAjaxSubmitRequired(false)){
threadLocalPageCached.enableAjaxActionExecuted();
}
new findCustomer_back0().run(threadLocalPageCached,getEnv(),getElementsContext(),ident);
}
break;case RENDER_PHASE:if(isAjaxSubmitRequired(false)){
out.print("<button submitid=\""+findCustomer_wireframe0$l$_back10_+"\" onclick='javascript:serverInvoke(\""+threadLocalPageCached.getAbsoluteLocation()+"/"+threadLocalPageCached.getActionTarget()+threadLocalPageCached.getExtraQueryAruments("?")+"\",\""+findCustomer_wireframe0$l$_back10_+"\", ["+threadLocalPageCached.getHiddenPostParamsJson()+"],\""+threadLocalPageCached.getFormIdent()+"\", this, "+"true"+"); return false;'");
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
utils.TemplateCall.appendWithPadding(classattrs,"float-left clear-left");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Back",out,threadLocalPageCached.isRawoutput());
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
out.print("<button name=\""+findCustomer_wireframe0$l$_back10_+"\"");
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
utils.TemplateCall.appendWithPadding(classattrs,"float-left clear-left");
if(!ignorecols.contains("submit")){
AttributeCollectionLookup.getAttributeCollection("submit",classattrs,styleattrs,ignore,ignorecols,out);
}
utils.TemplateCall.printClassStyleAttributes(classattrs,styleattrs,out);
}
out.print(">");
if(RENDER_PHASE==phase){
try{
utils.RenderUtils.printPageString("Back",out,threadLocalPageCached.isRawoutput());
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
