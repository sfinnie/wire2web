package utils;
import org.webdsl.lang.*;import java.util.*;public class EntityReflectionHelper{
public static void init(){
List<ReflectionEntity> reflectionentities=DispatchServletHelper.reflectionentities;
ReflectionEntity ent;
ent=new ReflectionEntity("Complaint",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,String>("summary",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,String>("details",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,Boolean>("response",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Complaint,webdsl.generated.domain.Party>("complainant",false,null){
public List<webdsl.generated.domain.Party> getAllowed(webdsl.generated.domain.Complaint arg){
return arg.allowedComplainant_();
}
}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("dummy_webdsl_entity",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.dummy_webdsl_entity,String>("text",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("Gender",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Gender,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Gender,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Gender,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Gender,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Gender,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Gender,String>("name",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("Party",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,webdsl.generated.domain.Title>("title",false,null){
public List<webdsl.generated.domain.Title> getAllowed(webdsl.generated.domain.Party arg){
return arg.allowedTitle_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,String>("forename",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,String>("surname",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,String>("email",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Party,String>("phone",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("QueuedEmail",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("body",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("to",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("cc",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("bcc",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("replyTo",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("from",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("subject",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,String>("unsubscribeAddress",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.QueuedEmail,java.util.Date>("lastTry",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("RequestLogEntry",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("requestedURL",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("start",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,java.util.Date>("end",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("clientIP",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,Integer>("clientPort",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("method",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("referer",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.RequestLogEntry,String>("userAgent",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SessionManager",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,webdsl.generated.domain.SessionMessage>("messages",false,null){
public List<webdsl.generated.domain.SessionMessage> getAllowed(webdsl.generated.domain.SessionManager arg){
return arg.allowedMessages_();
}
}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,java.util.Date>("lastUse",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,String>("logsqlMessage",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Boolean>("stayLoggedIn",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionManager,Boolean>("sessionHasChanges",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("SessionMessage",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.SessionMessage,String>("text",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("Title",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Title,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Title,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Title,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Title,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Title,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.Title,String>("name",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ValidationException",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationException,String>("message",false,null){}
);
ReflectionEntity.add(ent);
ent=new ReflectionEntity("ValidationExceptionMultiple",null,false);
reflectionentities.add(ent);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,Integer>("version",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.UUID>("id",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,String>("name",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.Date>("created",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,java.util.Date>("modified",false,null){}
);
ent.getProperties().add(new ReflectionProperty<webdsl.generated.domain.ValidationExceptionMultiple,webdsl.generated.domain.ValidationException>("exceptions",false,null){
public List<webdsl.generated.domain.ValidationException> getAllowed(webdsl.generated.domain.ValidationExceptionMultiple arg){
return arg.allowedExceptions_();
}
}
);
ReflectionEntity.add(ent);
org.webdsl.logging.Logger.info("number of entities: "+reflectionentities.size());
}
}
