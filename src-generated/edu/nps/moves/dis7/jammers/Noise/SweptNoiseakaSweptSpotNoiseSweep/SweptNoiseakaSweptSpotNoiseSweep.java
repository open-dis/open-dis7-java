package edu.nps.moves.dis7.jammers.Noise.SweptNoiseakaSweptSpotNoiseSweep;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class SweptNoiseakaSweptSpotNoiseSweep extends JammingTechnique
{
    /** Default constructor */
    public SweptNoiseakaSweptSpotNoiseSweep()
    {
        setKind((byte)1); // Noise
        setCategory((byte)80); // Swept Noise (aka Swept Spot Noise, Sweep)
    }
}
