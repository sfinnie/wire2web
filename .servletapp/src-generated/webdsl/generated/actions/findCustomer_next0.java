package webdsl.generated.actions;
import webdsl.generated.domain.*;import webdsl.generated.templates.*;import utils.*;import java.io.*;import java.util.*;import org.webdsl.lang.Environment;
public class findCustomer_next0 extends TemplateAction{
public static boolean isValidationDisabled(){
return false;
}
public void run(final AbstractPageServlet threadLocalPageCached,final Environment env,final String elementsContext,final webdsl.generated.domain.Party party_arg,final String actionident){
handleAction(threadLocalPageCached,env,elementsContext,actionident,new TemplateActionBody(){
public void run(){
webdsl.generated.domain.Party party_=null;
party_=party_arg;
party_.save("Party");
ThreadLocalPage.get().setRedirectUrl(utils.Navigate.constructUrl("submitComplaint"));
}
}
);
}
}
