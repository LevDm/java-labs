package lab_6.Task_5;

class CustomThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int max = Integer.MIN_VALUE;
    public CustomThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            max = Math.max(max, array[i]);
        }
    }
    public int getMax() {
        return max;
    }
}