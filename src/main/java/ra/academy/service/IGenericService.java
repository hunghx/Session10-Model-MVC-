package ra.academy.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T,E> {
    List<T> findAll();
    Optional<T> findById(E id);
    void save(T t);
    void deleteById(E id);
}
