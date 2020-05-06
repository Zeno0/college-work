using System;
namespace New_folder
{
class test12
{
static void Main(string[] args)
{
Console.Write(&quot;Author of this program is SHEKHAR KUMAR \n ROLL NO: 70 \n &quot;);
Console.Write(&quot;Enter the rows of matrix-1\n&quot;);
int rows1 = Convert.ToInt32(Console.ReadLine());
Console.Write(&quot;Enter the Columns of matrix-1\n&quot;);
int columns1 = Convert.ToInt32(Console.ReadLine());
int[,] mat1 = new int[rows1, columns1];
for (int i = 0; i &lt; rows1; i++)
{
for (int j = 0; j &lt; columns1; j++)
{
Console.Write(&quot;Enter the &quot; + i + &quot; row and &quot; + j + &quot; column number of matrix\n&quot;);
int ele = Convert.ToInt32(Console.ReadLine());
mat1[i, j] = ele;
}
}
Console.Write(&quot;Its just a side note but please keep the number of columns of matrix-1
same as the number of rows of matrix-2 \n &quot;);
Console.Write(&quot;Enter the rows of matrix-2\n&quot;);
int rows2 = Convert.ToInt32(Console.ReadLine());
Console.Write(&quot;Enter the Columns of matrix-2\n&quot;);
int columns2 = Convert.ToInt32(Console.ReadLine());
int[,] mat2 = new int[rows2, columns2];

for (int i = 0; i &lt; rows2; i++)
{
for (int j = 0; j &lt; columns2; j++)
{
Console.Write(&quot;Enter the &quot; + i + &quot; row and &quot; + j + &quot; column number of matrix\n&quot;);
int ele = Convert.ToInt32(Console.ReadLine());
mat2[i, j] = ele;
}
}
Console.Write(&quot;Printing matrix-1\n&quot;);
for (int i = 0; i &lt; rows1; i++)
{
for (int j = 0; j &lt; columns1; j++)
{
Console.Write(mat1[i, j] + &quot; &quot;);
}
Console.Write(&#39;\n&#39;);
}
Console.Write(&quot;Printing matrix-2\n&quot;);
for (int i = 0; i &lt; rows2; i++)
{
for (int j = 0; j &lt; columns2; j++)
{
Console.Write(mat2[i, j] + &quot; &quot;);
}
Console.Write(&#39;\n&#39;);
}
int[,] productmat = new int[rows1, columns2];
for (int i = 0; i &lt; rows1; i++)
{
for (int j = 0; j &lt; columns2; j++)
{
productmat[i, j] = 0;
for (int k = 0; k &lt; rows2; k++)
{
productmat[i, j] += mat1[i, k] * mat2[k, j];
}
}
}
Console.Write(&quot;Printing product matrix\n&quot;);
for (int i = 0; i &lt; rows1; i++)
{
for (int j = 0; j &lt; columns2; j++)
{
Console.Write(productmat[i, j] + &quot; &quot;);
}
Console.Write(&#39;\n&#39;);
}
}
}
}
