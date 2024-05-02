package week2.maasHesaplayici;

public class Employee {
    // fields
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;


    // constructor method :
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    // tax method:
    public double tax() {
        if (this.salary > 1000.0) {
            return salary * 0.03;
        } else {
            return 0;
        }
    }
    // bonus() method
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    // raiseSalary() :
    public double raiseSalary() {
        int yearsWorked = currentYear - hireYear;
        if ( yearsWorked < 10) {
            return salary * 0.05;
        } else if ( yearsWorked > 9 && yearsWorked < 20 ) {
            return salary * 0.10;
        } else  if (yearsWorked > 19) {
            return salary * 0.15;

        }  return 0;
    }
    // total salary method
    public double totalSalary() {
        return (this.salary + bonus() + raiseSalary()  - tax());
    }
    // salary account with tax and bonus
    public double taxAndBonusSalary() {
        return (this.salary+bonus()-tax());
    }

    // toStringPrint method written to output to the screen:
    public void toStringPrint() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxAndBonusSalary());
        System.out.println("Toplam Maaş : " + totalSalary());

    }
}
