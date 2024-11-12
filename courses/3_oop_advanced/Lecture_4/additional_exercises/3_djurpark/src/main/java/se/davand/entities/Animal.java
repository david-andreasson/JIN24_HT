package se.davand.entities;

import se.davand.behaviors.EatBehavior;
import se.davand.behaviors.SleepBehavior;
import se.davand.behaviors.SoundBehavior;

public abstract class Animal implements EatBehavior, SleepBehavior, SoundBehavior {

    public abstract void sleep();

    public abstract void eat();

    public abstract void makeSound();
}
