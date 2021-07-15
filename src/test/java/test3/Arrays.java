package test3;

public class Arrays {
    public static void main(String[] args) {
//        int[] rooms = {4, 34, 48, 9, 8, 7};
//
//        for (int i = 0; i < rooms.length; i++) {
//            System.out.println(rooms[i]);
//
//        }
        String text = "где  желает желает знать Каждый охотник сидит фазан";
//
        String[] colors = text.split(",?\\s+");
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//
//        }
        int[] winTickets = new int[10];
        int[] ticketNumber = new int[1000];
        for (int i = 0; i < ticketNumber.length; i++) {
            int value = ticketNumber[i] = 1000000 + (int) Math.round(100000 * Math.random());
            ticketNumber[i] = value;
            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }
        }
        for (int colorIndex = 0; colorIndex < colors.length; colorIndex++)
        {
            if (colorIndex>0 && colors[colorIndex].equals(colors[colorIndex-1])){
                continue;
            }

            System.out.println(colors[colorIndex]);

        }

        for (int winTicket : winTickets) {
//            System.out.println(winTicket);

        }
        for (String color : colors) {
//            System.out.println(color);

        }

    }
}
