package io;

import java.util.*;

public class Model {
    private final List<Observer> observers = new ArrayList<>();
    private final static double dt = 0.1;
    private double dø = -0.2;
    private double ø = Math.PI;

    public Model() {
        Timer timer = new Timer();
        timer.schedule(timerTask(), 0,10);
    }

    public double getØ() {
        return ø;
    }

    private TimerTask timerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                step(dt);
                updateObservers();
            }
        };
    }

    private void updateObservers() {
        for (Observer observer : observers) {
            observer.update(null,null);
        }
    }

    private void step(double dt) {
        ø = normalize(ø + dø * dt);
    }

    private double normalize(double ø) {
        return (ø + Math.PI*2) % (Math.PI*2);
    }


    public void add(Observer observer) {
        observers.add(observer);
    }
}
