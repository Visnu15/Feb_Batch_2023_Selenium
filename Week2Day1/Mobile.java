package week2.day1;

public class Mobile {
	
	public void sendMessage() {
		System.out.println("Use message app to send sms");
	}
	public void shareDocument() {
		System.out.println("We can share documents using whatsapp and mails");
	}
	public void call() {
		System.out.println("Easily connect with peoples through a call");
	}
	public static void main(String[] args) {
		Mobile myPhone = new Mobile();
		myPhone.sendMessage();
		myPhone.shareDocument();
		myPhone.call();
	}

}
