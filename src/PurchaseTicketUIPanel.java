
public class PurchaseTicketUIPanel {

	public static void main(String[] args) {
		ITicketTypeCommand cmd_1 = new SingleTripCommand();
		ITicketTypeCommand cmd_2 = new TwoWayTripCommand();
		ITicketTypeCommand cmd_3 = new DayPassCommand();
		
		cmd_1.setReceiver(new IMenuReceiver() {
			
			@Override
			public void doAction() {
				System.out.println("Single Trip chosen, price is according to the zone now.");
			}
		});
		
		cmd_2.setReceiver(new IMenuReceiver() {
			
			@Override
			public void doAction() {
				System.out.println("Two Trip chosen, price is according to the zone now and return trip");
				
			}
		});
		
		cmd_3.setReceiver(new IMenuReceiver() {
			
			@Override
			public void doAction() {
				System.out.println("Fixed Price 20$ of day pass to be paid");
				
			}
		});
		
		ICalTrainTicketMenu menu = new CalTrainTicketMenuItems();
		menu.setEntryInMap("Single Trip", cmd_1);
		menu.setEntryInMap("Two way Trip", cmd_2);
		menu.setEntryInMap("Day Pass", cmd_3);
		
		String userChoice = "Day Pass";
		menu.invoke(userChoice);
		
		
		
		
	}

}
