using System;
namespace New_folder
{
class test11
{
public int fib(int x){
if (x==0){
return 0;
}
else if(x==1)
return 1;
else{
int zz = fib(x-1) + fib(x-2);

// Console.Write(zz +&quot; &quot;);
return zz;
}
}
static void Main(string[] args){
Console.Write(&quot;Author of this program is SHEKHAR KUMAR \n ROLL NO: 70 \n&quot;);
Console.Write(&quot;Enter the count \n&quot;);
int n = Convert.ToInt32(Console.ReadLine());
test11 t = new test11();
for(int i=1; i&lt;=n; i++){
Console.Write(t.fib(i)+&quot; &quot;);
}
}
}
}
