
public class DayPassCommand implements ITicketTypeCommand {
	IMenuReceiver rcv;
	@Override
	public void setReceiver(IMenuReceiver rcv) {
		this.rcv = rcv;
	}

	@Override
	public void execute() {
		rcv.doAction();
	}

}
