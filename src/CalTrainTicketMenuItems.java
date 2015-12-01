import java.util.HashMap;
import java.util.Map;

public class CalTrainTicketMenuItems implements ICalTrainTicketMenu{
	Map<String, ITicketTypeCommand> map = new HashMap<>();
	
	public void setEntryInMap(String key, ITicketTypeCommand value) {
		map.put(key, value);
	}
	
	public void invoke(String key) {
		if(map.containsKey(key)) {
			ITicketTypeCommand cmd = map.get(key);
			cmd.execute();
		}
	}

}
