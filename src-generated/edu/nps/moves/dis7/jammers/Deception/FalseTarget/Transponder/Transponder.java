package edu.nps.moves.dis7.jammers.Deception.FalseTarget.Transponder;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class Transponder extends JammingTechnique
{
    /** Default constructor */
    public Transponder()
    {
        setKind((byte)2); // Deception
        setCategory((byte)65); // False Target
        setSubCategory((byte)25); // Transponder
    }
}
