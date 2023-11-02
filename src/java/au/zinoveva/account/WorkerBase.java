package au.zinoveva.account;

import au.zinoveva.account.comparator.WorkerComparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Базовый класс сотрудников
 */
@Getter
@Setter
@AllArgsConstructor
public abstract class WorkerBase implements Comparable<WorkerBase> {
    /**
     * Имя
     */
    private String name;

    /**
     * Табельный номер
     */
    private int tabnum;
    /**
     * Ставка
     */
    float rate = 0f;

    /**
     * Расчет зп.
     * @return Результат расчета
     */
    public abstract float calculateWages();

    /**
     * Сравнение
     * @param o Объект для сравнения
     * @return Результат сравнения
     */
    public int compareTo(WorkerBase o) {
        return new WorkerComparator().compare(this, o);
    }
}