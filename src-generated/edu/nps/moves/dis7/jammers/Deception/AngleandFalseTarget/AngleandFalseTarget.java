package edu.nps.moves.dis7.jammers.Deception.AngleandFalseTarget;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class AngleandFalseTarget extends JammingTechnique
{
    /** Default constructor */
    public AngleandFalseTarget()
    {
        setKind((byte)2); // Deception
        setCategory((byte)20); // Angle and False Target
    }
}
