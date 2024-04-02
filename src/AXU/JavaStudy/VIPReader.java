class VIPReader extends Reader
{
	String readergrade;
	double percent;
	int bonusPoints;
	VIPReader(String name,String grade)
{
	super(name);
	readergrade = grade;
	bonusPoints =0;
	setPercent();
}
	void setReadergrade(String grade)
{
	readergrade = grade;
	setPercent();
}
	String getReadergrade()
{
	return readergrade;
}
	void setPercent()
{
	if(readergrade. equals("VIP"))
	{
	percent =0.8;
}
	else if(readergrade.equals("普通会员"))//普通会员待遇
{
	percent =0.9;
}
//读者身份级别
//会员折扣
//会员积分
//调用父类构造方法创建普通读者
//设置读者身份
//设置读者身份
//获取读者身份
//设置折扣率
//VIP待遇
	else
{//非会员
	percent =1;
}
}
double getPercent()
{
return percent;
}
	public void setBonusPoints(int point)//计算会员积分
{
	bonusPoints += point;
}
public double getBonusPoints()
{
return bonusPoints;
}
boolean payRent(double rent)
{
	if(balance >=rent)
{
	balance = balance - rent;
	return true;
}
//支付租金
else
	return false;
}
public String toString()
{
	return super.toString()+"身份："+readergrade+"当前积分："+bonusPoints +"享有折扣率："
+ percent;
}
}