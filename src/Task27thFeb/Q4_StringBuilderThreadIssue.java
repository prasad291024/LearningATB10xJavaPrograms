package Task27thFeb;

    class SharedStringBuilder {
        StringBuilder sb = new StringBuilder("Hello");

        void modify(String str) {
            sb.append(str);
            System.out.println(sb);
        }
    }

    class myThread extends Thread {
        SharedBuffer obj;

        myThread(SharedBuffer obj) {
            this.obj = obj;
        }

        public void run() {
            obj.modify(" World");
        }
    }

    public class Q4_StringBuilderThreadIssue {
        public static void main(String[] args) {
            SharedStringBuilder obj = new SharedStringBuilder();
           // myThread t1 = new myThread(obj);
           // myThread t2 = new myThread(obj);

           // t1.start();
           // t2.start();
        }
    }


