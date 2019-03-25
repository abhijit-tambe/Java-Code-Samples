class Allstrings{
public static void main(String[] args){
//System.out.println(args[0]);
//System.out.println(args[1]);
String s =null;
String s1 = "";
String s2 = "hello";
String s4 = "  ";
String s5 = new String("OBJ");
int a =5;
char c = 'a';
c--;
c+=2;
System.out.printf("%s,%s,%s,%s,%s\n",s,s4,s2,s1,s5);
System.out.println(c++);
s = s4.concat(s2.concat("world"));
System.out.println(s +" its length is :" +s.length()+"character at index 6 is: " +s.charAt(6) +"index of character a is :"+s.indexOf("l"));
System.out.println(s.substring(s.indexOf('o'),s.indexOf('r',6)));
String s6 = s2.toUpperCase();
System.out.println(s6+s5.toLowerCase());
System.out.println(!(s6.equalsIgnoreCase(s2)^s6.equals(s2)));
System.out.println(s6.startsWith("HE")&s6.endsWith("O")^s6.contains("l"));
System.out.println(s.replace("helloworld","czxcxczxworldhello")+"original s is immutable :"+s+" trim s:"+s.trim().toUpperCase().replace("H","h").replace("D","d"));
//System.out.println(Max_Integer);
//String builder

StringBuilder Sb = new StringBuilder();
for(char ch = 'A';ch<='Z';ch++)
{
System.out.println(ch);
if(ch == 'Z')
{	Sb.append(ch).append("+end");
}
else{
Sb.append(ch);
}
}
System.out.println(Sb);

}
}