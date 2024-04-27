package myPackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class whiteboxTestPerformanceEvaluator {

    @Nested
    class PerformanceEvaluatorTest {

        private Employee emp;

        @BeforeEach
        void setUp() {
            // Initialize an Employee instance (customize the parameters)
            emp = new Employee(1, "Abanoub", "Samy ", 50000, "CEO", 5);
        }

        @Test
        void testAttendValidScore() {
            // Set initial attendance score
            PerformanceEvaluator.attend(emp, 0.5);
            assertEquals(0.5, emp.getAttScore(), 0.01);
        }

        @Test
        void testAttendInvalidScoreBelowZero() {
            // Attempt to set an invalid attendance score (below 0)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.attend(emp, -0.5));
        }

        @Test
        void testAttendInvalidScoreAboveOne() {
            // Attempt to set an invalid attendance score (above 1)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.attend(emp, 1.5));
        }

        @Test
        void testAppearValidScore() {
            // Set initial appearance score
            PerformanceEvaluator.appear(emp, 0.5);
            assertEquals(0.5, emp.getAppScore(), 0.01);
        }

        @Test
        void testAppearInvalidScoreBelowZero() {
            // Attempt to set an invalid appearance score (below 0)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.appear(emp, -0.5));
        }

        @Test
        void testAppearInvalidScoreAboveOne() {
            // Attempt to set an invalid appearance score (above 1)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.appear(emp, 1.5));
        }

        @Test
        void testWorkDeliverValidScore() {
            // Set initial work delivery score
            PerformanceEvaluator.workDeliver(emp, 0.5);
            assertEquals(0.5, emp.getWorkScore(), 0.01);
        }

        @Test
        void testWorkDeliverInvalidScoreBelowZero() {
            // Attempt to set an invalid work delivery score (below 0)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.workDeliver(emp, -0.5));
        }

        @Test
        void testWorkDeliverInvalidScoreAboveOne() {
            // Attempt to set an invalid work delivery score (above 1)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.workDeliver(emp, 1.5));
        }

        @Test
        void testBehaveValidScore() {
            // Set initial behavior score
            PerformanceEvaluator.behave(emp, 0.5);
            assertEquals(0.5, emp.getBehScore(), 0.01);
        }

        @Test
        void testBehaveInvalidScoreBelowZero() {
            // Attempt to set an invalid behavior score (below 0)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.behave(emp, -0.5));
        }

        @Test
        void testBehaveInvalidScoreAboveOne() {
            // Attempt to set an invalid behavior score (above 1)
            assertThrows(IllegalArgumentException.class, () -> PerformanceEvaluator.behave(emp, 1.5));
        }

        @Test
        void testCalculateScore() {
            // Set known scores (attendance, appearance, behavior, work)
            PerformanceEvaluator.attend(emp, 0.5);
            PerformanceEvaluator.appear(emp, 0.5);
            PerformanceEvaluator.workDeliver(emp, 0.5);
            PerformanceEvaluator.behave(emp, 0.5);

            double calculatedScore = PerformanceEvaluator.calculateScore(emp);
            assertEquals(0.5, calculatedScore, 0.01);
        }

        @Test
        void testDeterminePerformanceLevel() {
            // Test different score values and verify the performance level
            PerformanceEvaluator.attend(emp, 0.5);
            PerformanceEvaluator.appear(emp, 0.5);
            PerformanceEvaluator.workDeliver(emp, 0.5);
            PerformanceEvaluator.behave(emp, 0.5);

            double calculatedScore = PerformanceEvaluator.calculateScore(emp);
            PerformanceEvaluator.PerformanceLevel performanceLevel = PerformanceEvaluator.determinePerformanceLevel(calculatedScore * 4);
            assertEquals(PerformanceEvaluator.PerformanceLevel.BELOW_AVERAGE, performanceLevel);
        }
    }
}