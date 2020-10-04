package edu.nps.moves.dis7.jammers.Noise.SweptNoiseakaSweptSpotNoiseSweep.SweptAM;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * Jamming technique uid: 284
 */
public class SweptAM extends JammingTechnique
{
    public SweptAM()
    {
        setKind((byte)1); // Noise
        setCategory((byte)80); // Swept Noise (aka Swept Spot Noise, Sweep)
        setSubCategory((byte)10); // Swept AM
    }
}
