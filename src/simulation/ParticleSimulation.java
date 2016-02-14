package simulation;
import utils.MinPriorityQueue;

//no idea how to do this

import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;
import utils.MinPriorityQueue;

public class ParticleSimulation implements Runnable, ParticleEventHandler{

    private static final long FRAME_INTERVAL_MILLIS = 40;
    
    private final ParticlesModel          model;
    private final ParticlesView           screen;
    
    double time;
    MinPriorityQueue<Event> eventQ;
    /**
     * Constructor.
     */
    public ParticleSimulation(String name, ParticlesModel m) 
   {
        this.model = m;
	this.time = 0.0;
	Tick tick = new Tick(0);
    	screen = new ParticlesView(name, m);
    	eventQ = new MinPriorityQueue<Event>();
    	
    	eventQ.add(tick);
    	//create queue of all predicted collisions
    /* TO DO*/

    	}
   

    /**
     * Runs the simulation.
     */
    @Override
    public void run() {
        try {
            SwingUtilities.invokeAndWait(screen);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        while(eventQ.size() > 0) 
	{
	//remove priority event from queue and process
	   /* TO DO*/
 	}
    }

	
    @Override
    public void reactTo(Tick tick)
    {
     Tick newTick = new Tick(tick.time() + 1);
     eventQ.add(newTick);
    }

    @Override
    public void reactTo(Collision col)
    {
    //create new predicted collisions and add to queue
     /* TO DO*/
    }

}
