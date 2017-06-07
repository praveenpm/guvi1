public class leapyear{
public static void main(string[] args)
{
int year=2004;
if((year%400==0)||((year%4==0)&&(year%100!=0)))
system.out.println("year"+year+"is aleap year");
else
system.out.println("year"+year+"is not a leap year");
}
}