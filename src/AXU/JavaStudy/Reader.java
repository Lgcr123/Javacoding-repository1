class Reader
{
        int raederID;
        String readerName;
        String readerPwd;
        double balance;
        String note="\n���߲�����ʾ:";
        static int nextRaederID;
        static
        {
                nextRaederID=10001;
        }
        Reader()
        {
                raederID=nextRaederID++;
                readerName="";
                readerPwd="666666";
                balance=0;
    }
    Reader(String name)
        {
                this();
                readerName=name;
    }
    int  getReaderID()
    {
                return raederID;
        }
        void setReaderName(String newname)
        {
                readerName=newname;
        }
        String getReaderName()
        {
                return readerName;
        }
        void setReaderPwd(String newpwd)
        {
                if(newpwd.length()<6)
                {
                        note="����̫��";
                }
                else
                {
                        readerPwd=newpwd;
                        note="�޸ĳɹ�";
                }
        }
        String getReaderPwd()
        {
                return readerPwd;
        }
        void setBalance(double moreMoney)
        {
                if(moreMoney<0)
                {
                        note="��ֵ̫��";
                }
                else
                {
                        balance=balance+moreMoney;
                        note="��ֵ�ɹ�";
                }
    }
    double getBalance()
    {
                return balance;
        }
        public String toString()
        {
                        return "���߱��:"+raederID+"����"+readerName+"����"+readerPwd+"���"+balance;
        }
}
