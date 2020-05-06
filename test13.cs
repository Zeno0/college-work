using System;
namespace New_folder
{
class test13
{
static void Main(string[] args)
{

int count = 0;
Console.Write(&quot;Author of this program is SHEKHAR KUMAR \n ROLL NO: 70 \n &quot;);
Console.Write(&quot;Enter any line you want\n&quot;);
string samp = Console.ReadLine();
Console.Write(&quot;Enter the character you want to search\n&quot;);
char find = Console.ReadLine()[0];
Console.Write(&quot;This is what you entered: \n&quot;);
Console.Write(samp + &quot;\n&quot;);
Console.Write(&quot;This is what you wants to find: \n&quot;);
Console.Write(find + &quot;\n&quot;);
char[] arr = samp.ToCharArray();
for (int i = 0; i &lt; arr.Length; i++)
{
if (arr[i].Equals(find))
{
count++;
}
}
Console.Write(&quot;Number of times &#39;&quot;+ find +&quot;&#39; occurred in &#39;&quot;+ samp+ &quot;&#39; is &quot;+ count);
}
}
}
