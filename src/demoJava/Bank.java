package demoJava;

import java.util.Arrays;

public class Bank {

	public static void main(String[] args) {
		int phone[]=new int[3];
phone[0]=033123456;
phone[1]=033123457;
phone[2]=033123454;
int count=1;
for(int i=0;i<phone.length;i++) {
	System.out.println("phone number: "+count+":"+phone[i]);
	++count;
}
	}

}
