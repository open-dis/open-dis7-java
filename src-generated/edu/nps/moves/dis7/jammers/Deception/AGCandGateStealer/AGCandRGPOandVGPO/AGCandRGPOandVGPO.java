package edu.nps.moves.dis7.jammers.Deception.AGCandGateStealer.AGCandRGPOandVGPO;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class AGCandRGPOandVGPO extends JammingTechnique
{
    /** Default constructor */
    public AGCandRGPOandVGPO()
    {
        setKind((byte)2); // Deception
        setCategory((byte)40); // AGC and Gate Stealer
        setSubCategory((byte)15); // AGC and RGPO and VGPO
    }
}
