package webdsl.generated.templates;
import webdsl.generated.domain.*;@SuppressWarnings("all")public class RefArg_submitComplaint_wireframe0$l$_Template0 extends utils.RefArg{
public  submitComplaint_wireframe0$l$_Template template;
public RefArg_submitComplaint_wireframe0$l$_Template0(submitComplaint_wireframe0$l$_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setComplaint_((webdsl.generated.domain.Complaint)org.webdsl.tools.Utils.cast(obj,webdsl.generated.domain.Complaint.class));
return this;
}
public Object get(){
return template.getComplaint_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Complaint.$static$all_();
}
}
