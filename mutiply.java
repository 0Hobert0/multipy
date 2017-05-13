/*
	这是一个输出九九乘法表的程序
*/
public class mutiply
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 9; i++ ) //控制列数
		{
			for(int m = 1; m <= i ; m++ ) // 控制行数
			{
				System.out.print(i+"*"+m+"="+i*m+" ");
			}
			System.out.print("\n");
		}
	}
}