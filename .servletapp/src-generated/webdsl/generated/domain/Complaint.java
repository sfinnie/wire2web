package webdsl.generated.domain;
import java.util.*;import javax.persistence.*;import webdsl.generated.domain.*;import java.io.Serializable;
import utils.*;import java.io.PrintWriter;
import org.webdsl.lang.Environment;
import webdsl.generated.templates.*;public @javax.persistence.Entity @javax.persistence.Table(name="_Complaint")@org.hibernate.annotations.FilterDefs({})@org.hibernate.annotations.Persister(impl=utils.SingleTableEntityPersister.class)@javax.persistence.DiscriminatorColumn(name="DISCRIMINATOR",discriminatorType=javax.persistence.DiscriminatorType.STRING,length=255)@SuppressWarnings("all")class Complaint implements org.webdsl.WebDSLEntity,org.hibernate.bytecode.javassist.FieldHandled,org.webdsl.search.NoDynamicSearchFields{
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
public static Complaint _static_createEmpty_(){
Complaint ent=new Complaint();
ent.setId(java.util.UUID.randomUUID());
return ent;
}
public Complaint(){}
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
thepage.invalidateAllPageCache("Complaint");
}
}
if(thepage!=null&&thepage.isReadOnly){
org.webdsl.logging.Logger.warn("page or ajax template is forced to be read-only, but a persisted entity property is attempted to be updated in "+"Complaint");
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
return o!=null&&o instanceof org.webdsl.WebDSLEntity&&((org.webdsl.WebDSLEntity)o).instanceOf("Complaint")&&org.webdsl.tools.Utils.equal((o instanceof org.hibernate.proxy.HibernateProxy?Complaint.class.cast(((org.hibernate.proxy.HibernateProxy)o).getHibernateLazyInitializer().getImplementation()):Complaint.class.cast(o)).getId(),getId());
}
public Complaint save(String webdslTypeName){
setVersion(1);
if(ThreadLocalPage.isReadOnly()){
org.webdsl.logging.Logger.error("page or ajax template is forced to be read-only, but an entity of type '"+webdslTypeName+"' is saved");
utils.Warning.printSmallStackTrace(5);
}
utils.HibernateUtil.getCurrentSession().save(this);
return this;
}
public Complaint delete(){
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
return getId().compareTo(((Complaint)o).getId());
}
public boolean isInstance(Class<?> c){
return c.isInstance(this);
}
public boolean instanceOf(String s){
return s.equals("Complaint")||s.equals("Object")||s.equals("Entity");
}
@Temporal(TemporalType.TIMESTAMP)@javax.persistence.Column(name="\"_created\"")@org.hibernate.annotations.AccessType(value="field")protected  java.util.Date _created=null;
public java.util.Date getCreated(){
return _created;
}
public boolean isCreatedUninitialized(){
return false;
}
public Complaint setCreated(java.util.Date newitem){
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
public Complaint setModified(java.util.Date newitem){
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
@javax.persistence.Column(name="\"_summary\"",length=255)@org.hibernate.annotations.AccessType(value="field")protected  String _summary="";
public String getSummary(){
return _summary;
}
public boolean isSummaryUninitialized(){
return false;
}
public Complaint setSummary(String newitem){
if(!summaryBeingSet){
summaryBeingSet=true;
setChanged();
this.setSummaryString_(newitem);
String olditem=_summary;
_summary=newitem;
summaryBeingSet=false;
}
return this;
}
public void setSummaryNoEventsOrValidation(String newitem){
setChanged();
String olditem=_summary;
_summary=newitem;
}
@Transient  boolean summaryBeingSet=false;
@javax.persistence.Column(name="\"_details\"",length=1000000)@org.hibernate.annotations.AccessType(value="field")protected  String _details="";
public String getDetails(){
return _details;
}
public boolean isDetailsUninitialized(){
return false;
}
public Complaint setDetails(String newitem){
if(!detailsBeingSet){
detailsBeingSet=true;
setChanged();
this.setDetailsText_(newitem);
String olditem=_details;
_details=newitem;
detailsBeingSet=false;
}
return this;
}
public void setDetailsNoEventsOrValidation(String newitem){
setChanged();
String olditem=_details;
_details=newitem;
}
@Transient  boolean detailsBeingSet=false;
@javax.persistence.Column(name="\"_response\"")@org.hibernate.annotations.AccessType(value="field")protected  Boolean _response=false;
public Boolean getResponse(){
return _response;
}
public boolean isResponseUninitialized(){
return false;
}
public Complaint setResponse(Boolean newitem){
if(!responseBeingSet){
responseBeingSet=true;
setChanged();
this.setResponseBool_(newitem);
Boolean olditem=_response;
_response=newitem;
responseBeingSet=false;
}
return this;
}
public void setResponseNoEventsOrValidation(Boolean newitem){
setChanged();
Boolean olditem=_response;
_response=newitem;
}
@Transient  boolean responseBeingSet=false;
@ManyToOne(fetch=javax.persistence.FetchType.LAZY)@JoinColumn(name="\"Complaint_complainant\"")@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST,org.hibernate.annotations.CascadeType.SAVE_UPDATE,org.hibernate.annotations.CascadeType.MERGE})@org.hibernate.annotations.AccessType(value="field")protected  webdsl.generated.domain.Party _complainant=null;
public webdsl.generated.domain.Party getComplainant(){
return _complainant;
}
public boolean isComplainantUninitialized(){
return _complainant instanceof org.hibernate.proxy.HibernateProxy&&((org.hibernate.proxy.HibernateProxy)_complainant).getHibernateLazyInitializer().isUninitialized();
}
public Complaint setComplainant(webdsl.generated.domain.Party newitem){
if(!complainantBeingSet){
complainantBeingSet=true;
setChanged();
this.setComplainantParty_(newitem);
webdsl.generated.domain.Party olditem=_complainant;
_complainant=newitem;
complainantBeingSet=false;
}
return this;
}
public void setComplainantNoEventsOrValidation(webdsl.generated.domain.Party newitem){
setChanged();
webdsl.generated.domain.Party olditem=_complainant;
_complainant=newitem;
}
@Transient  boolean complainantBeingSet=false;
public String getName(){
if(getId()!=null){
return getId().toString();
}
else {
return "";
}
}
public String get_WebDslEntityType(){
return "Complaint";
}
public java.util.List<webdsl.generated.domain.Party> allowedComplainant_(){
return (java.util.List<webdsl.generated.domain.Party>)(java.util.List<?>)webdsl.generated.domain.Party.$static$all_();
}
public void validateComplainant_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateComplainant_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateComplainant_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateResponse_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){}
public webdsl.generated.domain.ValidationExceptionMultiple validateResponse_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateResponse_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateDetails_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getDetails(),null)&&(!(org.webdsl.tools.Utils.equal(this.getDetails().length(),null)||org.webdsl.tools.Utils.equal(1000000,null))&&this.getDetails().length()>1000000)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+1000000+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateDetails_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateDetails_internalValidationExceptionMultiple_(v_);
return v_;
}
public void validateSummary_internalValidationExceptionMultiple_(webdsl.generated.domain.ValidationExceptionMultiple v_){
if(!org.webdsl.tools.Utils.equal(this.getSummary(),null)&&(!(org.webdsl.tools.Utils.equal(this.getSummary().length(),null)||org.webdsl.tools.Utils.equal(255,null))&&this.getSummary().length()>255)){
v_.addToExceptions((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.ValidationException)org.webdsl.tools.Utils.cast(webdsl.generated.domain.ValidationException._static_createEmpty_().ValidationException$this_(),webdsl.generated.domain.ValidationException.class)).setMessage("Value exceeds maximum length ("+255+")"),webdsl.generated.domain.ValidationException.class));
}
else {}
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSummary_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateSummary_internalValidationExceptionMultiple_(v_);
return v_;
}
public webdsl.generated.domain.ValidationExceptionMultiple validateSave_(){
webdsl.generated.domain.ValidationExceptionMultiple v_=webdsl.generated.domain.ValidationExceptionMultiple._static_createEmpty_();
this.validateComplainant_internalValidationExceptionMultiple_(v_);
this.validateDetails_internalValidationExceptionMultiple_(v_);
this.validateResponse_internalValidationExceptionMultiple_(v_);
this.validateSummary_internalValidationExceptionMultiple_(v_);
return v_;
}
public static java.util.List<org.webdsl.WebDSLEntity> $static$all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Complaint").list();
}
public java.util.List<org.webdsl.WebDSLEntity> all_(){
return utils.HibernateUtil.getCurrentSession().createQuery("from Complaint").list();
}
public static java.util.List<webdsl.generated.domain.Complaint> _static_findBySummary_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Complaint as g where g._summary = :param18").setParameter("param18",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Complaint> _static_findBySummaryLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Complaint as g where g._summary like :param19").setParameter("param19",s_).list();
}
public static java.util.List<webdsl.generated.domain.Complaint> _static_findByDetails_(String prop_){
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Complaint as g where g._details = :param20").setParameter("param20",prop_).list();
}
public static java.util.List<webdsl.generated.domain.Complaint> _static_findByDetailsLike_(String prop_){
String s_="%"+prop_+"%";
return utils.HibernateUtil.getCurrentSession().createQuery("select g from Complaint as g where g._details like :param21").setParameter("param21",s_).list();
}
public static webdsl.generated.domain.Complaint _static_load_(java.util.UUID prop_){
return (webdsl.generated.domain.Complaint)org.webdsl.tools.Utils.cast(utils.PageParamLoad.loadEntity(utils.HibernateUtil.getCurrentSession(),"webdsl.generated.domain"+"."+"Complaint",prop_),webdsl.generated.domain.Complaint.class);
}
public webdsl.generated.domain.Complaint Complaint$this_(){
this.Complaint_();
return this;
}
public void Complaint_(){}
public void setCreatedDateTime_(java.util.Date value_){}
public void setModifiedDateTime_(java.util.Date value_){}
public void setSummaryString_(String value_){}
public void setDetailsText_(String value_){}
public void setResponseBool_(Boolean value_){}
public void setComplainantParty_(webdsl.generated.domain.Party value_){}
}
