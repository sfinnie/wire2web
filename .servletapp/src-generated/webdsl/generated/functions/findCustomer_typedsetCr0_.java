package webdsl.generated.functions;
import java.io.*;import java.util.HashMap;
import javax.servlet.*;import javax.servlet.http.*;import java.util.*;import utils.*;import webdsl.generated.templates.*;import webdsl.generated.domain.*;import java.io.PrintWriter;
import org.webdsl.lang.Environment;
@SuppressWarnings("all")public class findCustomer_typedsetCr0_ implements org.webdsl.lang.IFunction{
public static java.util.Set<webdsl.generated.domain.Gender> findCustomer_typedsetCr0_(){
java.util.Set<webdsl.generated.domain.Gender> l_=new java.util.LinkedHashSet<webdsl.generated.domain.Gender>();
l_.add((webdsl.generated.domain.Gender)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Gender)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Gender._static_createEmpty_().Gender$this_(),webdsl.generated.domain.Gender.class)).setName("male"),webdsl.generated.domain.Gender.class));
l_.add((webdsl.generated.domain.Gender)org.webdsl.tools.Utils.cast(((webdsl.generated.domain.Gender)org.webdsl.tools.Utils.cast(webdsl.generated.domain.Gender._static_createEmpty_().Gender$this_(),webdsl.generated.domain.Gender.class)).setName("female"),webdsl.generated.domain.Gender.class));
return l_;
}
public Object apply(Object[] args){
return findCustomer_typedsetCr0_.findCustomer_typedsetCr0_();
}
}
