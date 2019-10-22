package co.grandcircus;

import java.util.Scanner;

public class RegexEmail {

	public static void main(String[] args) {
		String userName = "";
		String userEmail = "";
		String userPhone = "";
		String userDate = "";

		Scanner scan = new Scanner(System.in);
		// this is for names
		System.out.println("Please enter your a (starting with capital letters): ");
		userName = scan.next();
		if (regexStringsMatch(userName, "[A-Z]{1}[a-z]{2,30}")) {
			System.out.println("This is a valid name!");
		} else {
			System.out.println("This is not a valid name...");
		}

		// this is for e-mails
		System.out.println("Please enter a e-mail (no special characters): ");
		userEmail = scan.next();
		if (regexStringsMatch(userEmail, "[a-z]{5,30}@[a-z]{5,10}.[a-z]{2,3}")) {
			System.out.println("This is a valid email!");
		} else {
			System.out.println("This is not a valid email...");
		}

		// this is for phone numbers * Need more time to figure this regex code out
		System.out.println("Please enter a phone number: ");
		userPhone = scan.next();
		if (regexStringsMatch(userPhone, "\\\\d{3}-\\\\d{3}-\\\\d{4}")) {
			System.out.println("This is a valid phone number!");
		} else {
			System.out.println("This is not a valid phone number...");
		}
		// this is for dates
		System.out.println("Please enter a date (dd/mm/yyyy): ");
		userDate = scan.next();
		if (regexStringsMatch(userDate, "\\d{0,2}\\/\\d{0,2}\\/\\d{0,4}")) {
			System.out.println("This is a valid date!");
		} else {
			System.out.println("This is not a valid date...");
		}
		scan.close();
	}

	private static boolean regexStringsMatch(String name, String regex) {
		return name.matches(regex);
	}
}
