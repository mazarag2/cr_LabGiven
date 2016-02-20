/*
 * 
 * File: AccountServerFactory.java
 * Author Kevinagary
 * Date: 2/20/16
 * 
 * Description: Contains an AccountServerFactory class
 * 
 */

package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
