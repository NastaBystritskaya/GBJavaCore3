package au.zinoveva;

import au.zinoveva.account.Freelancer;
import au.zinoveva.account.Worker;
import au.zinoveva.account.WorkerBase;
import au.zinoveva.account.comparator.WorkerComparator;
import au.zinoveva.staff.Staff;

public class Main {

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.addEmployee(new Worker("Иван", 3, 23.5f));
        staff.addEmployee(new Freelancer("Марина", 2, 24.5f));
        staff.addEmployee(new Worker("Виолета", 1, 25.5f));
        staff.addEmployee(new Freelancer("Марк", 4, 26.5f));

        staff.getStaff().sort(new WorkerComparator());
        for (WorkerBase worker: staff) {
            System.out.println(worker);
        }
    }
}
