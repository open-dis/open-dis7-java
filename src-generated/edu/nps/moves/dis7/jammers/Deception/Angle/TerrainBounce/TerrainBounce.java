package edu.nps.moves.dis7.jammers.Deception.Angle.TerrainBounce;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class TerrainBounce extends JammingTechnique
{
    /** Default constructor */
    public TerrainBounce()
    {
        setKind((byte)2); // Deception
        setCategory((byte)10); // Angle
        setSubCategory((byte)45); // Terrain Bounce
    }
}
