package javaassignments;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@SuppressWarnings("unused")
 @interface info {

	String name();
	String supervisor()default "ONKAR";
	int version();
	int AuthorID();
	String Author() default "KIRTIK";
	String Date();
	String Time();
	String desp() default "hello its annotation program";
	
}

public class Annotation2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Information i=new Information("extra info");
		Class c = i.getClass();
		java.lang.annotation.Annotation an=c.getAnnotation(info.class);
		info in=(info)an;
		System.out.println(in.Date());
		System.out.println(in.AuthorID());
		System.out.println(in.Time());
		System.out.println(in.version());
		
	}

}



@info(name="kirti",version=6,AuthorID=123,Author="kirtikalambe",Date="1.12.1998",Time="12:30")
class Information{
	String extrainfo;

	public Information(String extrainfo) {
		super();
		this.extrainfo = extrainfo;
	}
	
	
}
