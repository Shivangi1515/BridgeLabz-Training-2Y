public class PenDistribution {
    public static void main(String[] args) {
        // Given values
        int totalPens = 14;
        int totalStudents = 3;

        // Pens per student (integer division)
        int pensPerStudent = totalPens / totalStudents;

        // Remaining pens (modulus)
        int remainingPens = totalPens % totalStudents;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
