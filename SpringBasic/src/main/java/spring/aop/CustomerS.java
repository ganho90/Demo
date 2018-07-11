package spring.aop;

public class CustomerS {
	
		private String name;
		private String url;
		

		public CustomerS(String name, String url) {
			super();
			this.name = name;
			this.url = url;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public void printName() {
			System.out.println("Customer name : " + this.name);
		}

		public void printURL() {
			System.out.println("Customer website : " + this.url);
		}

		public void printThrowException() {
			throw new IllegalArgumentException();
		}

		public String getName() {
			return name;
		}

		public String getUrl() {
			return url;
		}
		
		


}
