
package simulation;

public class TwoParticleCollision extends Collision {
	
	Particle particleOne;
	Particle particleTwo;
	
	public TwoParticleCollision(Particle p1, Particle p2, double t)
        {   
        super(t, new Particle[] p1, p2);  //not sure about that
        this.time = t;
	this.particle1 = p1;
	this.particle2 = p2;  
	}

	@Override
	public void happen(ParticleEventHandler h) 
	{
	Particle.collide(particle1, particle2);
	h.reactTo(this);	
	}
	
}