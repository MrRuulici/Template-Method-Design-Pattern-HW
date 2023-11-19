
public class Client {

	public static void main(String[] args) {

		PageTemplate welcomePage = new WelcomePage();
		PageTemplate aboutUsPage = new AboutUsPage();
		
		welcomePage.renderPage();
		aboutUsPage.renderPage();
		
	}

}
