package org.cvtc.UnitTests.shapes.messaging;

import org.cvtc.shapes.messaging.Dialog;

public class MessageBoxSub implements Dialog{

	@Override
	public int show(String message, String title) {
		return 0;
	}
	
}