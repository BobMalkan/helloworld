package com.strands.interviews.eventsystem;

public class NewEvent implements InterviewEvent {
private Object source;
	@Override
	public Object getSource() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public NewEvent(Object source)
    {
        this.source = source;
    }

}
