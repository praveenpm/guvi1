package pmp;
public class pmp
{
public static void main(String[] args) 
{
int a[]={2,3,4,5,6,2};
int b[]={2,3,4,5,7};
int count=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<b.length;j++){
if(a[i]==b[j])
{
a[i]=-1;
count++;
}
}
}
if(count==b.length)
{
System.out.println("subset");
}
else
{
System.out.println("not subset");
}
}
}