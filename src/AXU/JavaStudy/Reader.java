class Reader
{
        int raederID;
        String readerName;
        String readerPwd;
        double balance;
        String note="\n读者操作提示:";
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
                        note="密码太短";
                }
                else
                {
                        readerPwd=newpwd;
                        note="修改成功";
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
                        note="充值太少";
                }
                else
                {
                        balance=balance+moreMoney;
                        note="充值成功";
                }
    }
    double getBalance()
    {
                return balance;
        }
        public String toString()
        {
                        return "读者编号:"+raederID+"姓名"+readerName+"密码"+readerPwd+"余额"+balance;
        }
}
