package utils;
import java.io.*;import java.util.HashMap;
import javax.servlet.*;import javax.servlet.http.*;import java.util.*;import utils.*;import webdsl.generated.templates.*;import webdsl.generated.domain.*;import org.webdsl.lang.Environment;
public @SuppressWarnings({"unused","unchecked"})class GlobalInit{
private static  webdsl.generated.domain.Title mr=null;
private static  webdsl.generated.domain.Title mrs=null;
private static  webdsl.generated.domain.Title miss=null;
private static  webdsl.generated.domain.Title dr=null;
private static  org.hibernate.Session hibSession;
static boolean applicationContextPropertyExists(String name,List<ApplicationContextProperty> res){
for(ApplicationContextProperty a:res){
if(a.getName().equals(name))return true;
}
return false;
}
static  java.io.PrintWriter out;
private static  Environment env;
public static  boolean initChecked=false;
public static void forceLoad(){
initChecked=false;
load();
}
public static void load(){
if(!initChecked){
hibSession=utils.HibernateUtil.getCurrentSession();
java.io.PrintWriter out=new java.io.PrintWriter(System.out);
ThreadLocalOut.push(out);
AbstractPageServlet ps=ThreadLocalPage.get();
env=ps.envGlobalAndSession;
org.hibernate.Query q=utils.HibernateUtil.getCurrentSession().createQuery("from ApplicationContextProperty where name = '__global__init__'");
List<ApplicationContextProperty> res=q.list();
if(res.isEmpty()){
initialize();
initActions();
ApplicationContextProperty flag=new ApplicationContextProperty();
flag.setName("__global__init__");
utils.HibernateUtil.getCurrentSession().save(flag);
}
utils.HibernateUtil.getCurrentSession().flush();
ThreadLocalOut.popChecked(out);
out=null;
hibSession=null;
initChecked=true;
}
}
protected static void initialize(){
mr=GlobalVariables.getMr(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("mr",mr);
mrs=GlobalVariables.getMrs(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("mrs",mrs);
miss=GlobalVariables.getMiss(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("miss",miss);
dr=GlobalVariables.getDr(utils.HibernateUtil.getCurrentSession());
env.putGlobalVariable("dr",dr);
}
public static void initActions(){}
}
