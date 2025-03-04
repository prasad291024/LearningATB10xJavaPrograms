package Task27thFeb;


class SharedBuffer {
    StringBuffer sb = new StringBuffer("Hello");

    synchronized void modifyBuffer(String str) {
        sb.append(str);
        System.out.println(sb);
    }

    public void modify(String s) {
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
        
    }
}
