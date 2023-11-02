package au.zinoveva.account;

/**
 * Наемный рабочий
 */
public class Worker extends WorkerBase{

    /**
     * Конструктор
     * @param name Имя
     * @param tabnum Табельный номер
     * @param rate Базовая ставка
     */
    public Worker(String name, int tabnum, float rate) {
        super(name, tabnum, rate);
    }

    /**
     * Расчет зп.
     * @return Результат расчета
     */
    public float calculateWages() {
        return this.getRate();
    }

    /**
     * Строчное представление сотрудника
     * @return Представление
     */
    @Override
    public String toString() {
        return """
        Фрилансер:
            Имя: %s,
            Таб. номер: %d
            ср. зп: %.2f
    """.formatted(this.getName(), this.getTabnum(), this.calculateWages());
    }
}
