package edu.nps.moves.dis7.entities.mlt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3591009c;
 * Country: Malta (MLT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27571
 */
public class MineCountermeasureShipCraft extends EntityType
{
    /** Default constructor */
    public MineCountermeasureShipCraft()
    {
        setCountry(Country.MALTA_MLT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27571, Mine Countermeasure Ship/Craft
    }
}
