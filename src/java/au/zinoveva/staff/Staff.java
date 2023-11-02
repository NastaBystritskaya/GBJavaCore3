package au.zinoveva.staff;

import au.zinoveva.account.WorkerBase;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Сотрудники
 */
@Getter
@Setter
public class Staff implements Iterable<WorkerBase> {

    /**
     * Список сотрудника
     */
    private List<WorkerBase> staff = new LinkedList<WorkerBase>();

    /**
     * Добавить сотрудника
     * @param worker новый сотрудник
     */
    public void addEmployee(WorkerBase worker) {
        this.staff.add(worker);
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator<WorkerBase> iterator() {
        return new EmployeeIterator(this.staff);
    }
}
