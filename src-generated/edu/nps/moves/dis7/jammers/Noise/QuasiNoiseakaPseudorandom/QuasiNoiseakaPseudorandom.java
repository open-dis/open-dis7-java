package edu.nps.moves.dis7.jammers.Noise.QuasiNoiseakaPseudorandom;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class QuasiNoiseakaPseudorandom extends JammingTechnique
{
    /** Default constructor */
    public QuasiNoiseakaPseudorandom()
    {
        setKind((byte)1); // Noise
        setCategory((byte)60); // Quasi-Noise (aka Pseudorandom)
    }
}
