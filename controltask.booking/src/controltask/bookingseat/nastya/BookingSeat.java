package controltask.bookingseat.nastya;

public class BookingSeat {

	public static void main(String[] args) {

		int rows = 5;
		int seats = 6;
		char[][] hall = new char[rows][seats];

		for (int i = 0; i < hall.length; i++) {
			for (int j = 0; j < hall[i].length; j++) {
				hall[i][j] = 'F';
			}
		}
		displayHall(hall);
		bookSeat(hall,2,4);
		bookSeat(hall,2,4);
		cancelBooking(hall,2,4);
		countSeats(hall);
	}

	public static void displayHall(char[][] hall) {

		System.out.println("\n         Hall");
		System.out.println("  ------------------");
		System.out.print("     ");
		for ( int j = 1; j<= hall[0].length;j++) {
			System.out.print(j + " ");
		}
		System.out.println("\n    --------------");

		for (int i = 0; i < hall.length; i++) {
			System.out.print("row" + (i + 1)+ "|");
			for (int j = 0; j < hall[i].length; j++) {
				System.out.print(hall[i][j] + " ");

			}
			System.out.println("|");
		}
		System.out.println("    --------------");
	}
	
	
	public static void bookSeat (char[][] hall, int row, int seat) {
		
		if ( hall [row - 1][seat -1] == 'F') {
			hall[row-1][seat-1] = 'B';
			System.out.println("Row" + row + "Seat" + seat + "-> Successfully booked (B)");
		}else {
			System.out.println("Row" + row + "Seat" + seat + "-> Error, already booked");
		}
	}
	public static void cancelBooking(char[][]hall, int row, int seat) {
		if ( hall[row-1][seat-1] == 'B') {
			hall[row-1][seat-1] = 'F';
			System.out.println("Row" + row + "Seat" + seat + "-> The reservation was cancelled");
		}else {
			System.out.println("Row" + row + "Seat" + seat + "-> Error (the space is already free)");
		}
	}
		
		public static void countSeats (char[][] hall) {
			
			int free = 0;
			int booked = 0;
			 for(char[]row : hall) {
				 for (char seat : row) {
					 if ( seat == 'F') free++;
					 else if (seat == 'B') booked++;
					
				 }
			 }
		System.out.println("\nFree seats:" + free);
		System.out.println("Booked seats:" + booked);
		
	
	}

}
