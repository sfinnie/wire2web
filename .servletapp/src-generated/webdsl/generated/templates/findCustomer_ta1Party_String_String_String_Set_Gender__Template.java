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
import webdsl.generated.domain.*;import webdsl.generated.actions.*;@SuppressWarnings("all")public class findCustomer_ta1Party_String_String_String_Set_Gender__Template extends TemplateServlet{
public static void loadLiftedTemplateMap(org.webdsl.lang.Environment staticEnv){}
public static void loadRefArgClasses(Map<String,Class<?>> refargclasses){
refargclasses.put("RefArg_inputString_1_findCustomer_ta1Party_String_String_String_Set_Gender_pc0",RefArg_inputString_1_findCustomer_ta1Party_String_String_String_Set_Gender_pc0.class);
}
public static Environment loadTemplateMap(org.webdsl.lang.Environment staticEnv){
loadTemplateMap(null,staticEnv);
return staticEnv;
}
public static Environment loadTemplateMap(String keyOverwrite,org.webdsl.lang.Environment staticEnv){
staticEnv.putTemplate(keyOverwrite==null?"findCustomer_ta1Party_String_String_String_Set_Gender_":keyOverwrite,findCustomer_ta1Party_String_String_String_Set_Gender__Template.class);
loadLiftedTemplateMap(staticEnv);
return staticEnv;
}
protected void storeArguments(Object[] args){
party_=(utils.RefArg)args[0];
organisation_=(utils.RefArg)args[1];
postcode_=(utils.RefArg)args[2];
gender_=(utils.RefArg)args[3];
genderOpts_=(utils.RefArg)args[4];
}
public String getUniqueName(){
return "findCustomer_ta1Party_String_String_String_Set_Gender_";
}
public String getStateEncodingOfArgument(){
return ""+("ref"+("ref"+("ref"+("ref"+"ref"))));
}
public String getTemplateSignature(){
return "template findCustomer_ta1(party : Ref<Party>, organisation : Ref<String>, postcode : Ref<String>, gender : Ref<String>, genderOpts : Ref<Set<Gender>>)";
}
public String getElementsContext(){
if(calledName==null){
return "wireframe";
}
else {
return calledName;
}
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
try{
if(DATABIND_PHASE==phase){}
if(ACTION_PHASE==phase){}
Map<String,String> attrsmapout=new HashMap<String,String>();
utils.TemplateCall.putAttributeMergeClassOrStyle(attrsmapout,"class","medium-text");
handleTemplateCall(phase,inForLoop,forelementcounter,"tcall54","inputString",env.addExtraLocalTemplateArgumentsToArguments(new Object[]{new RefArg_inputString_1_findCustomer_ta1Party_String_String_String_Set_Gender_pc0((webdsl.generated.domain.Party)party_.get())},"inputString"),new Environment(env).putWithcall("elements#inputString",new utils.TemplateCall("elementsempty",null,null,null)),"inputString",attrsmapout);
}
catch(RuntimeException ex){
printTemplateCallException(ex,"inputString(party.forename) at ../wire2web.app:71/25");
}
}
}
