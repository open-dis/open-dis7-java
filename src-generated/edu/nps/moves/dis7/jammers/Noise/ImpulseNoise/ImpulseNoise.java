package edu.nps.moves.dis7.jammers.Noise.ImpulseNoise;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class ImpulseNoise extends JammingTechnique
{
    /** Default constructor */
    public ImpulseNoise()
    {
        setKind((byte)1); // Noise
        setCategory((byte)40); // Impulse Noise
    }
}
