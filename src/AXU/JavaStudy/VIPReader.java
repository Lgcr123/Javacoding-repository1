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
	else if(readergrade.equals("��ͨ��Ա"))//��ͨ��Ա����
{
	percent =0.9;
}
//������ݼ���
//��Ա�ۿ�
//��Ա����
//���ø��๹�췽��������ͨ����
//���ö������
//���ö������
//��ȡ�������
//�����ۿ���
//VIP����
	else
{//�ǻ�Ա
	percent =1;
}
}
double getPercent()
{
return percent;
}
	public void setBonusPoints(int point)//�����Ա����
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
//֧�����
else
	return false;
}
public String toString()
{
	return super.toString()+"��ݣ�"+readergrade+"��ǰ���֣�"+bonusPoints +"�����ۿ��ʣ�"
+ percent;
}
}