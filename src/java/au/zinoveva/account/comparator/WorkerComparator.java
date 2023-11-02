package au.zinoveva.account.comparator;

import au.zinoveva.account.WorkerBase;

import java.util.Comparator;

/**
 * Компаратор по табельному номеру
 */
public class WorkerComparator implements Comparator<WorkerBase> {
    /**
     * Сравнение
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Результат сравнения
     */
    public int compare(WorkerBase o1, WorkerBase o2) {
        return o1.getTabnum() - o2.getTabnum();
    }
}
