package myPackage;




public class PerformanceEvaluator {

    

    
    
    public static void attend(Employee employee, double att) {


        if (att < 0 || att > 1) {
            throw new IllegalArgumentException("Score should be between 0 and 1");
        }
        employee.addAttendance(att);
    }

    public static void appear(Employee employee, double app) {
        if (app < 0 || app > 1) {
            throw new IllegalArgumentException("Score should be between 0 and 1");
        }
        employee.addAppearance(app);
    }

    public static void workDeliver(Employee employee, double work) {
        if (work < 0 || work > 1) {
            throw new IllegalArgumentException("Score should be between 0 and 1");
        }
        employee.addWork(work);
    }

    public static void behave(Employee employee, double beh) {
        if (beh < 0 || beh > 1) {
            throw new IllegalArgumentException("Score should be between 0 and 1");
        }
        employee.addBehavior(beh);
    }

public static double calculateScore(Employee employee) {
    return (employee.getAppScore() + employee.getAttScore() + employee.getBehScore() + employee.getWorkScore()) / 4.0;
}

public enum PerformanceLevel {
    EXCELLENT, GOOD, VERY_GOOD, AVERAGE, BELOW_AVERAGE
}

public static PerformanceLevel determinePerformanceLevel(double score) {
    if (score >= 17) {
        return PerformanceLevel.EXCELLENT;
    } else if (score >= 15) {
        return PerformanceLevel.VERY_GOOD;
    } else if (score >= 13) {
        return PerformanceLevel.GOOD;
    } else if (score >= 11) {
        return PerformanceLevel.AVERAGE;
    } else {
        return PerformanceLevel.BELOW_AVERAGE;
    }
}
  


}
