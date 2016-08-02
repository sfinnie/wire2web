package webdsl.generated.templates;
import webdsl.generated.domain.*;@SuppressWarnings("all")public class RefArg_findCustomer_wireframe0$l$_Template0 extends utils.RefArg{
public  findCustomer_wireframe0$l$_Template template;
public RefArg_findCustomer_wireframe0$l$_Template0(findCustomer_wireframe0$l$_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setParty_((webdsl.generated.domain.Party)org.webdsl.tools.Utils.cast(obj,webdsl.generated.domain.Party.class));
return this;
}
public Object get(){
return template.getParty_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Party.$static$all_();
}
}
