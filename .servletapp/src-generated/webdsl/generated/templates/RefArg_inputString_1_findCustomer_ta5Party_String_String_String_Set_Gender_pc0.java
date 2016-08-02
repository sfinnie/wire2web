package webdsl.generated.templates;
import webdsl.generated.domain.*;import utils.*;@SuppressWarnings("all")public class RefArg_inputString_1_findCustomer_ta5Party_String_String_String_Set_Gender_pc0 extends utils.RefArg{
public  webdsl.generated.domain.Party party_;
public RefArg_inputString_1_findCustomer_ta5Party_String_String_String_Set_Gender_pc0(){}
public RefArg_inputString_1_findCustomer_ta5Party_String_String_String_Set_Gender_pc0(Object party_){
this.party_=(webdsl.generated.domain.Party)party_;
}
public webdsl.generated.domain.Party set(Object obj){
party_.setPhone((String)org.webdsl.tools.Utils.cast(obj,String.class));
return party_;
}
public Object get(){
return (String)party_.getPhone();
}
public void load(String uuid){
if(uuid.contains(":")){
party_=(webdsl.generated.domain.Party)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.Party");
party_=(webdsl.generated.domain.Party)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return party_.getId()+"!"+"RefArg_inputString_1_findCustomer_ta5Party_String_String_String_Set_Gender_pc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "String";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return party_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
party_.validatePhone_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
party_.validatePhone_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("Party").getPropertyByName("phone");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(party_);
}
}
