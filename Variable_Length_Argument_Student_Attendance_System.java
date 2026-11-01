class Variable_Length_Argument_Student_Attendance_System {
    void markAttendance(String studentName, String... attendanceDays) {
        System.out.println("Student Name: " + studentName);
        System.out.println("Days Present:");

        for (String day : attendanceDays) {
            System.out.println(day);
        }

        System.out.println("Total Days Present: " + attendanceDays.length);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {

        Variable_Length_Argument_Student_Attendance_System obj = new Variable_Length_Argument_Student_Attendance_System();

        obj.markAttendance("Ruchika", "Monday", "Tuesday", "Friday");

        obj.markAttendance("Sanjh", "Monday", "Wednesday");

        obj.markAttendance("Ritika", "Tuesday", "Thursday", "Saturday", "Sunday");
    }
}
