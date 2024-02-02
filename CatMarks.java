public class CatMarks{
public static void main(String[]args){
System.out.println("CAT1 \t CAT2 \t TCAT \t EXAM\t AGG\t");
for (int i=1; i<=10; i++)
{
int cat1=2+ (int)Math.ceil(Math.random()*10);
int cat2= 5+ (int)Math.ceil(Math.random()*15);
int exam=(int)Math.ceil(Math.random()*70);

int tcat= cat1+ cat2;
int agg= tcat+ exam;

System.out.println(cat1+ "\t" + cat2+ "\t" + tcat +"\t" +exam +"\t"+agg);
}
}
}