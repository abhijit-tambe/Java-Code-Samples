public class Stringbuild{
public static void main(String[] args)
{
String s = null;
System.out.println("new string : " +s);
StringBuilder sb = new StringBuilder("Abhijit");
StringBuilder sb1 = new StringBuilder();
System.out.println(sb);
System.out.println(sb1.append("hello"));
System.out.println(sb.append("i55443") +" length is "+sb.length());
System.out.println(sb.charAt(3));
System.out.println(sb.substring(sb.indexOf("i"),sb.indexOf("i",6)));
System.out.println(sb);
System.out.println(sb.insert(7,"abh"));
sb.insert(0,"[<--").insert(sb.length(),"-->]").insert(sb.length()/2,"}{");
System.out.println(sb);
sb.delete(sb.length()/2-1,sb.length()/2+1).delete(0,1).deleteCharAt(sb.length()-1);
System.out.println(sb);
System.out.println(sb.reverse());
System.out.println(sb);
s= sb.toString();
System.out.println(" null string reassigned to stringbuilder sb : " +s.toUpperCase());
System.out.println("String : "+s);
System.out.println("String builder sb : "+sb);
System.out.println("is String equal to StringBuilder??? : " +s.equals(sb));
}
}