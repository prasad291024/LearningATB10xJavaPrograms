package Task27thFeb;


class SharedBuffer {
    StringBuffer sb = new StringBuffer("Hello");

    synchronized void modifyBuffer(String str) {
        sb.append(str);
        System.out.println(sb);
    }
}

class MyThread extends Thread {
    SharedBuffer obj;

    MyThread(SharedBuffer obj) {
        this.obj = obj;
    }

    public void run() {
        obj.modifyBuffer(" World");
    }
}

public class Q1_StringBufferThreadExample {
    public static void main(String[] args) {
        SharedBuffer obj = new SharedBuffer();
        myThread t1 = new myThread(obj);
        myThread t2 = new myThread(obj);

        t1.start();
        t2.start();
    }
}
