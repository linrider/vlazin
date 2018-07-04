package ru.job4j.store;
/**
 * Store for task "5.2.2. Реализовать Store<T extends Base>".
 * @author Wladyslaw Lazin (wladislaw.lazin@gmail.com).
 * @version $Id$.
 * @since 11.06.18.
 */
public interface Store<T extends Base> {

    /**
     * add.
     * @param model
     */
    void add(T model);

    /**
     * replace.
     * @param id - String.
     * @param model - T.
     * @return boolean.
     */
    boolean replace(String id, T model);

    /**
     * delete.
     * @param id - String.
     * @return boolean.
     */
    boolean delete(String id);

    /**
     * findById.
     * @param id - String.
     * @return T.
     */
    T findById(String id);
}