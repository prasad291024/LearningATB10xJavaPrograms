package Task5thMarch;

public class AccessDemo {
        private String privateMessage = "Private: Only within this class";
        String defaultMessage = "Default: Accessible within the same package";
        protected String protectedMessage = "Protected: Accessible within the package & subclasses";
        public String publicMessage = "Public: Accessible from anywhere";

        public void displayMessages() {
            System.out.println(privateMessage);  // ✅ Allowed (inside class)
            System.out.println(defaultMessage);
            System.out.println(protectedMessage);
            System.out.println(publicMessage);
        }
    }

