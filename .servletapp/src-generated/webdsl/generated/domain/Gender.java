package webdsl.generated.domain;
import java.util.*;import javax.persistence.*;import webdsl.generated.domain.*;import java.io.Serializable;
import utils.*;import java.io.PrintWriter;
import org.webdsl.lang.Environment;
import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Gender")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Gender implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
public void validateDelete(){
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public void validateSave(){
webdsl.generated.domain.ValidationExceptionMultiple mex=this.validateSave_();
java.util.List<webdsl.generated.domain.ValidationException> ex=mex.getExceptions();
java.util.List<utils.ValidationException> exceptions=new java.util.LinkedList<utils.ValidationException>();
for(webdsl.generated.domain.ValidationException v:ex){
exceptions.add(new utils.ValidationException(null,v.getMessage()));
}
if(exceptions.size()>0){
throw new utils.MultipleValidationExceptions(exceptions);
}
}
public static Gender _static_createEmpty_(){
Gender ent=new Gender();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public Gender(){}
transient protected  org.hibernate.bytecode.javassist.FieldHandler fieldHandler;
transient protected  java.util.Set<String> uninitializedLazyProperties=null;
public org.hibernate.bytecode.javassist.FieldHandler getFieldHandler(){
return fieldHandler;
}
public boolean removeUninitializedLazyProperty(String name){
return uninitializedLazyProperties!=null&&uninitializedLazyProperties.remove(name);
}
public void setFieldHandler(org.hibernate.bytecode.javassist.FieldHandler fieldHandler){
this.fieldHandler=fieldHandler;
java.util.Set fieldHandlerUninit=((org.hibernate.intercept.javassist.FieldInterceptorImpl)fieldHandler).getUninitializedFields();
if(fieldHandlerUninit!=null){
this.uninitializedLazyProperties=new java.util.HashSet<String>(fieldHandlerUninit);
}
}
@javax.persistence.Id @org.hibernate.annotations.Type(type="utils.UUIDUserType")@javax.persistence.Column(name="id",length=32)@org.hibernate.search.annotations.DocumentId @org.hibernate.search.annotations.FieldBridge(impl=UUIDFieldBridge.class)protected  java.util.UUID _id=null;
public java.util.UUID getId(){
return _id;
}
public org.webdsl.WebDSLEntity setId(java.util.UUID idarg){
this._id=idarg;
return this;
}
public String getNaturalId(){
return _id.toString();
}
@Version @Column(name="version_opt_lock")protected  Integer _version=0;
public Integer getVersion(){
return _version;
}
public org.webdsl.WebDSLEntity setVersion(Integer v){
this._version=v;
setChanged();
return this;
}
@Transient  boolean versionWasIncreased=false;
public void increaseVersion(){
if(!versionWasIncreased){
_version++;
versionWasIncreased=true;
setChanged();
}
}
@Transient protected  boolean isChanged=false;
public boolean isChanged(){
return isChanged;
}
public void setChanged(){
if(_version>0){
AbstractPageServlet thepage=ThreadLocalPage.get();
if(thepage!=null){
thepage.readOnlyRequestStats=false;
if(!thepage.invalidateAllPageCache){
thepage.invalidateAllPageCache("Gender");
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Gender");
utils.Warning.printSmallStackTrace(5);
}
else {
utils.HibernateUtil.getCurrentSession().setFlushMode(org.hibernate.FlushMode.AUTO);
}
}
if(!isChanged){
isChanged=true;
if(fieldHandler!=null){
((org.hibernate.intercept.FieldInterceptor)fieldHandler).dirty();
}
}
}
@Transient protected  boolean isRequestVar=false;
public boolean isRequestVar(){
return isRequestVar;
}
public void setRequestVar(){
isRequestVar=true;
}
public boolean equals(Object o){
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Gender")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Gender.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Gender.class.cast(o)).getId(),getId());
}
public Gender save(String webdslTypeName){
setVersion(1);
if(ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Gender delete(){
validateDelete();
setChanged();
utils.HibernateUtil.getCurrentSession().delete(this);
return this;
}
public int hashCode(){
if(getId()==null)return super.hashCode();
else return getId().hashCode();
}
public int compareTo(org.webdsl.WebDSLEntity o){
return getId().compareTo(((Gender)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Gender")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected  java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Gender setCreated(java.util.Date newitem){
if(!createdBeingSet){
createdBeingSet=true;
setChanged();
this.setCreatedDateTime_(newitem);
java.util.Date olditem=_created;
_created=newitem;
createdBeingSet=false;
}
return this;
}
public void setCreatedNoEventsOrValidation(java.util.Date newitem){
setChanged();
java.util.Date olditem=_created;
_created=newitem;
}
@Transient  boolean createdBeingSet=false;
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_modified\"")@org.hibernate.annotations.AccessType(value="field")protected  java.util.Date _modified=null;
public java.util.Date getModified(){
return _modified;
}
public boolean isModifiedUninitialized(){
return false;
}
public Gender setModified(java.util.Date newitem){
if(!modifiedBeingSet){
modifiedBeingSet=true;
setChanged();
this.setModifiedDateTime_(newitem);
java.util.Date olditem=_modified;
_modified=newitem;
modifiedBeingSet=false;
}
return this;
}
public void setModifiedNoEventsOrValidation(java.util.Date newitem){
setChanged();
java.util.Date olditem=_modified;
_modified=newitem;
}
@Transient  boolean modifiedBeingSet=false;
@javax.persistence.Column(name="\"_name\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected  String _name="";
public String getName(){
return _name;
}
public boolean isNameUninitialized(){
return false;
}
public Gender setName(String newitem){
if(!nameBeingSet){
nameBeingSet=true;
setChanged();
this.setNameString_(newitem);
String olditem=_name;
_name=newitem;
nameBeingSet=false;
}
return this;
}
public void setNameNoEventsOrValidation(String newitem){
setChanged();
String olditem=_name;
_name=newitem;
}
@Transient  boolean nameBeingSet=false;
public String get_WebDslEntityType(){
return "Gender";
}
public void validateName_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getName(),null)&&(!(org.webdsl.tools.Utils.equal(this.getName().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getName().length()>255)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+255+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateName_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateName_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateName_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Gender").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Gender").list();
}
public static java.util.List<webdsl.generated.domain.Gender> _static_findByName_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Gender as g where g._name = :param16").setParameter("param16",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Gender> _static_findByNameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Gender as g where g._name like :param17").setParameter("param17",s_).list();
}
public static webdsl.generated.domain.Gender _static_load_(java.util.UUID prop_){
return (webdsl.generated.domain.Gender)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Gender",prop_),webdsl.generated.domain.Gender.class);
}
public webdsl.generated.domain.Gender Gender$this_(){
this.Gender_();
return this;
}
public void Gender_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setNameString_(String value_){}
}
