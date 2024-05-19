package lab_6.Task_4;

class CustomThread extends Thread {
    private int order;
    public CustomThread(int order) {
        this.order = order;
    }
    public void run() {
        System.out.println("Поток:: "+ "номер:" +this.order + "; имя:" + Thread.currentThread().getName());
    }
}
