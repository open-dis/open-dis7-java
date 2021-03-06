package edu.nps.moves.dis7.jammers.Deception.PulseCompressionDeception;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class PulseCompressionDeception extends JammingTechnique
{
    /** Default constructor */
    public PulseCompressionDeception()
    {
        setKind((byte)2); // Deception
        setCategory((byte)115); // Pulse Compression Deception
    }
}
