# 04_POM_ToolsQA

Use this project to scratch built a PageObjectModel of CH02 ScratchPad GoogleUK...


Where to create a POM object and how are you going to use it
			
			POM REPOSIRORY Class
                        //Constructor that will be automatically called as soon as the object of the class is created
			public LoginPage(WebDriver driver) {
          		this.driver = driver;   'driver' on the right side is the local varable (i.e. parameter in the args) AND this.driver on the left side is the global varable initalised 'Webdriver driver' 
     			
                        POM OBJECT class
                        LoginPage login = new LoginPage(driver); 'new' keyword creates object... (note: String abc = hello is the same concept), also 'driver' is passed as a parameter to the constructor
                        login.enterUsername("---Your Username---");  this is envoked using the 'login' object, and this calls the 'non static' method in the POM Class

                        By LoginBtn = By.id("login"); On the right side 'id' is a static method in a Selenium 'By' class, on the right class.method     
                        
                        //Method to enter username
	                public void enterUsername(String user) {                The return type is void
		        driver.findElement(uName).sendKeys(user);                                           method chaining with findElement
	                }

                        public String getHeading() {
		        String head = driver.findElement(heading).getText();    The return type is String
		        return head;                                            return 'head' as its a String varable type that is returned     
