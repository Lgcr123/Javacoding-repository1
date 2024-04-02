 class RentBook extends book{
		String bookNo;
		boolean state;
		RentBook(String isbn,String name,String author,String publisher,double price,String no){
				super(isbn,name,author,publisher,price);
				bookNo=no;
				state=true;
			}
		void setBookNo(String no){
				bookNo=no;
			}
		String getBookNo(){
				return bookNo;
			}
		public void setState(boolean state){
				this.state=state;
			}
		public boolean getState(){
				return state;
			}
		public String toString(){
				return super.toString()+"Èë¿âºÅ"+getBookNo()+"ÊÇ·ñ¿É½è£º"+getState();
			}
	}