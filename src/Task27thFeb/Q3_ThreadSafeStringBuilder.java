package Task27thFeb;

public class Q3_ThreadSafeStringBuilder {
        private StringBuilder sb = new StringBuilder();

        public synchronized void appendText(String text) {
            sb.append(text);
        }

        public synchronized String getText() {
            return sb.toString();
        }
    }

}
