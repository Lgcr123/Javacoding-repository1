import java.util. * ;
class RentBookManage
{
	static final int deadTime =10;//��̬�ೣ��������
//ʵ��������������//ʵ��������������//��������60-5ͼ��ͼͷ//���ķ�����Բ
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
/*2.���幹�췽��*/
RentBookManage()
{
//���幹�췽������ʼ��ͼ�鼰������Ϣ�洢��
	booklist = new LinkedList < RentBook >();
//��ʼ��ͼ������
	readerlist = new ArrayList < VIPReader >()��
	rentlist = new ArrayList < String >();
//��ʼ�����ļ�¼˳���
static double getDeadTime()
{
return dead Time������ɲ��ͼ\
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
/*4.����ʵ��ͼ����Ϣ�����ܵĳ�Ա����*/
void addBook(String isbn, String name,String author, String publisher, double price, String no)
{
booklist.add(new RentBook(isbn, name, author, publisher, price,no));
}
//��������ڱ�β
//ʵ���������޸ĳ������ķ���
//ʵ����������ȡ�������ķ���
void addBook(int i,String isbn,String name , String author,String publisher, double price,String no)
{//����ͼ����ⷽ��
	booklist.add(i,new RentBook(isbn,name,author,publisher,price,no));//��ָ��λ�ò���
void searchBook(String bookName)
{//ͼ���ѯ����������ѯ
boolean flag = false;
for(j=0;j<booklist.size()��j++)
{
if(booklist.get(j).getBookName().equals(bookName))
{
	System.out.println(booklist.get(j));
	flag =true;
}
}
if(flag==false)
	System. out. println("û���ҵ�ָ�����顣");
}
void editBook(String bookName, double bprice)
{
for(j=0;j<booklist.size()��j ++��
{
if(booklist. get(j). getBookName().equals(bookName))
{
booklist. get(j).setPrice(bprice);
//�޸Ķ���
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
System.out.println("�ɹ�ɾ�����顣"��;

}
}
}//ɾ������
void displayBook()
{//���ͼ���嵥
for(RentBook b: booklist)
	System. out. println(b);
}//����ǿforѭ�������г�
/*5.���������Ϣ��Ӻ�����ĳ�Ա����*/
void addReader(String name,String grade)
{//������ͬ��ݵĶ���
	readerlist.add(new VIPReader(name,grade));
//���¶��߲��ڱ�β}
void displayReader()
{
for( VIPReader r: readerlist)
System. out. println(r);
}
//����ǿ forѭ�������г�i
/*6.��������ҵ����صĳ�Ա����*/
double setRent()
{
if(rentDays < = deadTime)
//�ڹ涨�����ڰ��������ʼ������
	rent =rentDays * normalRent * renter. getPercent();
else
	rent=((rentDays -deadTime) * delayRent + deadTime * normalRent)* renter. getPercent();
	return rent;
}
boolean renting()
{//ʵ��������֧�����
	setRent();
//���ü������ķ���
	if(renter.payRent(rent))
//�ж��˻�����Ƿ�֧�����
System. out.println(renter. getReaderName(��+"֧�����"+rent+"�ɹ���")��
return true;
System. out. println(renter. getReaderName()+"���˺����="+renter. getBalance(��֧�����+rent)��
return false;
void rentBook(RentBook bk,VIPReader rd,int days)
rentedbook = bk;
//ͼ�����ķ���renter = rd;rentDays = days;if(renting(����
//���ü����ⷽ���𣬵���֧�����ʱ����Ӹ����ļ�¼renter. setBonusPoints(rentDays)��//�������������ۼƻ�Ա���֣�ÿ��1��rentlist. add(renter. getReaderName(��+"���ĵ�ͼ���ǣ�"+rentedbook. getBookName(��|"+ rentedbook.getBookNo(��+"���˺��������
+ renter. getBalance()+"��������"+renter
getBonusPoints());
//���������Ϣ
//����ǿforѭ�������г�
;(1)nlinnq.lo.molr
void displayRentlnfo()
for(String br:rentlist)
System. out. println(br);
*7.���ܲ��ԣ��ȴ���ͼ�鼰���߶��󲢵��ø�������ܣ��ٽ���ͼ������(��/sa sldJ
public static void main(String args[])
System. out. println("RentBookManage ����������£�");oAlcmion��aysin91= JI51
RentBookManage bm = new RentBookManage();
/*����ͼ����ӹ���*/
+In9fyslsb *(omiTbssb-eysdinst))=1097
bm. addBook("978-7-04-051593-0"��"Java ������������ƽ̡̳�����ʩ�B ���׻ԡ�������
�Ƚ���������",48.5,"IT-10L-01"��;
bm. addBook("978-7-305-13680-3"��"Java ����ʵ����γ����ָ��������ʩ�B�ȡ������Ͼ���ѧ������"��28,"IT-204-01"����
bm. addBook(��978=7-113=07777-1"��"VBѧϰ�뿼��ָ��������ʩ�B�ȡ������й���������
��"��35,"IT-301-01"����
bm.addBook(��978��7-103=01234-2"}�����ݽṹ������������"���廪��ѧ�����硱��41.2,"
IT-401-01"����
bm.addBook("978-7-04-051593-0����"Java������������ƽ̡̳�����ʩ�B���׻ԡ�������
�Ƚ���������"��48.5,"IT-101-02"����
bm. displayBook();
//��������ڵ�1�����
//�г�����������ͼ����Ϣ
/*����ͼ�����Ĳ�ѯ���޸ġ�ɾ������*/
System. out. println("\n searchBook("Java ������������ƽ̡̳�)");
bm.searchBook("Java ������������ƽ̳�");
System. out, println(" \n searchBook("Java �������")");
bm. searchBook("Java �������")��
System,out.println("\n editBook("Java������������ƽ̡̳���18.5)��")
bm.editBook("Java ������������ƽ̳�"��18.5)��
System. oul. println("\n deleteBook(��VBѧϰ�뿼��ָ��������"����
bm. deleteBook("VBѧϰ�뿼��ָ��������
bm.displayBook();
//�г������޸ĺ�ɾ������֮�������ͼ����Ϣ
/*���Զ�����Ӻͳ�ֵ���ܡ�/
System.out. println("\n addReader(���أ�VIP/��������ͨ��Ա)��setBalance(50/100):");
bm.addReader("����","VIP"��;
bm.addReader("����"������ͨ��Ա������bm.readerlist. get(0).setBalance(50��bm. readerlist.get(1).setBalance(100);bm. displayReader();
//��1�Ŷ��߳�ֵ50
��2�Ŷ��߳�ֵ100
//�г����ж�����Ϣ���ͻ�����
��7*����ͼ�����Ĺ��ܣ���
System.out. println(��\n����ͼ�����Ĺ��ܣ�������Ϣ����ȫ��ѧʾ��������
��bm. rentBook(bm.booklist�� get(0),bm. readerlist. get(0),5��������7/1�Ŷ�������1#�飬ʱ��5��bm.rentBook(bm.booklist. get(2)��bm. readerlist. get(0),100����//1�Ŷ�������3#�飬δ�ɹ�bm. rentBook(bm. booklist.get(3),bm. readerlist.get(1)��5��iE����/2�Ŷ���������4#�飬ʱ��5��bm.displayRentInfo()��������Ҫ�أ����ڣ����ռ������г���������
