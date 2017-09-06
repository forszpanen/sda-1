package pl.sda.poznan.factory.generic;

public interface Factory<K, V>{
    V create(K key);
}