package au.zinoveva.staff;

import au.zinoveva.account.WorkerBase;
import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Итератор сотрудников
 */
@RequiredArgsConstructor
public class EmployeeIterator implements Iterator<WorkerBase> {

    /**
     * Сотрудники
     */
    private final List<WorkerBase> empl;

    /**
     * Индекс сотрудника
     */
    private int index = 0;

    /**
     * Текущий сотрудник
     */
    private WorkerBase current;

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    public boolean hasNext() {
        return (long) this.empl.size() > index;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    public WorkerBase next() {
        if(!this.hasNext())
            throw new NoSuchElementException("Больше нет сотрудников в списке");
        this.current = this.empl.get(this.index);
        this.index++;
        return this.current;
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.
     * <p>
     * The behavior of an iterator is unspecified if the underlying collection
     * is modified while the iteration is in progress in any way other than by
     * calling this method, unless an overriding class has specified a
     * concurrent modification policy.
     * <p>
     * The behavior of an iterator is unspecified if this method is called
     * after a call to the {@link #forEachRemaining forEachRemaining} method.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *                                       operation is not supported by this iterator
     * @throws IllegalStateException         if the {@code next} method has not
     *                                       yet been called, or the {@code remove} method has already
     *                                       been called after the last call to the {@code next}
     *                                       method
     * @implSpec The default implementation throws an instance of
     * {@link UnsupportedOperationException} and performs no other action.
     */
    public void remove() {
        if(this.current == null)
            return;
        this.empl.remove(this.current);
    }
}
