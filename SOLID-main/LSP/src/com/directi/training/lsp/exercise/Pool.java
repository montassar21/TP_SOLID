package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        NaturalDuck donaldDuck = new NaturalDuck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(NaturalDuck donaldDuck,ElectronicDuck electricDuck)
    {
    	donaldDuck.quack();
    	electricDuck.turnOn();
    	electricDuck.quack();
    }

    private void swim(NaturalDuck donaldDuck,ElectronicDuck electricDuck)
    {
    	donaldDuck.swim();
    	electricDuck.turnOn();
    	electricDuck.swim();
    }



    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
