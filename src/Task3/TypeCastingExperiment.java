package Task3;

public class TypeCastingExperiment {
    public static void main(String[] args) {
        System.out.println("=== EKSPERIMEN TYPE CASTING ===");

        // 1. Implicit Casting (Widening)
        int intValue = 100;
        long longValue = intValue; // Automatic conversion
        double doubleValue = longValue; // Automatic conversion

        System.out.println("\n[1] Implicit Casting:");
        System.out.println("int: " + intValue + " -> long: " + longValue + " -> double: " + doubleValue);

        // 2. Explicit Casting (Narrowing) - Tanpa Data Loss
        double preciseValue = 123.0;
        int convertedInt = (int) preciseValue;

        System.out.println("\n[2] Explicit Casting (no data loss):");
        System.out.println("double: " + preciseValue + " -> int: " + convertedInt);

        // 3. Explicit Casting - Dengan Data Loss
        double decimalValue = 123.789;
        int truncatedInt = (int) decimalValue;

        System.out.println("\n[3] Explicit Casting (with data loss):");
        System.out.println("double: " + decimalValue + " -> int: " + truncatedInt);

        // 4. Overflow Example
        int largeInt = 300;
        byte overflowByte = (byte) largeInt;

        System.out.println("\n[4] Overflow Example:");
        System.out.println("int: " + largeInt + " -> byte: " + overflowByte);

        // 5. Convert long ke int dengan nilai besar
        long bigLong = 2_147_483_648L; // 1 lebih dari Integer.MAX_VALUE
        int overflowInt = (int) bigLong;

        System.out.println("\n[5] Convert long ke int (overflow):");
        System.out.println("long: " + bigLong + " -> int: " + overflowInt);

        // 6. Convert float ke int
        float floatValue = 123.456f;
        int intFromFloat = (int) floatValue;

        System.out.println("\n[6] Convert float ke int:");
        System.out.println("float: " + floatValue + " -> int: " + intFromFloat);

        // 7. Convert double ke float
        double bigDouble = 123456789.123456789;
        float floatFromDouble = (float) bigDouble;

        System.out.println("\n[7] Convert double ke float:");
        System.out.println("double: " + bigDouble + " -> float: " + floatFromDouble);

        // ANALISIS DATA LOSS
        System.out.println("\n=== ANALISIS DATA LOSS ===");
        System.out.println("[1] int -> long -> double: ❌ Tidak ada data loss (implicit casting)");
        System.out.println("[2] double (123.0) -> int: ❌ Tidak ada data loss (desimal 0)");
        System.out.println("[3] double (123.789) -> int: ✅ Data loss (desimal hilang)");
        System.out.println("[4] int (300) -> byte: ✅ Data loss (overflow, byte hanya -128 s/d 127)");

        System.out.println("\n=== Selesai ===");
    }
}
