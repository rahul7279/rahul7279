public class AdmissionEligibility {

    public static void main(String[] args) {
        // Example marks for a candidate
        int mathMarks = 65;
        int physicsMarks = 55;
        int chemistryMarks = 45;

        // Check eligibility
        boolean isEligible = checkEligibility(mathMarks, physicsMarks, chemistryMarks);

        // Print result
        if (isEligible) {
            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }
    }

    public static boolean checkEligibility(int math, int physics, int chemistry) {
        // Condition (a), (b), and (c)
        if (math >= 60 && physics >= 50 && chemistry >= 40) {
            // Condition (d)
            if ((math + physics + chemistry) >= 200 || (math + physics) >= 150) {
                return true;
            }
        }
        return false;
    }
}
