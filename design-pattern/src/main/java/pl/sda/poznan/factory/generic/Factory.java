package pl.sda.poznan.factory.generic;

/**
 * Generyczny interfejs do tworzenia wielu rodzajow fabryk
 */
public interface Factory<K, V> {

    V create(K key);
}
