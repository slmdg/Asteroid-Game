package Commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.Interfaces.IGameWorld;

public class DecelerateCommand extends Command{
private IGameWorld gw;
	
	public DecelerateCommand(IGameWorld gw) {
		super("Decelerate");
		this.gw = gw;
		
	}
	public void actionPerformed(ActionEvent e) {
		gw.Decelerate();
		
		
	}


}
