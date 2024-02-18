package Seminar3;

public class Counter implements AutoCloseable {
    private int counter;
    private boolean isOpen;

    public Counter() {
        //TODO: Инициализация неуправляемого ресурса
        this.isOpen = true;
    }

    public Counter(int counter) {
        //TODO: Инициализация неуправляемого ресурса
        this.counter = counter;
        this.isOpen = true;
    }

    public int getCounter() {

        return counter;
    }

    public int add() throws CloseCounterException {
        if (!isOpen) throw new CloseCounterException("Счетчик закрыт!");
        return ++counter;
    }


    @Override
    public void close() {//throws Exception {
        isOpen = false;
    }
}
