package mao.add;

import mao.SouGouInput;

/**
 * Project name(项目名称)：java设计模式_开闭原则
 * Package(包名): mao.add
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/9
 * Time(创建时间)： 20:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        SouGouInput souGouInput = new SouGouInput(new Skin3());
        souGouInput.display();
    }
}
