package webdsl.generated.templates;
import webdsl.generated.domain.*;import utils.*;@SuppressWarnings("all")public class RefArg_inputBool_1_submitComplaint_ta2Complaintpc0 extends utils.RefArg{
public  webdsl.generated.domain.Complaint complaint_;
public RefArg_inputBool_1_submitComplaint_ta2Complaintpc0(){}
public RefArg_inputBool_1_submitComplaint_ta2Complaintpc0(Object complaint_){
this.complaint_=(webdsl.generated.domain.Complaint)complaint_;
}
public webdsl.generated.domain.Complaint set(Object obj){
complaint_.setResponse((Boolean)org.webdsl.tools.Utils.cast(obj,Boolean.class));
return complaint_;
}
public Object get(){
return (Boolean)complaint_.getResponse();
}
public void load(String uuid){
if(uuid.contains(":")){
complaint_=(webdsl.generated.domain.Complaint)utils.PageParamLoad.loadEntityFromParam(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain",uuid);
}
else {
try{
Class<?> cl=org.hibernate.util.ReflectHelper.classForName("webdsl.generated.domain.Complaint");
complaint_=(webdsl.generated.domain.Complaint)utils.HibernateUtil.getCurrentSession().load(cl,java.util.UUID.fromString(uuid));
}
catch(ClassNotFoundException cnfe){
throw new RuntimeException(cnfe);
}
}
}
public String getUrlString(){
return complaint_.getId()+"!"+"RefArg_inputBool_1_submitComplaint_ta2Complaintpc0";
}
public String get_WebDslEntityType(){
if(get()==null){
return "Bool";
}
else {
return ((org.webdsl.WebDSLEntity)get()).get_WebDslEntityType();
}
}
public org.webdsl.WebDSLEntity getEntity(){
return complaint_;
}
public void validate(String location,java.util.List<utils.ValidationException> exceptions){
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
complaint_.validateResponse_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
exceptions.add(new utils.ValidationException(location,v.getMessage()));
}
}
public java.util.List<String> getValidationErrors(){
java.util.List<String> result=new java.util.ArrayList<String>();
webdsl.generated.domain.ValidationExceptionMultiple vem=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
complaint_.validateResponse_internalValidationExceptionMultiple_(vem);
for(webdsl.generated.domain.ValidationException v:vem.getExceptions()){
result.add(v.getMessage());
}
return result;
}
public org.webdsl.lang.ReflectionProperty getReflectionProperty(){
return utils.ThreadLocalServlet.get().getReflectionEntityByName("Complaint").getPropertyByName("response");
}
public java.util.List<Object> getAllowed(){
return getReflectionProperty().getAllowed(complaint_);
}
}
