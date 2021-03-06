package edu.nps.moves.dis7.jammers.Deception.AngleandVelocity;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class AngleandVelocity extends JammingTechnique
{
    /** Default constructor */
    public AngleandVelocity()
    {
        setKind((byte)2); // Deception
        setCategory((byte)30); // Angle and Velocity
    }
}
