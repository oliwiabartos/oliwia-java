package com.oliwia;

abstract class ComplicatedAlgorithm {
    abstract protected void firstMethodToExecute();
    abstract protected void secondMethodToExecute();

    private void thridMethodToExecute(){
        System.out.println("This is third method to execute");
    }
    private void fourthMethodToExecute(){
        System.out.println("This is fourth method to execute");
    }
    public void run(){
        this.firstMethodToExecute();
        this.secondMethodToExecute();
        this.thridMethodToExecute();
        this.fourthMethodToExecute();
    }
}
class ComplicatedAlgorithmRunner extends ComplicatedAlgorithm{
    protected void firstMethodToExecute(){
        System.out.println("This is first method to execute");
    }
    protected void secondMethodToExecute(){
        System.out.println("This is second method to execute");
    }
    //adnotacja pozwala nam zmienic nadpisywana metoda
    @Override
    public void run(){
        this.firstMethodToExecute();
        this.secondMethodToExecute();
    }
}

class App8{
    public static void main(String[]args){
        ComplicatedAlgorithmRunner runner = new ComplicatedAlgorithmRunner();

        runner.run();
    }
}