package simulation;

public abstract class Collision extends AbstractEvent{
    
    int c, k;
    double time;
    Particle[] particle;
    int[] prevCollision;   //i assume we need this since the outline says that we need to keep track of prior collisions
	
	

    
    public Collision(double t, Particle[] ps) 
    {
    super(t);
    this.time = t;
    this.particle = ps;
    this.prevCollisions = new int[particle.length];
    	//collisions count for particle to compare later
    for (c=0; c < particle.length; c++) 
    {
    	this.prrvCollisions[c] = particle[c].collisions();
    }
    }

    /**
     * Returns true if this Collision is (still) valid.
     */
    @Override
    public boolean isValid() 
    {
  	//for each particle in collision
    	for (k=0; k<particle.length; k++)
        {
    		//compare collisions count at prediction to that at collision 
    	  if(particle[k].collisions()!=prevCollisions[k]) 
          {
    		return false;
    	  }
    	}
        return true;
    }

    /**
     * Returns an array containing the Particles involved in this Collision.
     */
    public Particle[] getParticles() {
      
        return particle;                                      //I assume return particles array
    }
}
