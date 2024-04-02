import java.util. * ;
class RentBookManage
{
	static final int deadTime =10;//静态类常量，租阅
//实例变量，正常租//实例变量，超期租//租阅天数60-5图股图头//租阅费用奇圆
	double normalRent =0.1;
	double delayRent =1.0;
	int rentDays;
	double rent;
	RentBook rentedbook;
	VIPReader renter;

	LinkedList<RentBook> booklist;
	ArrayList<VIPReader>readerlist;
	ArrayList<String>rentist;
	int j;
/*2.定义构造方法*/
RentBookManage()
{
//定义构造方法，初始化图书及读者信息存储表
	booklist = new LinkedList < RentBook >();
//初始化图书链表
	readerlist = new ArrayList < VIPReader >()；
	rentlist = new ArrayList < String >();
//初始化租阅记录顺序表
static double getDeadTime()
{
return dead Time；进：刹计图\
}
void setNormalRent(double newNR)
{
normalRent = newNR;
}
double getNormalRent()
{
return normalRent;
}
void setDelayRent(double newDR)
{
delayRent = newDR;
}
double getDelayRent()
{
return delayRent;
}
/*4.定义实现图书信息管理功能的成员方法*/
void addBook(String isbn, String name,String author, String publisher, double price, String no)
{
booklist.add(new RentBook(isbn, name, author, publisher, price,no));
}
//将新书插在表尾
//实例方法，修改超期租阅费率
//实例方法，获取超期租阅费率
void addBook(int i,String isbn,String name , String author,String publisher, double price,String no)
{//重载图书入库方法
	booklist.add(i,new RentBook(isbn,name,author,publisher,price,no));//在指定位置插入
void searchBook(String bookName)
{//图书查询：按书名查询
boolean flag = false;
for(j=0;j<booklist.size()；j++)
{
if(booklist.get(j).getBookName().equals(bookName))
{
	System.out.println(booklist.get(j));
	flag =true;
}
}
if(flag==false)
	System. out. println("没有找到指定的书。");
}
void editBook(String bookName, double bprice)
{
for(j=0;j<booklist.size()；j ++）
{
if(booklist. get(j). getBookName().equals(bookName))
{
booklist. get(j).setPrice(bprice);
//修改定价
System.out.println(booklist. get(j));
}
}
}

void deleteBook(String bookName)
{
for(j=0;j < booklist, size();j ++)
{
if(booklist. get(j). getBookName(). equals(bookName))
{
booklist.remove(j);
System.out.println("成功删除该书。"）;

}
}
}//删除该书
void displayBook()
{//输出图书清单
for(RentBook b: booklist)
	System. out. println(b);
}//用增强for循环逐条列出
/*5.定义读者信息添加和输出的成员方法*/
void addReader(String name,String grade)
{//创建不同身份的读者
	readerlist.add(new VIPReader(name,grade));
//将新读者插在表尾}
void displayReader()
{
for( VIPReader r: readerlist)
System. out. println(r);
}
//用增强 for循环逐条列出i
/*6.定义租阅业务相关的成员方法*/
double setRent()
{
if(rentDays < = deadTime)
//在规定期限内按正常费率计算租金
	rent =rentDays * normalRent * renter. getPercent();
else
	rent=((rentDays -deadTime) * delayRent + deadTime * normalRent)* renter. getPercent();
	return rent;
}
boolean renting()
{//实例方法：支付租金
	setRent();
//调用计算租金的方法
	if(renter.payRent(rent))
//判断账户余额是否够支付租金
System. out.println(renter. getReaderName(）+"支付租金："+rent+"成功！")；
return true;
System. out. println(renter. getReaderName()+"的账号余额="+renter. getBalance(够支付租金”+rent)；
return false;
void rentBook(RentBook bk,VIPReader rd,int days)
rentedbook = bk;
//图书租阅方法renter = rd;rentDays = days;if(renting(））
//调用计算租方法金，当余额够支付租金时则添加该租阅记录renter. setBonusPoints(rentDays)；//按照租阅天数累计会员积分，每天1分rentlist. add(renter. getReaderName(）+"借阅的图书是："+rentedbook. getBookName(）|"+ rentedbook.getBookNo(）+"，账号余额三·
+ renter. getBalance()+"，积分三"+renter
getBonusPoints());
//输出租阅信息
//用增强for循环逐条列出
;(1)nlinnq.lo.molr
void displayRentlnfo()
for(String br:rentlist)
System. out. println(br);
*7.功能测试：先创建图书及读者对象并调用各项管理功能，再进行图书租阅(※/sa sldJ
public static void main(String args[])
System. out. println("RentBookManage 运行情况如下：");oAlcmion※aysin91= JI51
RentBookManage bm = new RentBookManage();
/*测试图书添加功能*/
+In9fyslsb *(omiTbssb-eysdinst))=1097
bm. addBook("978-7-04-051593-0"，"Java 面向对象程序设计教程”，“施珺 纪兆辉”，”高
等教育出版社",48.5,"IT-10L-01"）;
bm. addBook("978-7-305-13680-3"，"Java 语言实验与课程设计指导”，“施珺等”，”南京大学出版社"，28,"IT-204-01"）；
bm. addBook(“978=7-113=07777-1"，"VB学习与考试指导”，”施珺等”，”中国铁道出版
社"，35,"IT-301-01"）；
bm.addBook(“978—7-103=01234-2"}”数据结构”，“耿国华"“清华大学出版社”，41.2,"
IT-401-01"）；
bm.addBook("978-7-04-051593-0”，"Java面向对象程序设计教程”，“施珺纪兆辉”，“高
等教育出版社"，48.5,"IT-101-02"）；
bm. displayBook();
//将此书插在第1本书后
//列出新增的所有图书信息
/*测试图书管理的查询、修改、删除功能*/
System. out. println("\n searchBook("Java 面向对象程序设计教程”)");
bm.searchBook("Java 面向对象程序设计教程");
System. out, println(" \n searchBook("Java 程序设计")");
bm. searchBook("Java 程序设计")；
System,out.println("\n editBook("Java面向对象程序设计教程”，18.5)：")
bm.editBook("Java 面向对象程序设计教程"，18.5)；
System. oul. println("\n deleteBook(“VB学习与考试指导”）："）；
bm. deleteBook("VB学习与考试指导”）；
bm.displayBook();
//列出经过修改和删除操作之后的所有图书信息
/*测试读者添加和充值功能※/
System.out. println("\n addReader(黄蓉，VIP/郭靖，普通会员)、setBalance(50/100):");
bm.addReader("黄蓉","VIP"）;
bm.addReader("郭靖"，“普通会员“）；bm.readerlist. get(0).setBalance(50）bm. readerlist.get(1).setBalance(100);bm. displayReader();
//给1号读者充值50
给2号读者充值100
//列出所有读者信息（和婚云显
又7*测试图书租阅功能￥入
System.out. println(”\n测试图书租阅功能：”）；息自培全尘学示显来（）
本bm. rentBook(bm.booklist， get(0),bm. readerlist. get(0),5）；。类7/1号读者租阅1#书，时间5天bm.rentBook(bm.booklist. get(2)，bm. readerlist. get(0),100）；//1号读者租阅3#书，未成功bm. rentBook(bm. booklist.get(3),bm. readerlist.get(1)，5）iE眼米/2号读者租阅了4#书，时间5天bm.displayRentInfo()；量，既要重，容内，限日己部（列出所有租阅
