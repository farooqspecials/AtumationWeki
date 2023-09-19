import login.login_page;
import main.main_page;
import utilities.utils;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utils.instantiate();
		main_page.testSearch("spider man");
		login_page.clickLogin();
		login_page.setUsernameAndPassword();
		utils.closedriver();
		
	}

}
