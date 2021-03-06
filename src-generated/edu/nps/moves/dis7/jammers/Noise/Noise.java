package edu.nps.moves.dis7.jammers.Noise;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class Noise extends JammingTechnique
{
    /** Default constructor */
    public Noise()
    {
        setKind((byte)1); // Noise
    }
}
