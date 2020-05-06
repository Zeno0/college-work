using System;
namespace New_folder
{
class test10
{
static void Main(string[] args)
{
Console.Write(&quot;Author of this program is SHEKHAR KUMAR \n ROLL NO: 70 \n&quot;);
string name = &quot;&quot;;
int countA=0, countB=0, countC=0, countF=0, netStud = 0;
Console.Write(&quot;If at anytime you wants to get out of the loop before entering the name of
hundred students just enter &#39;quit&#39; \n&quot;);
while (true)
{
Console.Write(&quot;Enter the name of student \n&quot;);
name = Console.ReadLine();
if (name.Equals(&quot;quit&quot;))
{
break;
}
netStud++;
if (netStud == 100)
{
break;
}
Console.Write(&quot;Enter the marks of first subject \n&quot;);
int x = Convert.ToInt32(Console.ReadLine());
Console.Write(&quot;Enter the marks of Second subject \n&quot;);
int y = Convert.ToInt32(Console.ReadLine());
Console.Write(&quot;Enter the marks of Third subject \n&quot;);
int z = Convert.ToInt32(Console.ReadLine());
int sum = x + y + z;
int product = sum * 100;
int netpercentage = product/300;
if(netpercentage &gt;=80){
Console.Write(&quot;Student got A grade \n&quot;);
countA++;
}
else if (netpercentage&lt;80 &amp;&amp; netpercentage&gt;=60){
Console.Write(&quot;Student got B grade \n&quot;);
countB++;
}
else if(netpercentage&lt;60 &amp;&amp; netpercentage&gt;=40){
Console.Write(&quot;Student got C grade \n&quot;);
countC++;
}
else{
Console.Write(&quot;Student got F grade \n&quot;);
countF++;
}
}
Console.Write(&quot;Total Students with A Grade: {0}&quot;,countA);
Console.Write(&quot;\n&quot;);
Console.Write(&quot;Total Students with B Grade: {0}&quot;,countB);

Console.Write(&quot;\n&quot;);
Console.Write(&quot;Total Students with C Grade: {0}&quot;,countC);
Console.Write(&quot;\n&quot;);
Console.Write(&quot;Total Students with F Grade: {0}&quot;,countF);
Console.Write(&quot;\n&quot;);
}
}
}
