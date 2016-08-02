package webdsl.generated.templates;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.apache.commons.lang3.ArrayUtils;
import java.util.concurrent.atomic.AtomicInteger;
import utils.*;import org.webdsl.lang.Environment;
import utils.TemplateCall;
import webdsl.generated.domain.*;@SuppressWarnings("all")public class SubmitComplaintPage extends PageServlet{
public String getPageName(){
return "submitComplaint";
}
public String getHiddenParams(){
java.lang.StringBuilder hiddens=new java.lang.StringBuilder(512);
hiddenParams(hiddens);
return hiddens.toString();
}
public String getUrlQueryParams(){
java.lang.StringBuilder params=new java.lang.StringBuilder(512);
urlQueryParams(params);
return params.toString();
}
public String getHiddenPostParamsJson(){
java.lang.StringBuilder hiddens=new java.lang.StringBuilder(512);
hiddenPostParamsJson(hiddens);
return hiddens.toString();
}
protected void initVarsAndArgs(){
GlobalVariables.initGlobalVars(envGlobalAndSession,utils.HibernateUtil.getCurrentSession());
initialize();
conversion();
loadArguments();
Object[] args={};
this.args=args;
}
protected void initTemplateClass(){
templateservlet=new submitComplaint_Template();
}
protected void redirectHttpHttps(){}
protected void addPrincipalToRequestLog(org.webdsl.WebDSLEntity rle){}
protected org.webdsl.WebDSLEntity getRequestLogEntry(){
return ((utils.DispatchServletHelper)ThreadLocalServlet.get()).getRequestLogEntry();
}
protected void addLogSqlToSessionMessages(){
if(this.isLogSqlEnabled()){
if(logSqlCheckAccess()){
((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation(utils.HibernateLog.printHibernateLog(this,"action"));
}
else {
((webdsl.generated.domain.SessionManager)ThreadLocalServlet.get().getSessionManager()).setLogsqlMessageNoEventsOrValidation("Access to SQL logs was denied.");
}
}
}
protected void initializeBasics(AbstractPageServlet ps,Object[] args){
initTemplateClass();
this.envGlobalAndSession=ps.envGlobalAndSession;
this.request=ps.getRequest();
this.response=ps.getResponse();
this.parammap=java.util.Collections.<String,String>emptyMap();
this.parammapvalues=java.util.Collections.<String,java.util.List<String>>emptyMap();
this.fileUploads=java.util.Collections.<String,java.util.List<utils.File>>emptyMap();
Session hibSession=utils.HibernateUtil.getCurrentSession();
ThreadLocalServlet.get().loadSessionManager(utils.HibernateUtil.getCurrentSession());
initialize();
}
protected String[] getUsedSessionEntityJoins(){
return null;
}
protected void renderDebugJsVar(java.io.PrintWriter sout){
sout.println("<script type=\"text/javascript\">var show_webdsl_debug=false;</script>");
}
protected boolean isTemplate(){
return false;
}
public String getUniqueName(){
return "submitComplaint";
}
protected void increaseStatReadOnly(){
renderReadOnly.incrementAndGet();
}
protected void increaseStatReadOnlyFromCache(){
renderReadOnlyFromCache.incrementAndGet();
}
protected void increaseStatUpdate(){
renderWithUpdates.incrementAndGet();
}
protected void increaseStatActionFail(){
actionFailed.incrementAndGet();
}
protected void increaseStatActionReadOnly(){
actionSuccessReadOnly.incrementAndGet();
}
protected void increaseStatActionUpdate(){
actionSuccessWithUpdates.incrementAndGet();
}
public static  AtomicInteger renderReadOnly=new AtomicInteger();
public static  AtomicInteger renderReadOnlyFromCache=new AtomicInteger();
public static  AtomicInteger renderWithUpdates=new AtomicInteger();
public static  AtomicInteger actionFailed=new AtomicInteger();
public static  AtomicInteger actionSuccessReadOnly=new AtomicInteger();
public static  AtomicInteger actionSuccessWithUpdates=new AtomicInteger();
public void hiddenPostParamsJson(java.lang.StringBuilder combinedparams){}
public void urlQueryParams(java.lang.StringBuilder combinedparams){}
public void hiddenParams(java.lang.StringBuilder combinedparams){}
protected void loadArguments(){}
protected void conversion(){}
protected void initialize(){}
}
