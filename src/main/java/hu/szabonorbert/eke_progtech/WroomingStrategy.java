package hu.szabonorbert.eke_progtech;

abstract class WroomingStrategy implements Cloneable {
    public abstract void Wroom();
    public abstract String toString();
    public abstract WroomingStrategy clone();
}
