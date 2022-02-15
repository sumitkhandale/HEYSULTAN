package com.sbm.stringcore;

public class ContactDao {
	private static ContactDao contactDao = null;
	
	private ContactDao() {
		// TODO Auto-generated constructor stub
	}
	public static ContactDao getInstance(){
		if(contactDao==null){
			contactDao = new ContactDao();
		}
		return contactDao;
	}
	public void getContactDetails(){
		System.out.println("\n Contact Details....");
	}
	public static void main(String[] args) {
		ContactDao contactDao = ContactDao.getInstance();
		System.out.println(contactDao);
		ContactDao contactDao2 = ContactDao.getInstance();
		System.out.println(contactDao2);
		
	}

}
