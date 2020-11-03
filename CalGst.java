class CalGst{
	public static void main(String args[]){
	int invoiceAmount=45000;
	
	if(invoiceAmount<10000)
	{
	double gst=invoiceAmount*0.10;
	double invoiceAmountWithGst=invoiceAmount+gst;
	System.out.println(invoiceAmountWithGst);
	}
	
	else if(invoiceAmount>10000 && invoiceAmount<20000)
	{
	double gst=invoiceAmount*0.15;
	double invoiceAmountWithGst=invoiceAmount+gst;
	System.out.println(invoiceAmountWithGst);
	}
	
	else if(invoiceAmount>20000 && invoiceAmount<30000)
	{
	double gst=invoiceAmount*0.18;
	double invoiceAmountWithGst=invoiceAmount+gst;
	System.out.println(invoiceAmountWithGst);
	}

	else if(invoiceAmount>30000)
	{
	double gst=invoiceAmount*0.20;
	double invoiceAmountWithGst=invoiceAmount+gst;
	System.out.println(invoiceAmountWithGst);
	}
}
}