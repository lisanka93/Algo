package simulation;

public abstract class Collision extends AbstractEvent{
    
    double time;
    Particle[] particles;
    int[] priorCollision;   //i assume we need this since the outline says that we need to keep track of prior collisions
	
	
    /*NEEDS TO BE DONE*/
    
    public Collision(double t, Particle[] ps) {
        // TODO implement constructor
    }

    /**
     * Returns true if this Collision is (still) valid.
     */
    @Override
    public boolean isValid() {
        // TODO implement his method
        return false;
    }

    /**
     * Returns an array containing the Particles involved in this Collision.
     */
    public Particle[] getParticles() {
        // TODO implement this method
        return null;                                      //I assume return particles
    }
}
