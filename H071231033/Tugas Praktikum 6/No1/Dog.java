package No1;

abstract class Dog implements Perpindahan {
    int position, averagelenght;
    
    public Dog(int position, int averagelenght) {
        this.position = position;
        this.averagelenght = averagelenght;
    }
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAveragelenght() {
        return averagelenght;
    }

    public void setAveragelenght(int averagelenght) {
        this.averagelenght = averagelenght;
    }

    abstract void describe();
}
