package day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void newEmployeesGetConsecutiveIds() {
        Employee first = new Employee("Asha");
        Employee second = new Employee("Ben");
        assertEquals(first.getId() + 1, second.getId(),
                "The employee created right after another should get the next id (previous id + 1)");
    }

    @Test
    void countIncreasesByExactlyTwoAfterCreatingTwo() {
        int before = Employee.getEmployeeCount();
        new Employee("Cara");
        new Employee("Dev");
        assertEquals(before + 2, Employee.getEmployeeCount(),
                "Creating two employees should raise the total count by exactly 2");
    }

    @Test
    void storesTheName() {
        Employee e = new Employee("Elena");
        assertEquals("Elena", e.getName(), "getName() should return the name passed to the constructor");
    }

    @Test
    void eachEmployeeKeepsItsOwnId() {
        Employee a = new Employee("Finn");
        int aId = a.getId();
        new Employee("Gita");
        assertEquals(aId, a.getId(), "An employee's id must not change when a later employee is created");
    }
}
