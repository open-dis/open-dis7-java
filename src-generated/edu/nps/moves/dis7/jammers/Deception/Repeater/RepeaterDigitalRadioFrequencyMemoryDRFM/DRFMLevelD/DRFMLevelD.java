package edu.nps.moves.dis7.jammers.Deception.Repeater.RepeaterDigitalRadioFrequencyMemoryDRFM.DRFMLevelD;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class DRFMLevelD extends JammingTechnique
{
    /** Default constructor */
    public DRFMLevelD()
    {
        setKind((byte)2); // Deception
        setCategory((byte)130); // Repeater
        setSubCategory((byte)30); // Repeater Digital Radio Frequency Memory (DRFM)
        setSpecific((byte)4); // DRFM Level D
    }
}
