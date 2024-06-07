public class Main {
    public static void main(String[] args) {
        String input = "A1 09 02 F6 FD A7 66 66 46 40 64 1C 9B E3 80 0F 00 20 89 41 00 08 87 56 00 08 AF 55 00 08 85 56 00 08 B7 42 00 08 C9 5A 00 08 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 D7 56 00 08 EF 42 00 08 00 00 00 00 BF 56 00 08 D9 56 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 B9 42 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 B1 5A 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 A3 41 00 08 00 F0 02 F8 00 F0 3A F8 0A A0 90 E8 00 0C 82 44 83 44 AA F1 01 07 DA 45 01 D1 00 F0 2F F8 AF F2 09 0E BA E8 0F 00 13 F0 01 0F 18 BF FB 1A 43 F0 01 03 18 47 14 1B 00 00 34 1B 00 00 10 3A 24 BF 78 C8 78 C1 FA D8 52 07 24 BF 30 C8 30 C1 44 BF 04 68 0C 60 70 47 00 00 00 23 00 24 00 25 00 26 10 3A 28 BF 78 C1 FB D8 52 07 28 BF 30 C1 48 BF 0B 60 70 47 1F B5 1F BD 10 B5 10 BD 00 F0 6B F8 11 46 FF F7 F7 FF 01 F0 25 FD 00 F0 89 F8 03 B4 FF F7 F2 FF 03 BC 00 F0 91 F8 00 00 09 48 80 47 09 48 00 47 FE E7 FE E7 FE E7 FE E7 FE E7 FE E7 FE E7 FE E7 FE E7 FE E7 04 48 05 49 05 4A 06 4B 70 47 00 00 3B 57 00 08 ED 40 00 08 80 09 00 20 80 0F 00 20 80 0B 00 20 80 0B 00 20 B2 F1 20 03 0A D5 C2 F1 20 03 20 FA 02 F0 01 FA 03 F3 21 FA 02 F1 40 EA 03 00 70 47 21 FA 03 F0 4F F0 00 01 70 47 4F F0 00 02 00 B5 13 46 94 46 96 46 20 39 22 BF A0 E8 3E 66";
        String[] sArray = input.split(" ");

        System.out.println("length: " + sArray.length);
        System.out.println();

        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = "0x" + sArray[i];

            System.out.print(sArray[i] + " ");

            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }
    }
}