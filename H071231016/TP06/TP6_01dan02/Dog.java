package TP6_01dan02;

public abstract class Dog implements IMove{
    int position;
    int averageLength;
    public abstract void describe();
    Dog (int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }
}

class Pitbull extends Dog{
    Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("Pitbull Position: "+ position);
    }
    public void describe(){
        System.out.println("Pitbull adalah salah satu jenis anjing.");
    }
}

class SiberianHusky extends Dog{
    SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 2;
        System.out.println("Siberian Husky Position: "+ position);
    }
    public void describe(){
        System.out.println("Siberian Husky adalah salah satu jenis anjing.");
    }
}

class Bulldog extends Dog{
    Bulldog(int position, int averageLength){
        super(position,averageLength);
    }

    public void move(){
        position += 1;
        System.out.println("Bulldog Position: "+ position);
    }
    public void describe(){
        System.out.println("Bulldog adalah salah satu jenis anjing.");
    }
}

class GermanShepherd extends Dog{
    GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        position += 3;
        System.out.println("GermanShepherd Position: "+ position);
    }
    public void describe(){
        System.out.println("GermanShepherd adalah salah satu jenis anjing.");
    }
}