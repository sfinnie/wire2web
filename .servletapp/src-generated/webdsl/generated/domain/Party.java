package webdsl.generated.domain;
import java.util.*;import javax.persistence.*;import webdsl.generated.domain.*;import java.io.Serializable;
import utils.*;import java.io.PrintWriter;
import org.webdsl.lang.Environment;
import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Party")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Party implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public static Party _static_createEmpty_(){
Party ent=new Party();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public Party(){}
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
thepage.invalidateAllPageCache("Party");
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Party");
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Party")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Party.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Party.class.cast(o)).getId(),getId());
}
public Party save(String webdslTypeName){
setVersion(1);
if(ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Party delete(){
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
return getId().compareTo(((Party)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Party")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected  java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Party setCreated(java.util.Date newitem){
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
public Party setModified(java.util.Date newitem){
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
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Party_title\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL,org.hibernate.annotations.CascadeType.DELETE_ORPHAN})@org.hibernate.annotations.AccessType(value="field")protected  webdsl.generated.domain.Title _title=null;
public webdsl.generated.domain.Title getTitle(){
return _title;
}
public boolean isTitleUninitialized(){
return _title instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_title).getHibernateLazyInitializer().isUninitialized();
}
public Party setTitle(webdsl.generated.domain.Title newitem){
if(!titleBeingSet){
titleBeingSet=true;
setChanged();
this.setTitleTitle_(newitem);
webdsl.generated.domain.Title olditem=_title;
_title=newitem;
titleBeingSet=false;
}
return this;
}
public void setTitleNoEventsOrValidation(webdsl.generated.domain.Title newitem){
setChanged();
webdsl.generated.domain.Title olditem=_title;
_title=newitem;
}
@Transient  boolean titleBeingSet=false;
@javax.persistence.Column(name="\"_forename\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected  String _forename="";
public String getForename(){
return _forename;
}
public boolean isForenameUninitialized(){
return false;
}
public Party setForename(String newitem){
if(!forenameBeingSet){
forenameBeingSet=true;
setChanged();
this.setForenameString_(newitem);
String olditem=_forename;
_forename=newitem;
forenameBeingSet=false;
}
return this;
}
public void setForenameNoEventsOrValidation(String newitem){
setChanged();
String olditem=_forename;
_forename=newitem;
}
@Transient  boolean forenameBeingSet=false;
@javax.persistence.Column(name="\"_surname\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected  String _surname="";
public String getSurname(){
return _surname;
}
public boolean isSurnameUninitialized(){
return false;
}
public Party setSurname(String newitem){
if(!surnameBeingSet){
surnameBeingSet=true;
setChanged();
this.setSurnameString_(newitem);
String olditem=_surname;
_surname=newitem;
surnameBeingSet=false;
}
return this;
}
public void setSurnameNoEventsOrValidation(String newitem){
setChanged();
String olditem=_surname;
_surname=newitem;
}
@Transient  boolean surnameBeingSet=false;
@javax.persistence.Column(name="\"_email\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected  String _email="";
public String getEmail(){
return _email;
}
public boolean isEmailUninitialized(){
return false;
}
public Party setEmail(String newitem){
if(!emailBeingSet){
emailBeingSet=true;
setChanged();
this.setEmailEmail_(newitem);
String olditem=_email;
_email=newitem;
emailBeingSet=false;
}
return this;
}
public void setEmailNoEventsOrValidation(String newitem){
setChanged();
String olditem=_email;
_email=newitem;
}
@Transient  boolean emailBeingSet=false;
@javax.persistence.Column(name="\"_phone\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected  String _phone="";
public String getPhone(){
return _phone;
}
public boolean isPhoneUninitialized(){
return false;
}
public Party setPhone(String newitem){
if(!phoneBeingSet){
phoneBeingSet=true;
setChanged();
this.setPhoneString_(newitem);
String olditem=_phone;
_phone=newitem;
phoneBeingSet=false;
}
return this;
}
public void setPhoneNoEventsOrValidation(String newitem){
setChanged();
String olditem=_phone;
_phone=newitem;
}
@Transient  boolean phoneBeingSet=false;
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "Party";
}
public java.util.List<webdsl.generated.domain.Title> allowedTitle_(){
return (java.util.List<webdsl.generated.domain.Title>)(java.util.List<?>)webdsl.generated.domain.Title.$static$all_();
}
public void validatePhone_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getPhone(),null)&&(!(org.webdsl.tools.Utils.equal(this.getPhone().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getPhone().length()>255)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+255+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validatePhone_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validatePhone_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateEmail_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getEmail(),null)&&(!(org.webdsl.tools.Utils.equal(this.getEmail().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getEmail().length()>255)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+255+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateEmail_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateEmail_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSurname_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getSurname(),null)&&(!(org.webdsl.tools.Utils.equal(this.getSurname().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getSurname().length()>255)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+255+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSurname_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSurname_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateForename_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getForename(),null)&&(!(org.webdsl.tools.Utils.equal(this.getForename().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getForename().length()>255)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+255+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateForename_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateForename_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateTitle_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateTitle_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateTitle_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateEmail_internalValidationExceptionMultiple_(v_);
this.validateForename_internalValidationExceptionMultiple_(v_);
this.validatePhone_internalValidationExceptionMultiple_(v_);
this.validateSurname_internalValidationExceptionMultiple_(v_);
this.validateTitle_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Party").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Party").list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findByForename_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._forename = :param8").setParameter("param8",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findByForenameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._forename like :param9").setParameter("param9",s_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findBySurname_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._surname = :param10").setParameter("param10",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findBySurnameLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._surname like :param11").setParameter("param11",s_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findByEmail_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._email = :param12").setParameter("param12",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findByEmailLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._email like :param13").setParameter("param13",s_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findByPhone_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._phone = :param14").setParameter("param14",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Party> _static_findByPhoneLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Party as g where g._phone like :param15").setParameter("param15",s_).list();
}
public static webdsl.generated.domain.Party _static_load_(java.util.UUID prop_){
return (webdsl.generated.domain.Party)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Party",prop_),webdsl.generated.domain.Party.class);
}
public webdsl.generated.domain.Party Party$this_(){
this.Party_();
return this;
}
public void Party_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setTitleTitle_(webdsl.generated.domain.Title value_){}
public void setForenameString_(String value_){}
public void setSurnameString_(String value_){}
public void setEmailEmail_(String value_){}
public void setPhoneString_(String value_){}
}
