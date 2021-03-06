package edu.nps.moves.dis7.jammers.Deception.Repeater.ContinuousWaveRepeater;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class ContinuousWaveRepeater extends JammingTechnique
{
    /** Default constructor */
    public ContinuousWaveRepeater()
    {
        setKind((byte)2); // Deception
        setCategory((byte)130); // Repeater
        setSubCategory((byte)5); // Continuous Wave Repeater
    }
}
