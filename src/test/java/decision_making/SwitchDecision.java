package decision_making;

import org.testng.annotations.Test;

public class SwitchDecision {

    @Test
    public void testSwitch() {
        int iDay = 1;

        switch (iDay) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday");
                break;
        }
    }
}
