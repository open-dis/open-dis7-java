package edu.nps.moves.dis7.jammers.Deception.Angle.AngleGateWalkOff;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class AngleGateWalkOff extends JammingTechnique
{
    /** Default constructor */
    public AngleGateWalkOff()
    {
        setKind((byte)2); // Deception
        setCategory((byte)10); // Angle
        setSubCategory((byte)5); // Angle Gate Walk-Off
    }
}
