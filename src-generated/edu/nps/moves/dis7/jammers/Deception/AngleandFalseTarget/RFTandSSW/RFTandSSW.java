package edu.nps.moves.dis7.jammers.Deception.AngleandFalseTarget.RFTandSSW;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class RFTandSSW extends JammingTechnique
{
    /** Default constructor */
    public RFTandSSW()
    {
        setKind((byte)2); // Deception
        setCategory((byte)20); // Angle and False Target
        setSubCategory((byte)15); // RFT and SSW
    }
}
