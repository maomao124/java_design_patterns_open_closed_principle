package mao.add;

import mao.AbstractSkin;

/**
 * Project name(项目名称)：java设计模式_开闭原则
 * Package(包名): mao.add
 * Class(类名): Skin3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/9
 * Time(创建时间)： 20:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Skin3 extends AbstractSkin
{

    @Override
    public void display()
    {
        System.out.println("添加皮肤3，没有对原来代码进行修改");
    }
}
