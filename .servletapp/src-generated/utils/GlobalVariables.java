package utils;
import java.io.*;import java.util.HashMap;
import javax.servlet.*;import javax.servlet.http.*;import java.util.*;import utils.*;import webdsl.generated.templates.*;import webdsl.generated.domain.*;import org.webdsl.lang.Environment;
@SuppressWarnings({"unused","unchecked"})public class GlobalVariables{
private static  org.hibernate.Session hibSession;
private static  Environment env;
private static  java.io.PrintWriter out=null;
private static  UUID mrId=null;
public static webdsl.generated.domain.Title getMr(org.hibernate.Session hibSession){
webdsl.generated.domain.Title mr=(webdsl.generated.domain.Title)hibSession.load(webdsl.generated.domain.Title.class,mrId);
return mr;
}
private static  UUID mrsId=null;
public static webdsl.generated.domain.Title getMrs(org.hibernate.Session hibSession){
webdsl.generated.domain.Title mrs=(webdsl.generated.domain.Title)hibSession.load(webdsl.generated.domain.Title.class,mrsId);
return mrs;
}
private static  UUID missId=null;
public static webdsl.generated.domain.Title getMiss(org.hibernate.Session hibSession){
webdsl.generated.domain.Title miss=(webdsl.generated.domain.Title)hibSession.load(webdsl.generated.domain.Title.class,missId);
return miss;
}
private static  UUID drId=null;
public static webdsl.generated.domain.Title getDr(org.hibernate.Session hibSession){
webdsl.generated.domain.Title dr=(webdsl.generated.domain.Title)hibSession.load(webdsl.generated.domain.Title.class,drId);
return dr;
}
private static  webdsl.generated.domain.Title mr=null;
private static void globalDeclarationMr(){
try{
mr=(webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Title._static_createEmpty_().Title$this_(),webdsl.generated.domain.Title.class)).setName("Mr"),webdsl.generated.domain.Title.class);
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationMrPersist(){
utils.HibernateUtil.getCurrentSession().save(mr);
ApplicationContextProperty id0=new ApplicationContextProperty();
id0.setName("mr");
id0.setDatabaseId(mr.getId());
utils.HibernateUtil.getCurrentSession().save(id0);
GlobalVariables.mrId=id0.getDatabaseId();
mr.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
mr=null;
}
private static  webdsl.generated.domain.Title mrs=null;
private static void globalDeclarationMrs(){
try{
mrs=(webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Title._static_createEmpty_().Title$this_(),webdsl.generated.domain.Title.class)).setName("Mrs"),webdsl.generated.domain.Title.class);
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationMrsPersist(){
utils.HibernateUtil.getCurrentSession().save(mrs);
ApplicationContextProperty id1=new ApplicationContextProperty();
id1.setName("mrs");
id1.setDatabaseId(mrs.getId());
utils.HibernateUtil.getCurrentSession().save(id1);
GlobalVariables.mrsId=id1.getDatabaseId();
mrs.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
mrs=null;
}
private static  webdsl.generated.domain.Title miss=null;
private static void globalDeclarationMiss(){
try{
miss=(webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Title._static_createEmpty_().Title$this_(),webdsl.generated.domain.Title.class)).setName("Miss"),webdsl.generated.domain.Title.class);
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationMissPersist(){
utils.HibernateUtil.getCurrentSession().save(miss);
ApplicationContextProperty id2=new ApplicationContextProperty();
id2.setName("miss");
id2.setDatabaseId(miss.getId());
utils.HibernateUtil.getCurrentSession().save(id2);
GlobalVariables.missId=id2.getDatabaseId();
miss.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
miss=null;
}
private static  webdsl.generated.domain.Title dr=null;
private static void globalDeclarationDr(){
try{
dr=(webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Title)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Title._static_createEmpty_().Title$this_(),webdsl.generated.domain.Title.class)).setName("Dr"),webdsl.generated.domain.Title.class);
}
catch(Exception iea){
throw new RuntimeException("Catched in globalDeclaration: ",iea);
}
}
private static void globalDeclarationDrPersist(){
utils.HibernateUtil.getCurrentSession().save(dr);
ApplicationContextProperty id3=new ApplicationContextProperty();
id3.setName("dr");
id3.setDatabaseId(dr.getId());
utils.HibernateUtil.getCurrentSession().save(id3);
GlobalVariables.drId=id3.getDatabaseId();
dr.setVersion(1);
utils.HibernateUtil.getCurrentSession().flush();
dr=null;
}
static boolean applicationContextPropertyExists(String name,List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
public static  boolean globalvarsChecked=false;
public static void forceLoad(){
globalvarsChecked=false;
load();
}
public static void load(){
if(!globalvarsChecked){
out=new java.io.PrintWriter(System.out);
ThreadLocalOut.push(out);
mr=webdsl.generated.domain.Title._static_createEmpty_();
mrs=webdsl.generated.domain.Title._static_createEmpty_();
miss=webdsl.generated.domain.Title._static_createEmpty_();
dr=webdsl.generated.domain.Title._static_createEmpty_();
org.hibernate.Session hibSession=utils.HibernateUtil.getCurrentSession();
AbstractPageServlet ps=ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
List<ApplicationContextProperty> res=q.list();
if(!applicationContextPropertyExists("mr",res)){
env.putGlobalVariable("mr",mr);
}
if(!applicationContextPropertyExists("mrs",res)){
env.putGlobalVariable("mrs",mrs);
}
if(!applicationContextPropertyExists("miss",res)){
env.putGlobalVariable("miss",miss);
}
if(!applicationContextPropertyExists("dr",res)){
env.putGlobalVariable("dr",dr);
}
if(!applicationContextPropertyExists("mr",res))globalDeclarationMr();
if(!applicationContextPropertyExists("mrs",res))globalDeclarationMrs();
if(!applicationContextPropertyExists("miss",res))globalDeclarationMiss();
if(!applicationContextPropertyExists("dr",res))globalDeclarationDr();
if(!applicationContextPropertyExists("mr",res))globalDeclarationMrPersist();
if(!applicationContextPropertyExists("mrs",res))globalDeclarationMrsPersist();
if(!applicationContextPropertyExists("miss",res))globalDeclarationMissPersist();
if(!applicationContextPropertyExists("dr",res))globalDeclarationDrPersist();
org.hibernate.Query q2=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty");
List<ApplicationContextProperty> results=q2.list();
for(ApplicationContextProperty a:results){
if(a.getName().equals("mr")){
mrId=a.getDatabaseId();
}
if(a.getName().equals("mrs")){
mrsId=a.getDatabaseId();
}
if(a.getName().equals("miss")){
missId=a.getDatabaseId();
}
if(a.getName().equals("dr")){
drId=a.getDatabaseId();
}
}
hibSession=null;
ThreadLocalOut.popChecked(out);
out=null;
globalvarsChecked=true;
}
}
public static boolean initGlobalVars(Environment env,org.hibernate.Session hibSession){
env.putGlobalVariable("mr",GlobalVariables.getMr(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("mr")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("mrs",GlobalVariables.getMrs(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("mrs")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("miss",GlobalVariables.getMiss(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("miss")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
env.putGlobalVariable("dr",GlobalVariables.getDr(utils.HibernateUtil.getCurrentSession()));
if(env.getGlobalVariable("dr")==null){
utils.HibernateUtil.getCurrentSession().getTransaction().commit();
return false;
}
return true;
}
}
