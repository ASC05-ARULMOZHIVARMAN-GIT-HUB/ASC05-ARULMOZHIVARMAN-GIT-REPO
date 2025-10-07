package demo;

public class App {
	
        private String privatevar="privatevar";
        private void privateMethod() {
        	System.out.println("private method : ");
        	
        
	}
        String packagePrivate="Private";
        void packagePrivate1() {
        	System.out.println("PackagePrivate");
        }
        public static void main(String[] args) {
			App a=new App();
			System.out.println(a.privatevar);
			a.privateMethod();
			
		}

}
