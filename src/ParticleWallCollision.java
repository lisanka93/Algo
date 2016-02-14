package simulation;

public class ParticleWallCollision extends Collision {
	
	public Particle particle;
	public Wall wall;
	
	public ParticleWallCollision(Particle par, Wall w, double t ) 
	{        
	super(t, new Particle[] p);  //not sure about that
	this.time = t;
	this.particle = p;
	this.wall = w; 
	}

	@Override
	public void happen(ParticleEventHandler h) 
	{
	Particle.collide(this.particle, this.wall);
	h.reactTo(this);
	}

}
