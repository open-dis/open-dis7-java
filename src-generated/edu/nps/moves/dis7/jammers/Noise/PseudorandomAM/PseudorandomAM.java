package edu.nps.moves.dis7.jammers.Noise.PseudorandomAM;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class PseudorandomAM extends JammingTechnique
{
    /** Default constructor */
    public PseudorandomAM()
    {
        setKind((byte)1); // Noise
        setCategory((byte)50); // Pseudorandom AM
    }
}
