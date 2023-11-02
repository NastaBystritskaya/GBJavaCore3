package au.zinoveva.account;

/**
 * Фрилансер
 */
public class Freelancer extends WorkerBase {

    /**
     * Конструктор
     * @param name Имя
     * @param tabnum Табельный номер
     * @param rate Базовая ставка
     */
    public Freelancer(String name, int tabnum, float rate) {
        super(name, tabnum, rate);
    }

    /**
     * Расчет зп.
     * @return Результат расчета
     */
    public float calculateWages() {
        return 20.8f * 8f * this.getRate();
    }

    /**
     * Строчное представление сотрудника
     * @return Представление
     */
    @Override
    public String toString() {
        return """
        Наемный рабочий:
            Имя: %s,
            Таб. номер: %d
            ср. зп: %.2f
    """.formatted(this.getName(), this.getTabnum(), this.calculateWages());
    }
}
