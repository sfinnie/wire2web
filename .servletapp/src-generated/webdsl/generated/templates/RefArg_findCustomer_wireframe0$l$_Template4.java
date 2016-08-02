package webdsl.generated.templates;
import webdsl.generated.domain.*;@SuppressWarnings("all")public class RefArg_findCustomer_wireframe0$l$_Template4 extends utils.RefArg{
public  findCustomer_wireframe0$l$_Template template;
public RefArg_findCustomer_wireframe0$l$_Template4(findCustomer_wireframe0$l$_Template templ){
this.template=templ;
}
public Object set(Object obj){
template.setGenderOpts_((java.util.Set<webdsl.generated.domain.Gender>)obj);
return this;
}
public Object get(){
return template.getGenderOpts_();
}
public java.util.List<Object> getAllowed(){
return (java.util.List<Object>)(java.util.List<?>)webdsl.generated.domain.Gender.$static$all_();
}
}
